package com.example.homework.app;

import com.example.homework.model.Name14;

import java.util.Arrays;
import java.util.Scanner;

public class ZadanieJava14 {

    public static void main(String[] args) {

        System.out.println("Wpisz 5 imion");
        Scanner scanner = new Scanner(System.in);
        String[] name14s = new String[5];
        int i;


        for (i = 0; i < name14s.length; i++) {
            name14s[i] = scanner.nextLine();

        }

        for (i = name14s.length - 1; i >= 0; i--) {


                System.out.println("Cześć " + name14s[i]);
            }


        }



    }


