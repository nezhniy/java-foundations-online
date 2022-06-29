package ru.itsjava.task5;

public class Square extends Figure{
    public Square(int a) {
        super(a);
    }

    @Override
    public void area() {
        System.out.println(getA() * getA());
    }

    @Override
    public void perimeter() {
        System.out.println(getA() * 4);
    }
}
