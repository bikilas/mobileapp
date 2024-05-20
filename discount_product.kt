fun main() {
    // Declare variables for original price, discount percentage, and final price
    val originalPrice = 100.0
    var discountPercentage = 0.6 // 60% discount, represented as a decimal
    val threshold = 0.5 // 50% threshold for discount

    // Check if discount percentage exceeds the threshold
    if (discountPercentage > threshold) {
        println("The discount percentage is too high. Setting it to the threshold value of ${threshold * 100}%.")
        discountPercentage = threshold
    }

    // Calculate the final price after discount
    val finalPrice = originalPrice * (1 - discountPercentage)

    // Print original price, discount percentage, and final price
    println("Original Price: $$originalPrice")
    println("Discount Percentage: ${(discountPercentage * 100).toInt()}%")
    println("Final Price after Discount: $$finalPrice")
}
