/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        String Num1 = myApp.readCurrentAge();
        String Num2 = myApp.readRetireAge();
        int int1 = Integer.parseInt(Num1);
        int int2 = Integer.parseInt(Num2);
        double conversion = 0.00285714285;
        int areaFeet = myApp.areaFeet(int1, int2);
        int paintNeeded = myApp.paintNeeded(areaFeet, conversion);
        String outputString = myApp.generateOutputString(paintNeeded, areaFeet);
        myApp.printOutput(outputString);
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }

    public String readCurrentAge(){
        System.out.print("What is the length of the room in feet? ");
        return in.nextLine();
    }

    public String readRetireAge(){
        System.out.print("What is the width of the room in feet? ");
        return in.nextLine();
    }

    public int areaFeet(int int1, int int2){
        return int1 * int2;
    }

    public int paintNeeded(int areaFeet, double conversion){
        return (int) Math.ceil(areaFeet * conversion);
    }

    public String generateOutputString(int paintNeeded, int areaFeet){
        return String.format("You will need to purchase %d gallons of paint to cover %d square feet.", paintNeeded, areaFeet);
    }
}