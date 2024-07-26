import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        int num;
        System.out.print("Enter any Number: ");
        Scanner obj1 = new Scanner(System.in);
        num = obj1.nextInt();

        int i = 1;
        while (i <= 10) {
            System.out.println(num * i);
            i++;
        }
    }
}