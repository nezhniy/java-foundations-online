package ru.itsjava.equals;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("red", "V4");
        Car c2 = new Car("red", "V4");
        Car c3 = new Car("black", "V8");
        System.out.println("c1.equals(c2) = " + c1.equals(c2));
    }
}
