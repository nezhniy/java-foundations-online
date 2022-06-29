package ru.itsjava.homework3_2;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", "black");
        Car audi = new Car("Audi", "pink");

        System.out.println("bmw.getPrice() = " + bmw.getPrice());
        System.out.println("audi.getPrice() = " + audi.getPrice());
    }
}
