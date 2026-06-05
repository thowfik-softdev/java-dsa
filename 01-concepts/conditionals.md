---
type: concept
title: Conditional Statements
tags: [java, basics, phase-0, conditionals, switch]
created: 2026-06-04
status: seen
related: ["[[Variables and Types]]"]
---

# Conditional Statements

## Intuition
Conditionals let a program make decisions: "if this is true, do that, otherwise do something else."
Coming from JS, `if/else` and all operators are identical — the only real new things are
`.equals()` for Strings and the `switch` fall-through behavior.

## Why it exists
Programs need to branch — do different things based on data (grades, user input, state).
Without conditionals every program would run the exact same steps every time.

## How it works
- `if / else if / else` checks top-to-bottom and runs the **first** true branch, then skips the rest.
  → put the **strictest condition first** (else a looser one matches early).
- **Separate `if`s** are independent — more than one can run.
  **Chained `if/else if`** — only ONE runs.
- `switch` matches a value to a `case`, jumps there, and runs lines downward until `break`.

## Java implementation
```java
// MY code (T03_Conditionals.java) — explored several conditional forms
String name = "Thowfik";
int marks = 85;
String day = "Monday";

// .equals() for Strings (NOT ==). Two SEPARATE ifs → both can run.
if (name.equals("Thowfik")) {
    System.out.println("Welcome, " + name + "!");
}
if (!name.equals("Juhair")) {            // ! = NOT
    System.out.println("This user is not Thowfik");
}

// Chained if/else if → only ONE grade prints. >= keeps the boundary inclusive.
if (marks >= 90) {
    System.out.println("Grade: A");
} else if (marks >= 80) {                // 85 lands here → "Grade: B"
    System.out.println("Grade: B");
} else if (marks >= 70) {
    System.out.println("Grade: C");
} else {
    System.out.println("Grade: F");
}

// switch on a String. EVERY case needs break, or it "falls through".
switch (day) {
    case "Monday":
        System.out.println("It's Monday");
        break;                            // ← without this, it runs Tuesday too!
    case "Tuesday":
        System.out.println("It's Tuesday");
        break;
    // ... Wed/Thu/Fri ...
    default:
        System.out.println("It's the weekend!");
}
```

## JavaScript comparison
- `if/else if/else`, `>` `<` `>=` `<=` `==` `!=`, `&&` `||` `!` — **identical to JS**.
- **String compare differs:** JS `name === "x"` works; Java needs `name.equals("x")` (NOT `==`).
- `switch` works the same as JS — including String cases and the fall-through-needs-`break` rule.

## Brute force / Optimal
n/a (foundational).

## Complexity
n/a.

## Common mistakes
- **`>` vs `>=` boundary bug:** "≥ 75" must use `>=`, not `>` (off-by-one — huge in DSA later).
- **`==` on Strings** instead of `.equals()` → compares memory, not text. Use `.equals()`.
- **Forgetting `break` in switch** → fall-through: it runs the matched case AND every case below until a `break`.
  (Discovered this live: `day="Monday"` with no break printed Monday AND Tuesday.)
- Wrong order in `if/else if` (loose condition first swallows stricter cases).

## How switch REALLY works (the deep bit)
`switch` matches the value **once** to pick an *entry point*, then just runs lines downward.
The `case` labels after the entry are **signposts it ignores** — only `break` stops the walk.
That's why a no-break switch on `x=2` prints `two, three, other` (everything from case 2 down).
Fall-through is occasionally useful: `case "Sat": case "Sun":` → shared "Weekend" code.

## Interview tips
- Boundary conditions (`>=` vs `>`) are a classic source of bugs — state them explicitly.
- Know `.equals()` vs `==` cold; it signals you understand references.

## Related concepts
- [[Variables and Types]]
- (next) [[Loops]] — item 0.4

## Practice problems
- (pure-language item — DSA problems start after Phase 0)

## Next problem
> Next: **item 0.4 — Loops** (for / while / do-while). I'll fly through given my JS background.
