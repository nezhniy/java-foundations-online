package ru.itsjava.homework3_6;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class Person implements Comparable<Person>, Cloneable{
    private final String name;
    private final String surname;
    private final int age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Person p) {
        if (!name.equals(p.name)){
            return name.charAt(0) - p.name.charAt(0);
        } else if (!surname.equals(p.surname)){
            return surname.charAt(0) - p.surname.charAt(0);
        } else{
            return age - p.age;
        }
    }
}
