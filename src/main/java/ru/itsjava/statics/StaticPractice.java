package ru.itsjava.statics;

public class StaticPractice {
    public static void main(String[] args) {
//        System.out.println("Salary.increaseRatio = " + Salary.increaseRatio);

        Salary cleanerSalary = new Salary(5_000.0);
        Salary targetSalary = new Salary(10_000.0);

        System.out.println("cleanerSalary.getFullSalary() = " + cleanerSalary.getFullSalary());
        System.out.println("targetSalary.getFullSalary() = " + targetSalary.getFullSalary());

        Salary.setIncreaseRatio(1.0);

        System.out.println("cleanerSalary.getFullSalary() = " + cleanerSalary.getFullSalary());
        System.out.println("targetSalary.getFullSalary() = " + targetSalary.getFullSalary());

        System.out.println("Salary.CEO = " + Salary.CEO);
    }
}
