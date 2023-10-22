package org.example.dublicates;
//Напишите метод, который убирает из списка целых чисел все дубликаты.
public class Main {
    public static void main(String[] args) {
        Dublicates dublicate = new Dublicates();
        dublicate.createNewList();
        dublicate.delDublicates(dublicate.originalList);
        System.out.println(dublicate.nonDublicateList);
    }
}