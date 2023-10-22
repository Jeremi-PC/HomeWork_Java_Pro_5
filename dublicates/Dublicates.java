package org.example.dublicates;

import java.util.ArrayList;
import java.util.Random;

public class Dublicates {
    ArrayList<Integer> originalList = new ArrayList<Integer>();
    ArrayList<Integer> nonDublicateList = new ArrayList<Integer>();
    private int arrCount = 10;

    public void createNewList() {
        Random rnd = new Random();
        for (int i = 0; i < arrCount; i++) {
            originalList.add(rnd.nextInt(arrCount * 2 + 1));
        }
        System.out.println(originalList);
    }

    public void delDublicates(ArrayList<Integer> list) {
        nonDublicateList.add(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            int currentElement = list.get(i);
            if (!nonDublicateList.contains(currentElement)) nonDublicateList.add(currentElement);
        }
        list.clear();
    }
}

