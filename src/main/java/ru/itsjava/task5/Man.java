package ru.itsjava.task5;

public class Man extends Person{

    public Man(String name, int age) {
        super(name, age);
    }

    public void printAge(){
        System.out.println(getAge());
    }
}
