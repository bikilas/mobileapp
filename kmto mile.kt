fun main() {
    // Declare variables to store distance value and unit
    val distance = 100.0 // Initial distance value
    val initialUnit = "kilometers" // Initial unit of distance
    val targetUnit = "miles" // Target unit of distance

    // Convert distance to target unit
    val convertedDistance = when (initialUnit) {
        "kilometers" -> kilometersToMiles(distance)
        "miles" -> milesToKilometers(distance)
        else -> {
            println("Unsupported unit: $initialUnit")
            return
        }
    }

    // Print the converted distance
    println("$distance $initialUnit is equal to $convertedDistance $targetUnit")
}

// Function to convert kilometers to miles
fun kilometersToMiles(kilometers: Double): Double {
    return kilometers * 0.621371
}

// Function to convert miles to kilometers
fun milesToKilometers(miles: Double): Double {
    return miles * 1.60934
}
