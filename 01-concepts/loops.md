---
type: concept
title: Loops
tags: [java, basics, phase-0, loops, control-flow]
created: 2026-06-06
status: seen
related: ["[[Conditional Statements]]"]
---

# Loops

## Intuition
A loop says: **"keep doing this until a condition tells you to stop."**
Coming from JS, every loop shape is nearly identical —
the day was 90% syntax-mapping, with two real gotchas:
`continue` skips everything below it, and a counter declared in a `for` header is scoped to that loop.

## Why it exists
Without loops you'd copy-paste the same statement `n` times — impossible when `n` isn't known until runtime.
Loops also become the unit of **cost** later:
one loop over `n` items = O(n), a loop inside a loop = O(n²). This is where Big-O intuition begins.

## How it works
Four shapes, each for a different situation:
- **`for`** — count-controlled; use when you know how many times / need the index `i`.
- **`while`** — condition-controlled; loop *until* something flips, count unknown.
- **`do-while`** — like `while`, but the check is at the **bottom**, so the body always runs **at least once**.
- **enhanced `for`** (for-each) — walk every element of an array directly; use when you want values, not indices.

`break` exits the loop immediately. `continue` jumps to the next iteration, **skipping every line below it** in the body.

## Java implementation
```java
// MY code (T04_Loops.java) — all four loop shapes in one main.
public class T04_Loops {
    public static void main(String[] args) {

        // 1) for: 1 → 10. Counter `i` is typed (int) and scoped to THIS loop.
        for (int i = 1; i <= 10; i++) {          // <= 10 (not < 10) → includes 10
            System.out.println("for loop: " + i);
        }

        // 2) while: 10 → 1. Counter lives OUTSIDE; we decrement it ourselves.
        int w = 10;
        while (w >= 1) {                          // stop once w drops below 1
            System.out.println("while loop: " + w);
            w--;                                  // forget this → infinite loop
        }

        // 3) do-while: 10 → 1. Body runs once BEFORE the check (check is at bottom).
        int d = 10;
        do {
            System.out.println("do while loop: " + d);
            d--;
        } while (d >= 1);

        // 4) enhanced for: read the `:` as "in". Gives each VALUE, no index needed.
        int[] marks = {85, 90, 78, 60};
        for (int m : marks) {                     // ≈ JS  for (const m of marks)
            System.out.println("for each loop: " + m);
        }

        // 5) break / continue: 1→20, skip multiples of 3, stop at 15.
        for (int i = 1; i <= 20; i++) {
            if (i == 15) break;                   // ← MUST be checked before continue (see mistake below)
            if (i % 3 == 0) continue;             // skip 3,6,9,12 → jump to next i
            System.out.println("Current number: " + i);
        }
        // prints: 1 2 4 5 7 8 10 11 13 14
    }
}
```

## JavaScript comparison
- `for (int i = 0; ...)` vs JS `for (let i = 0; ...)` — only difference is the **type** on the counter.
- `while` / `do-while` — identical to JS.
- enhanced `for (int m : marks)` ≈ JS `for (const m of marks)` (`:` = `of`). Java has no `for...in`-for-index equivalent here.
- `break` / `continue` — identical to JS.
- Counter scope: `i` in a `for` header is block-scoped (like JS `let`) — it doesn't exist after the loop.

## Brute force / Optimal
n/a — foundational. (Loops are the *tool* brute-force and optimal solutions are built from.)

## Complexity
- One loop over `n` → **O(n)**. Nested loop → **O(n²)**. Formalized in Phase 1; start noticing it now.

## Common mistakes
- **`continue` ordering bug (hit live today):** `continue` skips every line **below** it in the loop body.
  My first version put `if (i == 15) break;` *after* `if (i % 3 == 0) continue;`.
  Since `15 % 3 == 0`, the `continue` fired first and the `break` was never reached → it didn't stop at 15.
  **Fix:** put the `break` check *above* the `continue`. Order matters.
- **Boundary off-by-one:** `i <= 10` includes 10; `i < 10` stops at 9. State the boundary on purpose.
- **Forgetting the update** (`i++` / `w--`) inside a `while` → infinite loop.
- **`do-while` condition direction:** `do {...} while (i <= 1)` with `i=10` runs the body **once** then stops
  (proves "runs at least once", but is the wrong direction for a countdown — use `i >= 1`).
- **Missing semicolon** on a statement → won't compile (Java is strict; JS often forgives).

## Interview tips
- Say your loop bound out loud (`<` vs `<=`) — off-by-one is a classic bug.
- Nested loops = O(n²); mention complexity as you write the loop, not after.
- A guard-clause (`if (cond) continue;` then the real work below) is cleaner than `if/else` inside a loop.

## Related concepts
- [[Conditional Statements]]
- (next) [[Methods]] — item 0.5

## Practice problems
- (pure-language item — DSA problems start after Phase 0)

## Next problem
> Next: **item 0.5 — Methods** (declaring, parameters, return types, `static`, `void`). JS functions → Java methods, now with types.
