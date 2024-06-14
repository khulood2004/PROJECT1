package com.example.funciones_switch;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class HelloApplication  {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        printAnyString("Hi you are the best program, the program has some options such as: A, B and C");
        printAnyString("Please type any option");
        String readingString = scanner.nextLine();
        switch (readingString.toLowerCase()){
            case "a":
                printAnyString("Now you are in sum program, it is necessary to type two numbers, let us go");
                printAnyString("Typing the first number");
                int numberOne = scanner.nextInt();
                printAnyString("Typing the second number");
                int numberTwo = scanner.nextInt();
                int sumResult= sumNumbers(numberOne,numberTwo);
                printAnyString("The result of sum is: " +sumResult);
                break;
            case "b":
                printAnyString("Now you are in string program, it is necessary to type your name");
                printAnyString("Typing your name");
                String name = scanner.nextLine();
                printAnyString("The result of your name is: " +name);
                break;
            case "c":
                printAnyString("Now you are in cos function, it is necessary to type a number");
                printAnyString("Typing the number");
                int number = scanner.nextInt();
                double cosresult = Coseno(number);
                printAnyString("The result of the cosine of your number:  " + cosresult);

        }

    }
    public static void printAnyString(String message){
        System.out.println(message);
    }
    public static int sumNumbers(int numberOne, int numberTwo){
        int result = numberOne+numberTwo;
        return result;
        // return numberOne+numberTwo
    }
    public static double Coseno(int number) {
        double radians = Math.toRadians(number); // Convert degrees to radians
        double cosValue = Math.cos(radians);     // Calculate the cosine of the angle in radians
        return cosValue;
    }
}