package frst

fun main(args: Array<String>) {
    println("result : ${eval(Sum(Sum(Num(1), Num(2)), Num(4)))}")


}

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e:Expr): Int =
        when (e) {
            is Num -> {
                println("num : ${e.value}")
                e.value
            }
            is Sum -> {
                val left = eval(e.left)
                val right = eval(e.right)
                println("sum : $left + $right = ${left + right}")
                left + right
            }
            else -> throw IllegalArgumentException("pas connu")
        }
