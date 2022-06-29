package ru.itsjava.task5;

public class Woman extends Person{
    public Woman(String name, int age) {
        super(name, age);
    }

    public void printAge(){
        System.out.println("всегда 18");
    }
}
