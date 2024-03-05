int findMaxNumber(List<int> numbers) {
  if (numbers.isEmpty) {
    throw ArgumentError(
        'The list cannot be empty.'); // Throw an error if the list is empty
  }

  int maxNumber = numbers[0];
  for (int number in numbers) {
    if (number > maxNumber) {
      maxNumber = number;
    }
  }

  return maxNumber;
}

void main() {
  List<int> numbers = [5, 2, 9, 1, 7];
  int maxNumber = findMaxNumber(numbers);
  print('The highest number is: $maxNumber');
}
