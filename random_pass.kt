fun main() {
    val passwordLength = 8 // Length of the password
    val password = generateRandomPassword(passwordLength)
    println("Generated Password: $password")
}

fun generateRandomPassword(length: Int): String {
    val lowercaseLetters = "abcdefghijklmnopqrstuvwxyz"
    val uppercaseLetters = lowercaseLetters.toUpperCase()
    val numbers = "0123456789"
    val specialSymbols = "!@#$%^&*()_+-=[]{}|;:,.<>?/~"

    // Combine all characters
    val allCharacters = lowercaseLetters + uppercaseLetters + numbers + specialSymbols

    val password = StringBuilder()

    for (i in 1..length) {
        // Generate a random index to select a character from allCharacters
        val randomIndex = (0 until allCharacters.length).random()
        val randomChar = allCharacters[randomIndex]
        password.append(randomChar)
    }

    return password.toString()
}
