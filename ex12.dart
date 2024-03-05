Future<int> fetchData() async {
  await Future.delayed(
      Duration(seconds: 2)); // Simulate an asynchronous operation
  return 42;
}

void main() async {
  print('Fetching data...');
  int result = await fetchData();
  print('Data fetched: $result');
}
