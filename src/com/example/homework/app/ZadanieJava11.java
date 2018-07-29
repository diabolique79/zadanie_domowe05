package com.example.homework.app;

import com.example.homework.model.CoordinatesJava11;

import java.util.Locale;
import java.util.Scanner;

public class ZadanieJava11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Wprowadź współrzędną X: ");
        double coordinateX = scanner.nextDouble();
        System.out.println("Wprowadź współrzędną Y: ");
        double coordinateY = scanner.nextDouble();

        CoordinatesJava11 coordinatesJava11 = new CoordinatesJava11();

        coordinatesJava11.CoordinateSystem(coordinateX, coordinateY);
    }
}
