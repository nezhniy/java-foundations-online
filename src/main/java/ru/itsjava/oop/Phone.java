package ru.itsjava.oop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor

public class Phone {
    private final String brand;
    private boolean isHomey;

    public String toString(){
        return "{" + brand + " " + isHomey + "}";
    }
}
