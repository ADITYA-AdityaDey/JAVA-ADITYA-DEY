import java.util.Scanner;

public class NestedIfStatement {
    public static void main(String[] args) {
        int number1, number2, number3;

        System.out.print("Enter any 3 numbers: ");
        Scanner obj1 = new Scanner(System.in);

        number1 = obj1.nextInt();
        number2 = obj1.nextInt();
        number3 = obj1.nextInt();

        if (number1 > number2) {
            if(number1 > number3) {
               System.out.println("Maximum Number is " + number1);
            }
            else {
                System.out.println("Maximum Number is " + number3);
            }
        }
        else {
            if (number2 > number3) {
                System.out.println("Maximum Number is " + number2);
            }
            else {
                System.out.println("Maximum Number is " + number3);
            }
        }
    }
}