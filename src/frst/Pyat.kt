package frst

fun fizBuz(i: Int) = when {
    i % 15 == 0 -> "FizBuz"
    i % 3 == 0  -> "Fiz"
    i % 5 == 0  -> "Buz"
    else        -> "$i"
}

fun main(args: Array<String>) {
    for (i in 100 downTo 1 step 2) {
        println(fizBuz(i))
    }
}



