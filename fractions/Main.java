package org.example.fractions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

//Создайте класс правильной дроби (например, 1/2, 7/8 и т.д.).
// Числитель и знаменатель будут храниться в отдельных полях типа int.
// Самостоятельно (без генерации в IDE) реализуйте методы equals и hashCode для класса.
// Причём дроби с одинаковым результатом необходимо считать эквивалентными,
// т.е. 1/2 эквивалентна 2/4, эквивалентна 5/10 и т.д.
public class Main {


    public static void main(String[] args) {

        ArrayList<Fractions> fractionList = new ArrayList<Fractions>();
        int fractionCount = 10;
        Random rnd = new Random();

        for (int i = 0; i < fractionCount; i++) {
            int a = rnd.nextInt(5)+1;
            int b = rnd.nextInt(10)+1;
              if (a > b) {
                Fractions fraction = new Fractions(b, a);
                fractionList.add(fraction);
              }
              else {Fractions fraction = new Fractions(a, b);
                  fractionList.add(fraction);}
            }



        System.out.println("Original fraction list: "+fractionList);

        HashSet<Fractions> uniqueFraction = new HashSet<Fractions>();
        HashSet<Fractions> duplicateFraction = new HashSet<Fractions>();

        for (Fractions element : fractionList) {
            if (!uniqueFraction.add(element)) {
                duplicateFraction.add(element);
            }
        }
        System.out.println("Duplicate fractions: "+duplicateFraction);
    }

    }

