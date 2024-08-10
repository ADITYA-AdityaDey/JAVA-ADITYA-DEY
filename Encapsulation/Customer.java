import java.util.Scanner;

class Bank {
    private double bal = 10000;
    private int passwd;

    public void deposite(double money) {
        System.out.println("Enter Password: ");
        Scanner s = new Scanner(System.in);
        passwd=s.nextInt();
        if (passwd == 12345) {
            bal = bal + money;
            System.out.println("Deposited Money: " + money);
            System.out.println("Total Balance: " + bal);
        }
        else {
            System.out.println("Invalid Password ....");
        }
    }

    public void withdraw(double money) {
        System.out.println("Enter Password: ");
        Scanner s = new Scanner(System.in);
        passwd = s.nextInt();
        if (passwd == 12345) {
            bal = bal - money;
            System.out.println("Withdrawn Amount: " + money);
            System.out.println("Total Balnce: " + bal);
        }
        else {
            System.out.println("Invalid Password ....");
        }
    }

    public void checkBalance() {
        System.out.println("Enter Password: ");
        Scanner s = new Scanner(System.in);
        passwd = s.nextInt();
        if (passwd == 12345) {
            System.out.println("Total Balnce: " + bal);
        }
        else {
            System.out.println("Invalid Password ....");
        }
    }
}

class Customer {
   public static void main(String[] args) {
    Bank b = new Bank();

    int choice;

    System.out.println("1. Deposite");
    System.out.println("2. Withdraw");
    System.out.println("3. Check Balance");

    System.out.println("Enter Your Choice: ");
    Scanner s = new Scanner(System.in);
    choice = s.nextInt();

    switch(choice) {
        case 1: b.deposite(1000);
        break;
        case 2: b.withdraw(1000);
        break;
        case 3: b.checkBalance();
        break;
        default: System.out.println("Invalid Choice ....");
    }
   }
}