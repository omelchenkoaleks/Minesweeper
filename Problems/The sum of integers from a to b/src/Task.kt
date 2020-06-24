import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    val before = scanner.nextInt()

    sumAllNumbersBefore(number, before)
}

fun sumAllNumbersBefore(number: Int, before: Int) {
    var counter = 0
    for (num in number..before) counter += num
    print(counter)
}