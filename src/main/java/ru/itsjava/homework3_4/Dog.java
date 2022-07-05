package ru.itsjava.homework3_4;

public class Dog implements Runnable{
    @Override
    public void run() {
        System.out.println("Бегаю потому что это весело");
    }
}
