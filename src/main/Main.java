package main;

public class Main {
    public static void main(String[] args) {
        Mercedes car1 = new Mercedes();
        Bmw car2 = new Bmw();
        car1.startEngine();
        car2.startEngine();
        car1.print();
        car2.print();
        car1.produce();
        car2.produce();
    }
}
