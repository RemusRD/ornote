package ornote.app

import io.ktor.server.netty.*
import io.ktor.routing.*
import io.ktor.application.*
import io.ktor.features.CORS
import io.ktor.features.ContentNegotiation
import io.ktor.features.DefaultHeaders
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.server.engine.*
import java.time.Duration

fun Application.main(){
        install(DefaultHeaders)
        install(CORS) {
            maxAge = Duration.ofDays(1)
        }

        routing {
            get("/") {
                println("Hola")
                call.respond("Hello, world!")
            }
        }
}

fun main(args: Array<String>) {
    embeddedServer(Netty, 8080, module = Application::main).start(wait = true)
}