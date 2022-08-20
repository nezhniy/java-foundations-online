package ru.itsjava.homework4_6;

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

        //1
        booksList.add(one);
        booksList.add(two);
        booksList.add(three);
        booksList.add(four);
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
    }
}
