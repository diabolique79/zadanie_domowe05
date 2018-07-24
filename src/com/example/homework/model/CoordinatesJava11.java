package com.example.homework.model;

public class CoordinatesJava11 {

    private double coordinateX;
    private double coordinateY;

    public CoordinatesJava11(double coordinateX, double coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public void CoordinateSystem(){

        if(coordinateX > 0 && coordinateY > 0){

            System.out.println("Punkt leży w pierwszej ćwiartce.");
        }
        else if(coordinateX < 0 && coordinateY > 0){

            System.out.println("Punkt leży w drugiej ćwiartce.");
        }

        else if(coordinateX < 0 && coordinateY < 0){

            System.out.println("Punkt leży w trzeciej ćwiartce.");
        }

        else if(coordinateX > 0 && coordinateY < 0){

            System.out.println("Punkt leży w czwartej ćwiartce.");
        }

        else {

            System.out.println("Srodek układu kartezjańskiego.");
        }

    }
    
}
