import java.util.Scanner

const val MAKE_CHOICE = "Dial one of the colors of the rainbow!"

enum class Rainbow(private val number: Int) {
    RED(1),
    ORANGE(2),
    YELLOW(3),
    GREEN(4),
    BLUE(5),
    INDIGO(6),
    VIOLET(7);

    fun getNumber() = number
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    findNumberColorRainbow(input.nextLine())
}

fun findNumberColorRainbow(color: String) {
    when (color.toUpperCase()) {
        "RED" -> print(Rainbow.RED.getNumber())
        "ORANGE" -> print(Rainbow.ORANGE.getNumber())
        "YELLOW" -> print(Rainbow.YELLOW.getNumber())
        "GREEN" -> print(Rainbow.GREEN.getNumber())
        "BLUE" -> print(Rainbow.BLUE.getNumber())
        "INDIGO" -> print(Rainbow.INDIGO.getNumber())
        "VIOLET" -> print(Rainbow.VIOLET.getNumber())
        else -> print(MAKE_CHOICE)
    }
}