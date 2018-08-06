package ornote.entities

import org.hamcrest.CoreMatchers
import org.hamcrest.core.Is.`is`
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.*
import org.junit.Assert.*

class NoteTest : Spek({
    context("A note"){
        val note = Note(Author("123", "Omelkor"), "hola", "test")
        on("Doing nothing"){
            it("should not change state"){
                assertThat(note.title, `is`("hola"))
            }
            it("should sad"){
                assertThat("", `is`(""))
            }
        }

    }

})