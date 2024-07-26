import java.util.Scanner;

class IfElseStatement {
    public static void main(String args[]) {
        int userpassword;

        System.out.print("Enter Password: ");
        Scanner obj1 = new Scanner(System.in);

        userpassword = obj1.nextInt();

        if(userpassword == 12345) {
            System.out.println("User Name: ABC");
            System.out.println("User code: 00001");
        }
        else{
            System.out.println("Wrong Password");
        }
    }
}