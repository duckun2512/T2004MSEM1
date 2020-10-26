package Exam.ex1;

public class Bank {
    private double balance, rate;

    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double calculateInterest() {
        double AnnualInterestRate = rate/10*100;
        return balance*(AnnualInterestRate/1200);
    }

    public String toString() {
        return "Monthly Interest is: $" + calculateInterest();
    }
}
