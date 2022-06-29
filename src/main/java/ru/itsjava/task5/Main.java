package ru.itsjava.task5;

public class Main {
    public static void main(String[] args) {
        Person m1 = new Man("Oleg", 22);
        Person m2 = new Man("Ivan", 56);
        Person m3 = new Man("Boris", 41);
        Person w1 = new Woman("Galina", 43);
        Person w2 = new Woman("Olga", 28);
        Person w3 = new Woman("Masha", 35);

        Person[] pers = new Person[]{m1, m2, m3, w1, w2, w3};

        for (int i = 0; i < pers.length; i++) {
            pers[i].printAge();
        }

        Figure tr1 = new Triangle(3,4,5);
        tr1.area();
        tr1.perimeter();
    }
}
