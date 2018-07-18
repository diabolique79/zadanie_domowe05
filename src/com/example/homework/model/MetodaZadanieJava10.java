package com.example.homework.model;


public class MetodaZadanieJava10 {

    private double number;

    public MetodaZadanieJava10(double number) {
        this.number = number;
    }

    public void metodaWhile(double number){

        System.out.println("Pierwsza wersja z pętlą while");
        while (number <= 3){

            number = number + 0.10;
            System.out.printf("%.1f; ", number);

        }


    }

    public void metodaDoWhile(double number){

        System.out.println("Druga wersja z pętlą do while");

        do {

            number = number + 0.10;
            System.out.printf("%.1f; ", number);

        } while (number <= 3 );
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
}

