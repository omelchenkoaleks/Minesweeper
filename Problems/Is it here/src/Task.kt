import java.util.*

const val NO = "NO"
const val YES = "YES"

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val size = scanner.nextInt()
    val array = IntArray(size)
    for (index in 0..array.lastIndex) {
        array[index] = scanner.nextInt()
    }
    val num = scanner.nextInt()
    val res = array.contains(num)

    if (res) {
        print(YES)
    } else {
        print(NO)
    }
}