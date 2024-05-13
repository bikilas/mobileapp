fun main() {
    // Input string
    println("Enter a string:")
    val inputString = readLine() ?: ""

    if (inputString.isNotEmpty()) {
        // Initialize min and max characters with the first character of the string
        var minChar = inputString[0]
        var maxChar = inputString[0]

        // Iterate through each character in the string
        for (char in inputString) {
            // Update minChar if the current character has a lower ASCII value
            if (char < minChar) {
                minChar = char
            }
            // Update maxChar if the current character has a higher ASCII value
            if (char > maxChar) {
                maxChar = char
            }
        }

        // Print the minimum and maximum characters
        println("Minimum character: $minChar")
        println("Maximum character: $maxChar")
    } else {
        println("The input string is empty.")
    }
}
