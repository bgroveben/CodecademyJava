class Dog extends Animal {
    int age;
    public Dog(int dogsAge) {
        age = dogsAge;
    }
    public void bark() {
        System.out.println("Woof!");
    }
    public void run(int feet) {
        System.out.println("Your dog ran " + feet + " feet!");
    }
    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        Dog spike = new Dog(7);
        spike.bark();
        spike.run(100);
        spike.checkStatus();
        int spikeAge = spike.getAge();
        System.out.println(spikeAge);
    }
}
