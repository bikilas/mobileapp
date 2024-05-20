fun analyzeString(inputString: String): Triple<Int, Int, Int> {
    // Initialize counters
    var wordCount = 0
    var uppercaseCount = 0
    var vowelCount = 0

    // Define vowels
    val vowels = setOf('a', 'e', 'i', 'o', 'u')

    // Iterate through each character in the string
    inputString.forEach { char ->
        // Count words
        if (char.isWhitespace()) {
            wordCount++
        }

        // Count uppercase letters
        if (char.isUpperCase()) {
            uppercaseCount++
        }

        // Count vowels (case insensitive)
        if (char.toLowerCase() in vowels) {
            vowelCount++
        }
    }

    // Increment word count by 1 for the last word (if any)
    wordCount++

    return Triple(wordCount, uppercaseCount, vowelCount)
}

fun main() {
    val input = "Hello World! This is a Sample String."
    val (wordCount, uppercaseCount, vowelCount) = analyzeString(input)

    println("Number of words: $wordCount")
    println("Number of uppercase letters: $uppercaseCount")
    println("Number of vowels: $vowelCount")
}
