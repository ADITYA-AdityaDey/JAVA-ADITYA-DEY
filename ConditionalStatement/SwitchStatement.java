import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        int value1, value2, userChoice;

        System.out.print("Enter any two value: ");
        Scanner obj1 = new Scanner(System.in);

        value1 = obj1.nextInt();
        value2 = obj1.nextInt();

        System.out.print("Enter yout choice 1(+), 2(-), 3(*), 4(/): ");
        Scanner obj2 = new Scanner(System.in);

        userChoice = obj2.nextInt();


        switch (userChoice) {
            case 1: System.out.println("Sum is: " + (value1 + value2));
                break;
            case 2: System.out.println("Subtraction is: " + (value1 - value2));
                break;
            case 3: System.out.println("Multiplication is : " + (value1 * value2));
                break;
            case 4: System.out.println("Division is: " + (value1 / value2));
                break;
            default: System.out.println("Invalid Choice...!");
        }
    }
}