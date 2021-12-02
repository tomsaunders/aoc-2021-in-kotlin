fun main() {
    fun part1(input: List<String>): Int {
        val depths = asNumbers(input)
        var count = 0
        var last = depths[0]
        depths.forEach {
            if (it > last) {
                count++
            }
            last = it
        }
        return count
    }

    fun window(three: List<Int>): Int {
        return three.sum()
    }

    fun part2(input: List<String>): Int {
        val depths = asNumbers(input)
        var count = 0
        var lastWindow = window(depths.slice(0..2))
        for (i in 1 .. (depths.size - 3)) {
            val thisWindow = window(depths.slice(i .. i+2))
            if (thisWindow > lastWindow) {
                count++
            }
            lastWindow = thisWindow
        }
        return count
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 7) { "test part 1 failed - " + part1(testInput) }

    val input = readInput("Day01")
    println(part1(input))

    check(part2(testInput) == 5) { "test part 2 failed - " + part2(testInput) }
    println(part2(input))
}
