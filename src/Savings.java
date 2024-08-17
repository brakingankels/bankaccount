public class Savings extends BankAccount {
    private double interestRate;
    public Savings(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;

    }
    public void addInterest() {
        double interst = balance * interestRate/100;
        deposit(interst);
        System.out.println("Interest added: " + interst);
    }
}
