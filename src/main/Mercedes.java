package main;

public class Mercedes implements ICar, IVehicle{


    @Override
    public void startEngine() {
        System.out.println("Starting engine for mercedes");
    }

    @Override
    public void produce() {
        System.out.println("Mercedes is produced");
    }

}
