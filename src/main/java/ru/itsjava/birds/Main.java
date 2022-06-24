package ru.itsjava.birds;

public class Main {
    public static void main(String[] args) {
        Bird parrot = new Parrot("Glasha", 200, 2, "chif");
        Bird crow = new Crow("Sasha", 400, 2, "car");

        parrot.speak();
        crow.speak();

        System.out.println("crow = " + crow);
    }
}
