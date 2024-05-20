fun transformToUppercase(strings: List<String>): List<String> {
    return strings.map { it.toUpperCase() }
}

fun filterGreaterThan(numbers: List<Int>, threshold: Int): List<Int> {
    return numbers.filter { it > threshold }
}

fun calculateSum(numbers: List<Int>): Int {
    return numbers.reduce { acc, num -> acc + num }
}

fun main() {
    val strings = listOf("apple", "banana", "orange")
    val numbers = listOf(1, 5, 9, 12, 18, 3, 7)

    // Applying uppercase transformation to each string
    val uppercaseStrings = transformToUppercase(strings)
    println("Uppercase Strings: $uppercaseStrings")

    // Filtering out numbers greater than a certain value
    val filteredNumbers = filterGreaterThan(numbers, 8)
    println("Filtered Numbers: $filteredNumbers")

    // Calculating the sum of all elements
    val sum = calculateSum(numbers)
    println("Sum of Numbers: $sum")
}
