void printMap(Map<dynamic, dynamic> map) {
  map.forEach((key, value) {
    print('Key: $key, Value: $value');
  });
}

void main() {
  Map<String, int> map = {'apple': 5, 'banana': 3, 'orange': 8};
  printMap(map);
}
