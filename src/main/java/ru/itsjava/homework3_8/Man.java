package ru.itsjava.homework3_8;

public class Man implements Eatable, Talkable{
    @Override
    public void eat() {
        System.out.println("im eating cows and plants");
    }

    @Override
    public void talk() {
        System.out.println("i say nyam-nyam");
    }
}
