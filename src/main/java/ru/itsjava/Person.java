package ru.itsjava;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class Person {
    private String name;
    private int age;

    public int birthday(){
        return age++;
    }

    public boolean takeBeer(){
        if (age >= 18){
            return true;
        } else
            return false;
    }
}
