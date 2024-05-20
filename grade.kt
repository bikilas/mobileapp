fun main() {
    // Prompt the user for input
    prifun main() {
        // Prompt the user for input
        println("Please enter a number:")

        // Read a line of input from the user
        val userInput = readLine()

        // Convert the input to a number (either Int or Double)
        val number: Double? = userInput?.toDoubleOrNull()

        // Check if the input is a valid number and within the range of 0 to 100
        if (number != null && number in 0.0..100.0) {
            println("You entered $number as your number.")

            // Assign letter grade based on the provided scale
            val letterGrade = when (number.toInt()) {
                in 90..100 -> "A"
                in 80..89 -> "B"
                in 70..79 -> "C"
                in 60..69 -> "D"
                else -> "F"
            }

            // Print the letter grade
            println("Letter grade: $letterGrade")
        } else {
            println("Invalid input. Please enter a valid number between 0 and 100.")
        }
    }
    ntln("Please enter a number:")

    // Read a line of input from the user
    val userInput = readLine()

    // Convert the input to a number (either Int or Double)
    val number: Double? = userInput?.toDoubleOrNull()

    // Check if the input is a valid number and within the range of 0 to 100
    if (number != null && number in 0.0..100.0) {
        println("You entered $number as your number.")

        // Assign letter grade based on the provided scale
        val letterGrade = when (number.toInt()) {
            in 90..100 -> "A"
            in 80..89 -> "B"
            in 70..79 -> "C"
            in 60..69 -> "D"
            else -> "F"
        }

        // Print the letter grade
        println("Letter grade: $letterGrade")
    } else {
        println("Invalid input. Please enter a valid number between 0 and 100.")
    }
}
