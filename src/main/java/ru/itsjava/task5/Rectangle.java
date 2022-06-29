package ru.itsjava.task5;

public class Rectangle extends Figure{
    public Rectangle(int a, int b) {
        super(a, b);
    }

    @Override
    public void area() {
        System.out.println(getA() * getB());
    }

    @Override
    public void perimeter() {
        System.out.println((getA() + getB()) * 2);
    }
}
