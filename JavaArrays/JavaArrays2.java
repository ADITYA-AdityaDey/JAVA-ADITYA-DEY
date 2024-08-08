import java.util.Scanner;

public class JavaArrays2 {
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.print("Enter Array Elements: ");
        Scanner obj = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            a[i] = obj.nextInt();
        }

        System.out.println("Printing Array Elements: ");

        for (int b : a) {
            System.out.print(b + " ");
        }
    }
}