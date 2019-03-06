package frst

fun main(args: Array<String>) {
    val devyat = Devyat("nm")
    println(devyat)
}

class Devyat(val name: String)

class Dev2(name: String){
    val nik: String
    val name: String
    init {
        nik = name
        this.name = name
    }
}

class Dev3(val name: String, val Subscr: Boolean = true)

open class Button2
class RadioButton2: Button2()
class Secret private constructor() {}

open class Dev4 {
    val v: Int
    constructor(i: Int) {
        v = i
    }
}
class DDev4 : Dev4 {
    val v2: Int
    constructor(i: Int) : super(i) {
        v2 = 5
    }
}
class Dev5 {
    val ix:Int
    constructor(i: Int){
        ix = i
    }
    constructor(i: Int, b: Int): this(i) {
        val z = b
    }
}