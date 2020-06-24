import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    val numbers = IntArray(num)
    for (n in 0 until num) numbers[n] = scanner.nextInt()
    print(numbers.min())
}