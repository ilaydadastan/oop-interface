package main;

public interface ICar {
     int wheelNumber=0;
     void startEngine();
     default void print(){
          System.out.println("hello car");
     }
}
