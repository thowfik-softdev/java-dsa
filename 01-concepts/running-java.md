---
type: concept
title: Running a Java Program
tags: [java, basics, phase-0]
created: 2026-06-03
status: seen
related: ["[[Variables and Types]]"]
---

# Running a Java Program

## Intuition
A Java program is a list of instructions inside a `class`, and the computer
starts running them at a special method called `main`. Coming from JavaScript,
the biggest new idea is: **Java is strict about types** (you must label them).

## Why it exists
JavaScript runs your file directly (`node file.js`). Java instead asks you to
**compile** first — translating your human-readable code into a form the
machine runs — which lets it catch mistakes (like type errors) *before* the
program ever runs.

## How it works
Every program has three parts:
- `public class Day1 { }` — a container; its name must match the file `Day1.java`.
- `public static void main(String[] args) { }` — the **entry point**; Java runs this first.
- `System.out.println(...)` — prints a line (this is Java's `console.log`).

## Java implementation
```java
public class Day1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

## JavaScript comparison
| Java | JavaScript |
|------|------------|
| `System.out.println("hi")` | `console.log("hi")` |
| `public static void main(...)` | top level of the file run by `node file.js` |
| `int day = 1;` (typed) | `let day = 1;` (untyped) |
| compile then run: `javac` → `java` | run directly: `node` |

Key difference: **JS guesses types; Java makes you declare them.**
e.g. `5 + "5"` is `"55"` in JS because JS auto-converts — Java won't let you be that loose.

## Brute force
n/a (foundational concept, no algorithm yet).

## Optimal
n/a.

## Complexity
n/a — complexity reasoning starts in Phase 1. (Preview: a loop over n items = O(n).)

## Common mistakes
- Class name not matching the file name (`class Day1` needs `Day1.java`).
- Forgetting the semicolon `;` at the end of a statement (JS is forgiving here; Java is not).
- Running `java Day1.java` instead of `java Day1` — you run the **name**, not the file.
- Being in the wrong folder — `cd` into `src/` first, since commands run where you're standing.

## Interview tips
- Foundational; not asked directly. But fluency here (writing/running Java fast) is assumed in every interview.

## Related concepts
- [[Variables and Types]] — next up (item 0.2)

## Practice problems
- (none yet — first real exercise comes with item 0.2)

## Next problem
> Next session: **item 0.2 — Variables & data types.** We make Java's strictness work *for* you.
