public class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;

    }
    public void deposit(double amount) {
        if(amount > 0 ) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        }else{
            System.out.println("Invalid deposit.");
        }
    }
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance ) {
            balance -= amount;
            System.out.println("Withdrawel successful. New balance: " + balance);
        }else{
            System.out.println("Invalid withdrawel amount or insufficient funds.");
        }
    }
    public double getsBalance() {
        return balance;
    }
}
