package ru.itsjava.stu;

public class Main {
    public static void main(String[] args) {
        Student a = new Student(1, "Bob");
        Student b = new Student(1, "Bob");

        System.out.println("a.equals(b) = " + a.equals(b));
        System.out.println("a.equals(b) = " + b.equals(a));

        Employee e = new Employee(1, "Bob");

        System.out.println("a.equals(e) = " + a.equals(e));
        System.out.println("b.equals(a) = " + e.equals(a));
    }
}
