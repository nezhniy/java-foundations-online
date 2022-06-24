package ru.itsjava.object;

public class ObjectPractice {
    public static void main(String[] args) {
        Dog gurka = new Dog("Gurka", 4);
        Dog gurka2 = new Dog("Gurka", 4);

        Dog murka = new Dog("Murka", 4);

        System.out.println("gurka.equals(gurka2) = " + gurka.equals(gurka2));
        System.out.println("gurka.equals(murka) = " + gurka.equals(murka));

        System.out.println("gurka = " + gurka);
    }
}
