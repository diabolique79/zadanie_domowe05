package com.example.homework.model;

public class NumbersJava12 {

    private int sum;
    private int i;


   public void Numbers(){


        for(i = 0; i <= 100; i++){

            if(i%2==0){

                System.out.println(i);
                sum = sum + i;
            }

        }

       System.out.println("Suma liczb: " + sum);

    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
