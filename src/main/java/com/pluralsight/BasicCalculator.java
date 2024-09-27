package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number " );
        float num1 = input.nextFloat();
        System.out.print("Enter the second number ");
        float num2 = input.nextFloat();

        System.out.println("Possible Calculations: " );
        System.out.println("Add");
        System.out.println("Subtract");
        System.out.println("Multiply");
        System.out.println("Divide");

        System.out.print("Please select an options: ");
        String operation = input.nextLine();

        float result = 0;
        boolean selectOperation = true;

        if (operation.equals("Add")) {
            result = num1 + num2;
            System.out.println("Result " + result);
        }

        else if (operation.equals("Subtract")){
            result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (operation.equals("Divide")) {
            result = num1 / num2;
            System.out.println("Result " + result);
        } else if (operation.equals("Multiple")) {
            result = num1 * num2;
            System.out.println("Result " + result);
        }
        else {
            selectOperation = false;
            System.out.println("Error " );
        }


    }
}
