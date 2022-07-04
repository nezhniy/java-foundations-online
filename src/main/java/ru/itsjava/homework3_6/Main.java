package ru.itsjava.homework3_6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("Oleg", "Belov", 23);
        Person p2 = new Person("Oleg", "Serov", 23);
        Person p4 = new Person("Andrew", "Krasnov", 38);

        System.out.println("p1.compareTo(p2) = " + p1.compareTo(p2));

        Person p3 = (Person)p1.clone();

        System.out.println("p1 = " + p1);
        System.out.println("p3 = " + p3);

        Person[] arr = {p1, p2, p3, p4};
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
