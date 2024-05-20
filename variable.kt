fun main() {
    // Input first number
    print("Enter first number: ")
    val number1Input = readLine()
    if (number1Input == null) {
        println("Error: First number is missing.")
        return
    }
    val number1 = number1Input.toDouble()

    // Input second number
    print("Enter second number: ")
    val number2Input = readLine()
    if (number2Input == null) {
        println("Error: Second number is missing.")
        return
    }
    val number2 = number2Input.toDouble()

    // Input operation
    print("Enter operation (+, -, *, /): ")
    val operation = readLine()
    if (operation == null) {
        println("Error: Operation is missing.")
        return
    }

    // Perform the chosen operation
    val result = when (operation) {
        "+" -> number1 + number2
        "-" -> number1 - number2
        "*" -> number1 * number2
        "/" -> {
            if (number2 != 0.0) {
                number1 / number2
            } else {
                println("Error: Division by zero!")
                return
            }
        }
        else -> {
            println("Error: Invalid operation!")
            return
        }
    }

    // Print the result
    println("Result: $result")
}
