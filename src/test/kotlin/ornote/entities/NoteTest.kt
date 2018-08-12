package ornote.entities

import org.hamcrest.core.Is.`is`
import org.junit.Assert.*
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

class NoteTest : Spek({
    describe("A note"){
        val note = Note(Author("123", "Omelkor"), "hola", "test")
        context("Doing nothing"){
            it("should not change state"){
                assertThat(note.title, `is`("hola"))
            }
            it("should sad"){
                assertThat("", `is`(""))
            }
        }

    }

})