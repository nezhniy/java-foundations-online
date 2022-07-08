package ru.itsjava.homework4_2;

import java.util.Locale;

public class StringHW {
    public static void main(String[] args) {
        String s = "Abra Cadabra";

        String ss = "abra cadabra";

        s.length(); //длина строки
        s.toUpperCase(); //все заглавные
        s.split(" "); //разделяет строку по указанному символу
        s.toLowerCase(); //все строчные
        s.isEmpty(); //проверка на пустоту
        s.hashCode(); //возврат числового эквивалента объекта
        s.equals(ss); //сравнение на равенство
        s.equalsIgnoreCase(ss); //сравнвение на равенство игнорируя регистр
        s.charAt(0); //вывод символа по его порядковому номеру
        s.indexOf("a"); //вывод порядкогового номера указанного символа
        s.strip(); //удаление пробелов в начале и в конце строки
        s.compareTo(ss); //сравнение в лексикографическом порядке
    }

}
