void divide(int a, int b) {
  if (b == 0) {
    throw Exception('Division by zero is not allowed.');
  }

  int result = a ~/ b;
  print('Result: $result');
}

void main() {
  try {
    divide(10, 0);
  } catch (e) {
    print('Error occurred: $e');
  }
}
