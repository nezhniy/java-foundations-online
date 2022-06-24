package ru.itsjava.birds;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Bird {
    private final String name;
    private int feathers;
    private final int paws;
    private final String voice;

    public void speak(){
        System.out.println("I'm a Bird, my name is " + name);
    }

    public void fly(){
        System.out.println("I have " + paws + " paws, but I'm flying, because i have " + feathers + " feathers");
    }

//    @Override
//    public String toString() {
//        return "Bird{name=" + name + ", feathers=" + feathers + ", paws=" + paws + ", voice=" + voice + "}";
//    }
}
