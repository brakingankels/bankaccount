import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose account type: (1) Savings (2) Debit (3) Credit");
        int choice = scanner.nextInt();

        BankAccount account = null;

        switch (choice) {
            case 1:
                System.out.println("Enter initial balance for Savings account:");
                double savingsBalance = scanner.nextDouble();
                System.out.println("Enter interest rate:");
                double interestRate = scanner.nextDouble();
                account = new Savings(savingsBalance, interestRate);
                break;
            case 2:
                System.out.println("Enter initial balance for Debit account:");
                double debitBalance = scanner.nextDouble();
                account = new Debit(debitBalance);
                break;
            case 3:
                System.out.println("Enter initial balance for Credit account:");
                double creditBalance = scanner.nextInt();
                System.out.println("Enter credit limit:");
                double creditLimit = scanner.nextDouble();
                account = new Credit(creditBalance,creditLimit);
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }
        boolean exit = false;
        while(lexit) {
            System.out.println("\nChoose an action: (1) Deposit (2) Withdraw (3) Check balance");
            int action = scanner.nextInt();

            switch(action) {
                case 1:
                    System.out.println("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current balance " + account.getsBalance());
            }
        }
    }
}