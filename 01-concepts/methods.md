---
type: concept
title: Methods
tags: [java, basics, phase-0, methods, functions]
created: 2026-06-07
status: seen
related: ["[[Loops]]"]
---

# Methods

## Intuition
A method is a **named, reusable block of code** you can call again and again —
optionally giving it **inputs** (parameters) and getting an **output** back.
It's a JavaScript function, with one addition: **types** on the inputs and the output.

## Why it exists
- **Reuse:** write the logic once, call it many times (e.g. run one `findMax` on 6 different arrays).
- **Organization:** give a chunk of logic a name so code reads like a story.
- **Testability:** separate the *algorithm* from the *data* you run it on (exactly how the PASS/FAIL test harness works).
- **It's the container for every algorithm** — every DSA solution you'll write lives inside a method.

## How it works
Anatomy: `static int add(int a, int b) { return a + b; }`
- `static` — the method belongs to the **class itself**, not to an object. Lets methods call each other directly from `main` with no object. **For DSA, methods are always `static`.**
- `int` — the **return type**: what the method hands back.
- `add` — the method **name**.
- `(int a, int b)` — **parameters**: typed inputs.
- `return a + b;` — hands a value back to the caller.

`void` = returns **nothing** (the method just *does* something, like printing — there's no value to store).

## Java implementation
```java
// MY code (T05_Methods.java)
class T05_Methods {
    public static void main(String[] args) {
        int sum = add(5, 3);                 // RETURNS a value -> store it, then use it
        System.out.println("Sum: " + sum);

        int squared = square(4);
        System.out.println("Squared: " + squared);

        greet("Thowfik");                    // VOID call -> nothing comes back

        boolean evenCheck = isEven(10);      // boolean method reads like a yes/no question
        System.out.println("Is 10 even? " + evenCheck);
    }

    static int add(int a, int b) {           // static | return int | name | typed params
        return a + b;
    }

    static int square(int n) {
        return n * n;                        // return type int -> must hand back an int
    }

    static void greet(String name) {         // void = returns NOTHING (just prints)
        System.out.println("Hello, " + name + "!");   // `name` is a VARIABLE, concatenated in
    }

    static boolean isEven(int n) {
        return n % 2 == 0;                   // a comparison IS a boolean -> return it directly
    }
}
```

## JavaScript comparison
```js
function add(a, b) { return a + b; }              // JS — no types
```
```java
static int add(int a, int b) { return a + b; }    // Java — type the params AND the return
```
- Only real differences: declare the **return type** and **each parameter's type**.
- A JS function that just `console.log`s and returns nothing ≈ a Java **`void`** method.
- JS has no `static` keyword for this; in Java it's what lets `main` call `add` directly.

## Brute force / Optimal
n/a — foundational. (Methods are the *container* brute-force and optimal solutions live in.)

## Complexity
n/a here — a method's complexity comes from what's *inside* it (e.g. a linear scan = O(n)).

## Common mistakes
- **Literal placeholder instead of the variable** (hit live): `"Hello, <name>!"` prints the characters `<name>`. A parameter is a **variable** — pull it out and concatenate: `"Hello, " + name + "!"`.
- **The boolean ternary** (hit live): `return cond ? true : false;` is redundant — `cond` is *already* a boolean. Write `return cond;`. (Inverse: `cond ? false : true` → `!cond`.)
- **Return type mismatch:** declaring `int` but returning nothing (or a `double`) won't compile.
- **Forgetting `static`** on a method you call from `main` → compile error ("non-static method cannot be referenced from a static context").

## Interview tips
- Break solutions into small well-named methods — readable code signals clear thinking.
- A method that can't produce a valid answer should **fail loudly** (`throw`), not return a fake value (the contract mindset from [[P01 Max in Array]]).
- Name boolean methods as questions (`isEven`, `hasCycle`) — they read naturally at the call site.

## Related concepts
- [[Loops]]
- (next) References vs values — item 0.6 (`==` vs `.equals()`, primitives copy vs objects share)

## Practice problems
- `sumArray(int[])` — sum via a static method (linear scan inside a method)

## Next problem
> Next: **item 0.6 — References vs values** — why primitives copy but objects share a reference, and `==` vs `.equals()`.
