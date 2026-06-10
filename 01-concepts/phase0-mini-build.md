---
type: concept
title: Phase 0 Mini-Build (BankAccount)
tags: [java, basics, phase-0, capstone]
created: 2026-06-10
status: seen
related: ["[[Classes and Objects]]", "[[Methods]]", "[[Conditional Statements]]"]
---

# Phase 0 Mini-Build — BankAccount (Capstone)

## Intuition
A small class that holds STATE (balance) and exposes BEHAVIOR (deposit/withdraw)
with rules. Proves the whole Java foundation works together, not as isolated snippets.

## What it combined (all of Phase 0)
- Fields & types (0.2): `String owner`, `double balance`
- Conditionals (0.3): `if (amount > 0)`, `if (amount <= balance)`
- Methods (0.5): `deposit`, `withdraw`, `printBalance`
- References (0.6): the object passed/used
- Classes/constructor/this (0.7): the whole structure

## Java implementation
```java
class BankAccount {
    String owner;
    double balance;

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) { balance += amount; }
        else { System.out.println("Invalid deposit"); }
    }

    void withdraw(double amount) {
        if (amount <= balance) { balance -= amount; }   // guard BEFORE mutating
        else { System.out.println("Insufficient funds"); }
    }

    void printBalance() {
        System.out.println(owner + "'s balance: $" + balance);
    }
}
```

## Key lesson — TEST BOTH BRANCHES
Code can be CORRECT but the TEST may never exercise the edge case.
First run: `withdraw(500)` on a 1020 balance succeeded — so "Insufficient funds" NEVER
ran, meaning the rejection path was unproven. Fix: add a withdrawal that actually exceeds
the balance (`withdraw(2000)`) so the `else` fires. **Always test the failing path, not just
the happy path** — this matters in DSA/interviews (empty input, not-found, overflow...).

## Common mistakes
- Test data that never triggers the `else` branch → you "pass" without proving it works.
- Validating AFTER mutating instead of before (always guard first).

## Interview tips
- "Walk me through your test cases" — show you cover both the valid and invalid paths.

## Related concepts
- [[Classes and Objects]] · [[Methods]] · [[Conditional Statements]]

## Next problem
> 🎓 PHASE 0 COMPLETE. Next: **Phase 1 — Big-O intuition** (1.1), then real arrays/DSA.
