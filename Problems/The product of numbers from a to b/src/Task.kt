import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val numA = scanner.nextInt()
    val numB = scanner.nextInt()
    val range = numA until numB
    val numbers = mutableListOf<Int>()
    var result: Long = 1
    for (n in range) {
        numbers.add(n)
    }
    for (i in numbers) {
        result *= i
    }
    print(result)
}