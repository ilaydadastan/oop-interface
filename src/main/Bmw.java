package main;

public class Bmw implements ICar, IVehicle{
    @Override
    public void startEngine() {
        System.out.println("Starting engine for bmw");
    }

    @Override
    public void print() {
        System.out.println("hello bmw");
    }

    @Override
    public void produce() {
        System.out.println("Bmw is produced");
    }
}
