package ru.itsjava.homework4_4;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;

        if (getAge() <= 0 || getAge() >= 150){
            try {
                throw new AgeNotValidException("Wtf?");
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
