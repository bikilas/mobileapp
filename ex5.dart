double calculateAverage(List<double> numbers) {
  if (numbers.isEmpty) {
    return 0.0; // Return 0 if the list is empty to avoid division by zero
  }

  double sum = 0.0;
  for (double number in numbers) {
    sum += number;
  }

  return sum / numbers.length;
}

void main() {
  List<double> numbers = [2.5, 3.7, 1.8, 4.0, 2.2];
  double average = calculateAverage(numbers);
  print('The average is: $average');
}
