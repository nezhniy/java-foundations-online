package ru.itsjava.task5;

public class Triangle extends Figure{
    public Triangle(int a, int b, int c) {
        super(a, b, c);
    }

    @Override
    public void perimeter() {
        System.out.println(getA() + getB() + getC());
    }

    @Override
    public void area() {
        int p = (getA() + getB() + getC()) / 2;
        int aa = getA();
        int bb = getB();
        int cc = getC();
        double s = p * (p - aa) * (p - bb) * (p - cc);
        System.out.println(Math.sqrt(s));
    }
}
