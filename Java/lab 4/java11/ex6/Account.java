package ex6;

public class Account {
    private String id;
    private String name;
    private int balance;

    public Account() {
        balance = 0;
    }

    public Account(String i, String n) {
        id = i;
        name = n;
    }

    public Account(String i, String n, int b) {
        id = i;
        name = n;
        balance = b;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        this.balance = amount;
        return this.balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            return balance-amount;
        } else {
            System.out.println("Amount Exceeded...");
            return balance;
        }
    }

    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            another.debit(amount);
        } else {
            System.out.println("Amount Exceeded...");
        }
        return balance;
    }

    public String toString() {
        return "Account[id=" + id + " name=" + name + " balance=" + balance + "]";
    }
}
