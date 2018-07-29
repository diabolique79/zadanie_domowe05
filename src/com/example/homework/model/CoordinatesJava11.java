package com.example.homework.model;

public class CoordinatesJava11 {


    public void CoordinateSystem(double coordinateX, double coordinateY){

        if (coordinateX == 0 && coordinateY == 0){

            System.out.println("Srodek układu kartezjańskiego.");
        }

        else if(coordinateX > 0 && coordinateY > 0){

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



    }

}
