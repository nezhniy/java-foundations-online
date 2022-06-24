package ru.itsjava.birds;

public class Parrot extends Bird{
    public Parrot(String name, int feathers, int paws, String voice) {
        super(name, feathers, paws, voice);
    }

    public void speak(){
        super.speak();
        System.out.println("Im a parrot");
    }
}
