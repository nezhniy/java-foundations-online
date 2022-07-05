package ru.itsjava.homework3_4;

public class Man implements Walkable, Swimable, Flyable, Runnable{
    @Override
    public void walk() {
        System.out.println("Хожу на работу");
    }

    @Override
    public void fly() {
        System.out.println("Летаю на самолете");
    }

    @Override
    public void run() {
        System.out.println("Бегаю чтобы похудеть");
    }

    @Override
    public void swim() {
        System.out.println("Плаваю для здоровья спины");
    }
}
