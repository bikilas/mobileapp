Future<int> fetchData() {
  return Future.delayed(
      Duration(seconds: 2), () => 42); // Simulate an asynchronous operation
}

void main() {
  print('Fetching data...');

  fetchData().then((result) {
    print('Data fetched: $result');
  });
}
