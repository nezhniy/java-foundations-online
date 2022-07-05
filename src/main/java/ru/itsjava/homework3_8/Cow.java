package ru.itsjava.homework3_8;

public class Cow implements Eatable, Talkable{
    @Override
    public void eat() {
        System.out.println("im eating grass");
    }

    @Override
    public void talk() {
        System.out.println("i say moo");
    }
}
