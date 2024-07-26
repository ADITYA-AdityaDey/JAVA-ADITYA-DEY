import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        
        int Number;

        System.out.print("Enter any Number: ");
        Scanner obj1 = new Scanner(System.in);
        Number = obj1.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(Number * i);
        }
    }
}