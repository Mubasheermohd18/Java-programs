import java.util.Scanner;

class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;

    BankAccount() {
        accountNumber = "0000";
        accountHolder = "Unknown";
        balance = 0.0;
    }

    BankAccount(String accNum, String holder, double bal) {
        accountNumber = accNum;
        accountHolder = holder;
        balance = bal;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class Constructor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accNum = sc.nextLine();
        System.out.print("Enter account holder name: ");
        String holder = sc.nextLine();
        System.out.print("Enter balance: ");
        double bal = sc.nextDouble();

        BankAccount b = new BankAccount(accNum, holder, bal);
        b.displayDetails();
        sc.close();
    }
}
