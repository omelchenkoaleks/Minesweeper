import java.util.*


fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val arrSize = scanner.nextInt()
    var indexesCounter = 0
    var result = 1
    var i = 0
    val section = IntArray(10)
    val numbers = IntArray(arrSize)
    for (index in 0..numbers.lastIndex) {
        numbers[index] = scanner.nextInt()
    }

    for ((index, value) in numbers.withIndex()) {
        indexesCounter++
        if (numbers.size == 1) {
            section[0] = 1
        }
        if (numbers.lastIndex >= indexesCounter) {
            if (value > numbers[indexesCounter]) {
                result = 1
                i++
            }
            if (value <= numbers[indexesCounter]) {
                result++
                section[i] = result
            }
        }
    }
    print(section.max())
}