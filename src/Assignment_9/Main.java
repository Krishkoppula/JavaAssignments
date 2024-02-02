package Assignment_9;


class BankAccount {
    private double balance = 0;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        System.out.println("Current Balance: $" + balance);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("Current Balance: $" + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal not allowed.");
        }
    }
    protected double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    @Override
    void withdraw(double amount) {
        if (getBalance() - amount >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal not allowed. Minimum balance of $100 must be maintained.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();

        savingsAccount.deposit(200);
        savingsAccount.withdraw(50);
        savingsAccount.withdraw(30);
        savingsAccount.withdraw(30);
    }
}
