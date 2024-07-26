// WAP to multiply three numbers

import java.util.Scanner;

class Question1 {
    public static void main(String args[]) {
        int number1, number2, number3, valuAfterMultiplication;

        System.out.println("Enter any three values: ");

        Scanner obj1 = new Scanner(System.in);

        number1 = obj1.nextInt();
        number2 = obj1.nextInt();
        number3 = obj1.nextInt();


        valuAfterMultiplication = number1 * number2 * number3;

        System.out.println("value after multiplication is "+valuAfterMultiplication);

    }
}