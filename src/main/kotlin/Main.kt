import java.util.*

fun main() {
    val input = Scanner(System.`in`)

    // game loop
    while (true) {
        val mountainHeightsList = mutableListOf<Int>()

        for (i in 0..<8) {
            // represents the height of a mountain.
            val mountainHeight = input.nextInt()
            mountainHeightsList.add(mountainHeight)
        }
        // Find the maximum height in the list.
        val findMaxHeight = mountainHeightsList.maxOrNull()
        // Finds the maximum height index.
        val findMaxIndex = mountainHeightsList.indexOf(findMaxHeight)

        println("$findMaxIndex") // The index of montain more.
    }
}
