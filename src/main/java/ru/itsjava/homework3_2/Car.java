package ru.itsjava.homework3_2;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class Car {
    private final String brand;
    private String color;
    private static int price = 100_000;

    public int getPrice(){
        return price;
    }
}
