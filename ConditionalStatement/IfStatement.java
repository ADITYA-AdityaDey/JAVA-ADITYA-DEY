import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {

        int userPasword;

        System.out.print("Enter Password: ");

        Scanner obj1 = new Scanner(System.in);

        userPasword = obj1.nextInt();

        if(userPasword == 12345) {
            System.out.println("User Name: ABC");
            System.out.println("User Code: 000001");
        }

    }
}