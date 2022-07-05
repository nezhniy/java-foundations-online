package ru.itsjava.homework3_8;

public interface Talkable {
    default void talk(){
        System.out.println("im talking");
    }
}
