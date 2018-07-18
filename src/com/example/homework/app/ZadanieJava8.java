package com.example.homework.app;

import com.example.homework.model.ArrayJava8;

public class ZadanieJava8 {

    public static void main(String[] args) {

        //Pierwsze rozwiązanie
        String[] arrays = new String[3];
        arrays[0] ="Kasia";
        arrays[1] = "Joasia";
        arrays[2] = "Ania";

        System.out.println(arrays[0]);
        System.out.println(arrays[1]);
        System.out.println(arrays[2]);

       //Drugie

        ArrayJava8[] arrayJava8s = new ArrayJava8[3];
        arrayJava8s[0] = new ArrayJava8("Kasia");
        arrayJava8s[1] = new ArrayJava8("Joasia");
        arrayJava8s[2] = new ArrayJava8("Ania");

        System.out.println(arrayJava8s[0].getName());
        System.out.println(arrayJava8s[1].getName());
        System.out.println(arrayJava8s[2].getName());

    }




}
