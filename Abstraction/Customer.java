import java.util.Scanner;

abstract class Bank {
    public String bankName = "BANK1";
    public String bankIFSC = "BANK1123";

    public void bankDetail() {
        System.out.println("Bank Name: " + bankName + " | " + "Bank IFSC: " + bankIFSC);
    }

    abstract void deposite();
    abstract void withdraw();
    abstract void checkBalance();
}

class BankService extends Bank {
    private double bal = 10000;
    private int passwd;
    private double money;

    public void deposite() {
        System.out.println("Enter Password: ");
        Scanner s = new Scanner(System.in);
        passwd = s.nextInt();

        if (passwd == 12345) {
            System.out.println("Enter Deposite Amount: ");
            money = s.nextDouble();

            bal = bal + money;
            System.out.println("Deposited Amount: " + money);
            System.out.println("Total Balance: " + bal);
        }
        else {
            System.out.println("Invalid Password ....");
        }
    }

    public void withdraw() {
        System.out.println("Enter Password: ");
        Scanner s = new Scanner(System.in);
        passwd = s.nextInt();

        if (passwd == 12345) {
            System.out.println("Enter Withdraw Amount: ");
            money = s.nextDouble();

            bal = bal - money;
            System.out.println("Withdrawn Amount: " + money);
            System.out.println("Total Balance: " + bal);
        }
        else {
            System.out.println("Invalid Password ....");
        }
    }

    public void checkBalance() {
        System.out.println("Enter Pasword: ");
        Scanner s = new Scanner(System.in);
        passwd = s.nextInt();

        if (passwd == 12345) {
            System.out.println("Total Balance: " + bal);
        }
        else {
            System.out.println("Invalis Password ....");
        }
    }
}

class Customer {
    public static void main(String[] args) {
        BankService b = new BankService();
        b.bankDetail();

        int choice;
        System.out.println("1. Deposite");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");

        System.out.println("Enter Your Choice: ");
        Scanner s = new Scanner(System.in);
        choice = s.nextInt();

        switch(choice) {
            case 1: b.deposite();
            break;
            case 2: b.withdraw();
            break;
            case 3: b.checkBalance();
            break;
            default: System.out.println("Invalid Choice ....");
        }
    }
}