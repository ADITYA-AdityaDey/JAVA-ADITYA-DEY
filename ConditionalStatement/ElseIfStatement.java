import java.util.Scanner;

public class ElseIfStatement {
    public static void main(String[] args) {
        int studentMarks;

        System.out.println("Enter Marks: ");
        Scanner obj1 = new Scanner(System.in);

        studentMarks = obj1.nextInt();

        if(studentMarks >= 60 && studentMarks <= 100) {
            System.out.println("Grade A");
        }
        else if(studentMarks >= 45 && studentMarks < 60) {
            System.out.println("Grade B");
        }
        else if(studentMarks >= 30 && studentMarks < 45) {
            System.out.println("Grade C");
        }
        else {
            System.out.println("Grade D");
        }
    }
}