import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val squirrelsCount = scanner.nextInt()
    val nutsCount = scanner.nextInt()

    print(findResidue(squirrelsCount, nutsCount))
}

fun findResidue(squirrel: Int, nut: Int): Int {
    var residue = 0
    if (squirrel <= 10000 && nut <= 10000) {
        residue = nut % squirrel
    } else {
        print("Enter a valid numbers:")
    }
    return residue
}