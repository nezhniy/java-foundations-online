package ru.itsjava.homework3_6;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("Oleg", "Belov", 23);
        Person p2 = new Person("Oleg", "Serov", 23);

        System.out.println("p1.compareTo(p2) = " + p1.compareTo(p2));

        Person p3 = (Person)p1.clone();

        System.out.println("p1 = " + p1);
        System.out.println("p3 = " + p3);
    }
}
