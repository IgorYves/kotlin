package frst

class Client(val name: String, val postCode: Int){
    override fun toString() = "Client (name=$name, postCode=$postCode)"
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client)
            return false
        return name == other.name && postCode == other.postCode
    }

    override fun hashCode(): Int = name.hashCode()*31 + postCode
}

data class Client2(val name: String, val postCode: Int)

fun main(args: Array<String>) {
    val cl = Client("vasya", 75001)
    println(cl)
    val cl2  = Client("vasya", 75001)
    println(cl == cl2)
    println(cl === cl2)

    val cl3 = Client2("vasya", 75001)
    println(cl3)
    val cl4  = Client2("vasya", 75001)
    println(cl3 == cl4)
    println(cl3 === cl4)

    val cl5 = cl4.copy(name = "petya")
    println(cl5)
}