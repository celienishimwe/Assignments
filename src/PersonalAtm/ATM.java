package PersonalAtm;

public class ATM {
    public double balance;

    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited " + amount );
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        }
        else if (amount > balance) {
            System.out.println("Error: Insufficient Saving.");
        }
        else {
            balance = balance - amount;
            System.out.println("Withdrew " + amount);
        }
    }

    public double checkBalance() {
        return balance;
    }
}
