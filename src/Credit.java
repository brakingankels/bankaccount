public class Credit extends BankAccount{
    private double creditLimit;

    public Credit(double initialBalance, double creditLimit) {
        super(initialBalance);
        this.creditLimit = creditLimit;

    }
    @Override
    public void withdraw(double amount) {
        if(amount > 0 && balance - amount >=creditLimit) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }else{
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}
