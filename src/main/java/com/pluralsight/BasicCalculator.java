package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //prompt user for two values
        System.out.print("\tEnter the first number " );
        float num1 = input.nextFloat();
        System.out.print("\tEnter the second number ");
        float num2 = input.nextFloat();
        
        //display and prompt user for an operations
        System.out.println("\nChoose an operation by selecting A, S, D, or M " );
        System.out.println("\t(A)dd");
        System.out.println("\t(S)ubract");
        System.out.println("\t(D)ivdide");
        System.out.println("\t(M)ultiple");
        String getOperation = input.next().toUpperCase();

        double result = 0;
        boolean operation = true;
        
        //perform addition 
        if (getOperation.equals("A")) {
            result = num1 + num2;
            System.out.println("\tResult " + num1 + " + " + num2 + " = " + result);
        } 
        //perform substraction 
        else if (getOperation.equals("S")) {
            result = num1 - num2;
            System.out.println("\tResult " + num1 + " - " + num2 + " = " + result);
        } 
        //perform multiplication
        else if (getOperation.equals("M")) {
            result = num1 * num2;
            System.out.println("\tResult " + num1 + " * " + num2 + " = " + result);
        } 
        //perform division 
        else if (getOperation.equals("D")) {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("\tResult " + num1 + " / " + num2 + " = " + result);
            } else {
                System.out.println("\tError: number enter cannot divide by zero.");
            }
        } else {
            operation = false;
            System.out.println("\tError: not an operation.");
        }
        
    }


}
