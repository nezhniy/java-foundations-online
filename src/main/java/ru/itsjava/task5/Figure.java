package ru.itsjava.task5;

public class Figure {
    private int a, b, c;
    private static final double PI = Math.PI;

    public Figure(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Figure(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Figure(int a) {
        this.a = a;
    }
    public void area(){
    }

    public void perimeter(){
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
