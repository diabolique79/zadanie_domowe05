package com.example.homework.app;

public class ZadanieJava9 {
    public static void main(String[] args) {


        int tablica[] = new int[5];

        int number;
        int sumNum = 0;

        for (number = 0; number < tablica.length; number++) {

            tablica[number] = number + 10;


            if (tablica[number] % 2 == 1) {

                sumNum += tablica[number];


            }


        }
        System.out.println(sumNum);


    }
}





