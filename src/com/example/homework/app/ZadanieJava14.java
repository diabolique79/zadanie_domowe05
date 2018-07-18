package com.example.homework.app;

import com.example.homework.model.Name14;

import java.util.Arrays;
import java.util.Scanner;

public class ZadanieJava14 {

    public static void main(String[] args) {

        System.out.println("Wpisz 5 imion");
        Scanner scanner = new Scanner(System.in);
        String[] name14s = new String[5];
        String imie = scanner.nextLine();
        name14s[0] = imie;
        imie = scanner.nextLine();
        name14s[1] = imie;
        imie = scanner.nextLine();
        name14s[2] = imie;
        imie = scanner.nextLine();
        name14s[3] = imie;
        imie = scanner.nextLine();
        name14s[4] = imie;



        String odwrotne[] = new String[name14s.length];

        for (int i = name14s.length - 1; i > 0;) {

            for (int j = 0; j < name14s.length; j++) {

                odwrotne[j] = name14s[i];
                i--;

                System.out.println("Cześć " + odwrotne[j]);
            }


        }



    }

}
