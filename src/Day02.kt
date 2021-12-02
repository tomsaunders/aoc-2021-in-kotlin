fun main() {
    fun part1(input: List<String>): Int {
        var x = 0;
        var y = 0;

        input.forEach {
            var (dir, nStr) = it.split(' ')
            val n = nStr.toInt()
            when (dir) {
                "forward" -> x += n
                "down" -> y += n
                "up" -> y -= n
            }
        }
        return x * y
    }

    fun part2(input: List<String>): Int {
        var x = 0;
        var y = 0;
        var a = 0;

        input.forEach {
            var (dir, nStr) = it.split(' ')
            val n = nStr.toInt()
            when (dir) {
                "forward" -> {
                    x += n
                    y += a * n
                }
                "down" -> a += n
                "up" -> a -= n
            }
        }

        return x * y
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02_test")
    check(part1(testInput) == 150) { "test part 1 failed - " + part1(testInput) }

    val input = readInput("Day02")
    println(part1(input))

    check(part2(testInput) == 900) { "test part 2 failed - " + part2(testInput) }
    println(part2(input))
}
