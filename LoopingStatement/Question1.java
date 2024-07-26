import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        String userName;
        System.out.print("Enter your name: ");
        Scanner obj1 = new Scanner(System.in);
        userName = obj1.nextLine();

        System.out.println("Welcome " + userName);

    }
}