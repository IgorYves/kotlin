package frst

//import Color

enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    YELLOW(255, 255, 0);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun getMnemonic(color: Color) = when (color) {
    Color.RED -> "kazhdiy"
    Color.YELLOW -> "zhelaet"
    Color.GREEN -> "znat"
    Color.BLUE -> "cidit"
}

fun getWarmth(color: Color) = when (color) {
    Color.RED, Color.YELLOW -> "tepliy"
    Color.GREEN, Color.BLUE -> "holodniy"
}

//fun getWarmth2(color: Color) = when (color) {
//    RED, YELLOW -> "tepliy"
//    GREEN, BLUE -> "holodniy"
//}

fun mix(c1:Color, c2:Color) =
        when (setOf(c1, c2)) {
            setOf(Color.RED, Color.YELLOW) -> "orange"
            setOf(Color.GREEN, Color.BLUE) -> "indigo"
            else -> throw Exception("pas bon")
        }

fun mixOptimz(c1:Color, c2:Color) =
        when {
            (c1 == Color.RED && c2 == Color.YELLOW) -> "orange"
            (c1 == Color.GREEN&& c2 == Color.BLUE) -> "indigo"
            else -> throw Exception("pas bon")
        }

