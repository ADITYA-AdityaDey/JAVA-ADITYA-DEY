import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        int num;
        System.out.print("Enter any Number: ");
        Scanner obj1 = new Scanner(System.in);
        num = obj1.nextInt();

        int i = 1;

        do {
            System.out.println((num + " * " + i) + " = " + (num * i));
            i++;
        }
        while (i <= 10);
    }
}