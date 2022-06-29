package ru.itsjava.statics;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class Salary {
    private final double baseSalary;
    private static double increaseRatio = 2.5;
    public final static double CEO = 500_000.0;

    public double getFullSalary(){
        return baseSalary * increaseRatio;
    }

    public static void setIncreaseRatio(double increaseRatio1){
        increaseRatio = increaseRatio1;
    }
}
