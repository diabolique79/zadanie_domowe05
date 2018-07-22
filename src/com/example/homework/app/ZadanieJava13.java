package com.example.homework.app;

import java.util.Scanner;

public class ZadanieJava13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int quessNumber = 120;
        int number = 0;


        while (number != quessNumber) {

            System.out.println("Wpisz liczbę z przedziału od 100 do 200: ");
            number = scanner.nextInt();

            if (number < 100 || number > 200) {

                System.out.println("Liczba znajduje się poza przedziałem.");
            } else if (number % 3 == 0 && number < quessNumber) {

                System.out.println("Liczba jest za mała.");

            } else if (number % 3 == 0 && number > quessNumber) {
                System.out.println("Liczba jest za duża.");

            } else if (number % 3 != 0){
                System.out.println("Liczba nie jest podzielna przez 3.");
            }
        }

        System.out.println("Brawo, zgadłeś.");
    }


}

