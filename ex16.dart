void divide(int a, int b) {
  try {
    if (b == 0) {
      throw Exception('Division by zero is not allowed.');
    }

    int result = a ~/ b;
    print('Result: $result');
  } finally {
    print('Division operation completed.');
  }
}

void main() {
  divide(10, 2);
  divide(10, 0);
}
