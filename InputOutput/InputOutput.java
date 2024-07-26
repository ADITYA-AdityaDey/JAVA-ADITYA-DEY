// WAP to add two numbers

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        int number1, number2, totalValue;

        System.out.println("Enter any two number: ");
        Scanner obj1 = new Scanner(System.in);

        number1 = obj1.nextInt();
        number2 = obj1.nextInt();

        totalValue = number1 + number2;

        System.out.println("Sum of two numbers: "+totalValue);

    }
}