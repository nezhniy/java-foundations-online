package ru.itsjava.homework4_6;

import ru.itsjava.collections.lists.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> booksList = new ArrayList<>(20);

        Book one = new Book("One", "Author1", 100);
        Book two = new Book("Two", "Author2", 200);
        Book three = new Book("Three", "Author3", 300);
        Book four = new Book("Four", "Author4", 400);
        Book five = new Book("Five", "Author5", 500);
        Book six = new Book("Six", "Author6", 600);
        Book seven = new Book("Seven", "Author7", 700);

        Book java1 = new Book("Java", "Schildt", 1000);
        Book java2 = new Book("Java", "Eckel", 1100);
        Book java3 = new Book("Java", "Horstmann", 1200);
        Book java4 = new Book("Java", "Burd", 1200);

        //1
        booksList.add(one);
        booksList.add(java1);
        booksList.add(two);
        booksList.add(three);
        booksList.add(java3);
        booksList.add(java4);
        booksList.add(four);
        booksList.add(java2);
        booksList.add(five);

        booksList.set(2, six);
        booksList.set(0, seven);

        List<Book> anyBookList = new ArrayList<>();
        anyBookList.addAll(booksList);

        System.out.println("anyBookList = " + anyBookList);

        //2
        System.out.println("first elem = " + booksList.get(0));

        System.out.println("last elem = " + booksList.get(booksList.size()-1));

        //3
        booksList.remove(4);
        booksList.remove(four);

        System.out.println("booksList = " + booksList);

        //4
        System.out.println("booksList.contains(one) = " + booksList.contains(one));
        System.out.println("booksList.contains(two) = " + booksList.contains(two));

        //5
        System.out.println("List:" + booksList.toString());

        System.out.println("Вторая часть практики:");

        //6
        for (int i = 0; i < booksList.size(); i++) {
            if (i%3 == 0){
                System.out.println(booksList.get(i));
            }
        }

        int count = 0;
        for (Book book : booksList) {
            if (book.getName().contains("Java")){
                count++;
            }
        }
        System.out.println(count);

        //7
        for (int i = 0; i < booksList.size(); i++) {
            if (i<3){
                continue;
            }else{
                System.out.print(booksList.get(i) + " ");
            }
        }
        System.out.println();

        //6+7
        int countJ = 0;
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i).getName().contains("Java") && countJ < 2){
                countJ++;
            } else {
                System.out.print(booksList.get(i) + " ");
            }
        }
        System.out.println();

        //8
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i).getAuthor().length() % 3 == 0){
                System.out.println(booksList.get(i));
                break;
            }
        }

        //9
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i).getAuthor().length() % 3 == 0){
                System.out.println(booksList.get(i));
            }
        }

        //10
        Person kolya = new Person("Nikolay", "male", 19);
        Person vanya = new Person("Ivan", "male", 23);
        Person nikita = new Person("Nikita", "male", 27);

        Person valya = new Person("Valentina", "female", 33);
        Person luba = new Person("Ludmila", "female", 54);

        List<Person> personList = new ArrayList<>(5);

        personList.add(kolya);
        personList.add(vanya);
        personList.add(nikita);
        personList.add(valya);
        personList.add(luba);

        for (int i = 0; i < personList.size(); i++) {
            int army = personList.get(i).getAge();
            char f = personList.get(i).getName().charAt(0);
            if (personList.get(i).getSex().equals("male") && army >= 18 && army <= 27 && f == 'N'){
                System.out.println(personList.get(i).getName() + " военнообязан.");
            }
        }

        //11
        int countfem = 0;
        int sum = 0;
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getSex().equals("female")){
                sum = sum + personList.get(i).getAge();
                countfem++;
            }
        }
        System.out.println(sum/countfem);
    }
}
