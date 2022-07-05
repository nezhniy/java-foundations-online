package ru.itsjava.homework3_8;

public interface Eatable {
    default void eat(){
        System.out.println("im eating");
    }
}
