void main() {
  List<int> fibonacci(int n) {
    List<int> fibSequence = [
      0,
      1
    ]; // Initialize the first two numbers in the sequence

    for (int i = 2; i < n; i++) {
      int fibNumber = fibSequence[i - 1] +
          fibSequence[i - 2]; // Compute the next Fibonacci number
      fibSequence.add(fibNumber); // Add the number to the sequence
    }

    return fibSequence;
  }

  // Print the first 10 numbers in the Fibonacci sequence
  List<int> fibNumbers = fibonacci(10);
  for (int number in fibNumbers) {
    print(number);
  }
}
