package ru.itsjava.homework4_4;

public class Main {
    public static void main(String[] args) throws AgeNotValidException{

        try {
            Person p1 = new Person("a", 30);
        } catch (AgeNotValidException e){
            System.err.println("возраст должен быть корректным");
        }
    }
}
