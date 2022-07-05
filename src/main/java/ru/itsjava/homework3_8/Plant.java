package ru.itsjava.homework3_8;

public class Plant implements Eatable, Talkable{
    @Override
    public void eat() {
        System.out.println("im drinking water and suns ray");
    }

    @Override
    public void talk() {
        System.out.println("so sorry, i dont talk with strangers");
    }
}
