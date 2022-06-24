package ru.itsjava.equals;

public class Car {
    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }
    public boolean equals(Object obj){
        if (obj instanceof Car){
            Car c2 = (Car)obj;
            return (color.equals(c2.color) && engine.equals(c2.engine));
        }
        else return false;
    }
}
