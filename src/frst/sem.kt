@file:JvmName("Seven")
package frst

import java.lang.StringBuilder

fun recognise(c: Char) = when (c) {
    in '0'..'9' -> "digit"
    in 'a'..'z', in 'A'..'Z' -> "letter"
    else -> "non digit, non letter"
}


fun main(args: Array<String>) {
    val c: Char = '&'
    println("'$c' is : ${recognise(c)}")

    println("kot" in "abs".."zor")
    println("kot" in setOf<String>("abs", "zor"))

    System.out.println("salut")
    System.out.println("salut")

    val list = listOf<Int>(1,2,3,5,8,9,10)
    println(joinToString(list, prefix = "<", separator = "; ", postfix = ">"))
    println(joinToString(list))
    println(joinToString(list, "//"))

    println("lorem".lastChar2())
    var sb: StringBuilder = StringBuilder("dolor")
    println(sb.lastChart)
    sb.lastChart = '5'
    println(sb)

    println(0xcafe)

}
@JvmOverloads
fun<T> joinToString(collection: Collection<T>, separator: String = ", ", prefix: String = "<", postfix: String = ">"): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()){
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun String.lastChar(): Char = this.get(this.length-1)
fun String.lastChar2(): Char = get(length-1)

var StringBuilder.lastChart: Char
    get() = get(length-1)
    set(value: Char) {
        this.setCharAt(length-1, value)
    }
