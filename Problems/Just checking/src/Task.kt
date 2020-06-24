import java.util.*

val scanner = Scanner(System.`in`)
val size = scanner.nextInt()
val array = IntArray(size)
var num1 = 0
var num2 = 0

fun main(args: Array<String>) {
    for (i in 0..array.lastIndex) {
        array[i] = scanner.nextInt()
    }
    num1 = scanner.nextInt()
    num2 = scanner.nextInt()

    val result = findPare(num1, num2)
    if (result) {
        print("YES")
    } else {
        print("NO")
    }
}

fun findPare(n1: Int, n2: Int): Boolean {
    for (i in array.indices - 2) if (array[i] == n1 && array[i + 1] == n2
            || array[i] == n2 && array[i + 1] == n1) {
        return true
    }
    return false
}