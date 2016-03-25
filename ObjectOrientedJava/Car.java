class Car {
    int modelYear;
    public Car(int year) {
        modelYear = year;
    }
    public void startEngine() {
        System.out.println("Vroom!");
    }
    public void drive(int distanceInMiles) {
        System.out.println("Miles driven: " + distanceInMiles);
    }
    public static void main(String[] args) {
        Car myFastCar = new Car(2007);
        myFastCar.startEngine();
        myFastCar.drive(1628);
    }
}
