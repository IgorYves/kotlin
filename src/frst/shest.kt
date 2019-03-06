package frst

import java.util.*

fun main(args: Array<String>) {
    val binaryR = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        binaryR[c] = Integer.toBinaryString(c.toInt())
    }

    for ((letter, binary) in binaryR) {
        println("$letter = $binary")
    }
    println()
    binaryR['A'] = "8"
    for ((letter, binary) in binaryR) {
        println("$letter = $binary")
    }
    println()
    binaryR['A'] = "9"
    binaryR['K'] = "5555"
    for ((letter, binary) in binaryR) {
        println("$letter = $binary")
    }

    fun isNonDigit(c: Char) = c !in '0'..'9'
    println(isNonDigit('8'))
    println(isNonDigit('h'))

}