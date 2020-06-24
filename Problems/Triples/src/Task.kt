import java.util.*

val scanner = Scanner(System.`in`)
val arraySize = scanner.nextInt()
val array = IntArray(arraySize)

fun main(args: Array<String>) {

    for (i in 0..array.lastIndex) {
        array[i] = scanner.nextInt()
    }
    val arrays = findSequences(array)

    print(countTriples(arrays))
}

fun countTriples(array: IntArray): Int {
    var triple = 0
    for (n in array) {
        if (n == 3) triple += 1
        if (n > 3) {
            val res = (n - 3) + 1
            triple += res
        }
    }
    return triple
}

fun findSequences(array: IntArray): IntArray{
    var indexesCounter = 0
    var result = 1
    var i = 0
    val section = IntArray(10)

    for ((index, value) in array.withIndex()) {
        indexesCounter++
        if (array.lastIndex >= indexesCounter) {
            if (value > array[indexesCounter]) {
                result = 1
                i++
            }
            if (value < array[indexesCounter] && array[indexesCounter] - 1 == value) {
                result++
                section[i] = result
            } else {
                i++
                result = 1
            }
        }
    }
    return section
}