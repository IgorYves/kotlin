package frst

import java.io.Serializable

interface State: Serializable

interface View {
    fun getCurrState(): State
    fun restoreState(state: State) {}
}

class Button: View {
    override fun getCurrState(): State = ButtonState()

    override fun restoreState(state: State) {
    }

    class ButtonState: State {
    }
}

fun main(args: Array<String>) {
    val but = Button()
    val user = User("luc")
    val tuser = TUser("skyw")

}

open class User(val nick: String) {}
class TUser(nick: String) : User(nick) {}
