public class Debit extends BankAccount{
    public Debit(double initialBalance) {
        super(initialBalance);
    }
    @Override
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }else{
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}
