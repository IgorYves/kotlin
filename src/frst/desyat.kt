package frst

interface User2{
    val nik: String
}
class PrivUser(override val nik: String) : User2
class SubscrUser(val email: String) : User2 {
    override val nik: String
        get() = email.substringBefore("@")
}
class FacebookUser(val accId: String) : User2 {
    override var nik = getFacebookName(accId)

}

fun getFacebookName(accId: String): String{
    return "name$accId"
}

fun main(args: Array<String>) {
    val user1 = FacebookUser("12")
    println(user1.nik)
    user1.nik = "66"
    println(user1.nik)
    println()
    val usr = User8("Alice")
    usr.adress = "paris 75001"
    println()
    val wlCounter = WordsLehgth()
    wlCounter.addWord("bla")
    println(wlCounter.count)
    wlCounter.addWord("lorem")
    println(wlCounter.count)

}

class User8(val name: String){
    var adress: String = "unknown"
        set(value: String) {
            println("""
                Address vas changed for $name :
                "$field" -> "$value".
            """.trimIndent())
            field = value
        }
}

class WordsLehgth {
    var count: Int = 0
        private set

    fun addWord(word: String){
        count += word.length
    }
}