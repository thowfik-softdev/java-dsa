// Phase 0 · Item 0.8 — Mini-Build (CAPSTONE)  [Day 7]
// Combine EVERYTHING: fields (0.2), conditionals (0.3), methods (0.5),
//                     references (0.6), classes/constructor/this (0.7).
// Run: cd src/phase0-java-basics && javac T08_BankAccount.java && java T08_BankAccount

// ── The runnable class (must match the file name) ───────────────────────
public class T08_BankAccount {
    public static void main(String[] args) {
        // TODO STEP 5 — create an account with owner "Thowfik" and balance 100.0
        BankAccount bankAccount = new BankAccount("Thowfik", 1000.0);

        // TODO STEP 6 — run these in order:
        bankAccount.deposit(50); // 1000 -> 1050
        bankAccount.withdraw(30); // 1050 -> 1020
        bankAccount.withdraw(500); // too much -> "Insufficient funds" (balance stays 1020)
        bankAccount.withdraw(2000); // invalid -> "Invalid deposit" (balance stays 1020)
        bankAccount.printBalance(); // -> Thowfik's balance: $120.0
    }
}

// ── Your class (the blueprint) ──────────────────────────────────────────
class BankAccount {
    // TODO STEP 1 — FIELDS:
    // a String owner
    // a double balance
    String owner;
    double balance;

    // TODO STEP 2 — CONSTRUCTOR: BankAccount(String owner, double balance)
    // set both fields with this.
    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // TODO STEP 3 — METHODS (instance, no static):
    // void deposit(double amount)
    // if amount > 0 -> balance += amount
    // else -> print "Invalid deposit"
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
            System.out.println("New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit");
        }
    }

    //
    // void withdraw(double amount)
    // if amount <= balance -> balance -= amount
    // else -> print "Insufficient funds"
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount);
            System.out.println("New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    //
    // void printBalance()
    // print: owner + "'s balance: $" + balance
    void printBalance() {
        System.out.println(owner + "'s balance: $" + balance);
    }

}
