package com.awesam;

import java.util.Scanner;

public class Basics {
    static int position(int score) {
        int position =4;
        if (score >= 1000) position = 1;
        else if (score >= 500) position= 2;
         else if (score >= 100); position =3;
        return position;
    }

    static void highScore(String name, int score) {
        System.out.println(name + " your position is: " + position(score));
    }




    public static void main(String[] args) {
//        Scanner scanner= new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//        System.out.println("Hello "+name);
//
//        byte Byte = 127;
//        short Short =128;
//        int Int = 33000;
//        long Long = 50_000+(Byte+Short+Int)*10;
//        System.out.println(Long);
//        float Float =(float) 5.25;
//        System.out.println(Float);
//        System.out.print("Enter the weight in pounds:");
//        double weight = scanner.nextDouble();
//        System.out.println("Your weight in KG is:"+weight*0.453592);
//        char copyrightChar ='\u00A9';
//        System.out.println(copyrightChar);
//
//        double a= 20;
//        double b=80;
//        double c=(a+b)*100;
//        double d =c%40;
//        boolean isTrue=d==0?true:false;
//        System.out.println(isTrue);
//        String result = isTrue? "null":"Got some reminder";
//        System.out.println(result);


        highScore("sam", 1500);
        highScore("ruth", 900);
        highScore("milka", 400);
        highScore("esther", 50);
        highScore("recheal", 5000);

    }
}
