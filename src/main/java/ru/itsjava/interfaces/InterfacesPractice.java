package ru.itsjava.interfaces;

public class InterfacesPractice {
    public static void main(String[] args) {
        Creatable hot = new Gin();

        hot.createWish();

        Creatable bad = new BadGin();

        bad.createWish();
    }
}
