package frst

import frst.JSecond
import java.util.*

fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("salut $name")
    val jS = JSecond()
    println(jS.v)
//    for (i in 1..100) {
//        print(createRndRect().isSquare)
//    }
    print(mix(Color.RED, Color.YELLOW))
}

fun max(a: Int, b: Int): Int {
    return if (a>b) a else b
}

fun max2(a: Int, b: Int): Int = if (a>b) a else b
fun max3(a: Int, b: Int) = if (a>b) a else b

/*public class frst.Person {
    private final String name;
    public frst.Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}*/
class Person(val name: String)
class Person2(val name: String,
                var isMarried: Boolean)


class Rectangle(val h: Int, val w: Int) {
    val isSquare: Boolean
        get() = h == w
}

fun createRndRect(): Rectangle {
    val rand = Random()
    return Rectangle(rand.nextInt(20), rand.nextInt(10))
}

