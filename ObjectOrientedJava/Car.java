class Car {
    int modelYear;
    public Car(int year) {
        modelYear = year;
    }
    public void startEngine() {
        System.out.println("Vroom!");
    }
    public static void main(String[] args) {
        Car myFastCar = new Car(2007);
    }
}
