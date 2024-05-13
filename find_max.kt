fun findMax(numbers: List<Int>): Int? {
    if (numbers.isEmpty()) return null
    return numbers.maxOrNull()
}

fun filterEvenNumbers(numbers: List<Int>): List<Int> {
    return numbers.filter { it % 2 == 0 }
}

fun calculateAverage(numbers: List<Double>): Double? {
    if (numbers.isEmpty()) return null
    val sum = numbers.sum()
    return sum / numbers.size
}

fun main() {
    val numbers1 = listOf(3, 7, 1, 9, 5, 11, 6)
    val numbers2 = listOf(2, 4, 6, 8, 10, 12)
    val numbers3 = listOf(2.5, 3.5, 4.5, 5.5, 6.5)

    println("Maximum value: ${findMax(numbers1)}")
    println("Filtered even numbers: ${filterEvenNumbers(numbers1)}")
    println("Average value: ${calculateAverage(numbers3)}")
}
