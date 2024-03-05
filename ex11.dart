class Car {
  String brand;
  String model;
  int year;

  Car(this.brand, this.model, this.year);

  void makeSound() {
    print('Vroom Vroom');
  }
}

class ElectricCar extends Car {
  double batteryLife;

  ElectricCar(String brand, String model, int year, this.batteryLife)
      : super(brand, model, year);
}

void main() {
  ElectricCar electricCar = ElectricCar('Tesla', 'Model S', 2023, 300);

  print('Brand: ${electricCar.brand}');
  print('Model: ${electricCar.model}');
  print('Year: ${electricCar.year}');
  print('Battery Life: ${electricCar.batteryLife} miles');

  electricCar.makeSound();
}
