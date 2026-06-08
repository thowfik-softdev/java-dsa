---
type: concept
title: References vs Values
tags: [java, basics, phase-0, memory, references]
created: 2026-06-08
status: seen
related: ["[[Variables and Types]]", "[[Conditional Statements]]"]
---

# References vs Values

## Intuition
Every variable stores data one of two ways: **primitives hold the actual value**,
**objects hold a reference (an address)** to where the data lives. This single fact
explains copying behavior and why `==` vs `.equals()` exists.

## Why it exists
Big objects (arrays, lists) can't be cheaply copied every time you assign them, so
Java stores a *reference* (pointer) and copies just the address. Primitives are tiny,
so Java copies the value directly. This split is the foundation of linked lists,
trees, and graphs (nodes connected by references).

## How it works
- **Primitive** (`int`, `double`, `boolean`, `char`...): the box holds the value.
  `b = a` copies the value → independent.
- **Object** (array, `String`, `ArrayList`, custom class): the box holds an address.
  `y = x` copies the address → both point to the SAME object → change via one, the
  other sees it.

## Java implementation
```java
// MY code (T06_References.java) — proved each behavior by running it

// PART 1 — primitives COPY the value
int a = 10;
int b = a;     // copies the VALUE (10)
b = 99;        // changes b only
System.out.println("a: " + a);          // 10  ← a unaffected

// PART 2 — arrays SHARE a reference
int[] x = {1, 2, 3};
int[] y = x;   // y points to the SAME array as x
y[0] = 99;     // changes the one shared array
System.out.println("x[0]: " + x[0]);    // 99  ← x sees the change made via y

// PART 3 — == vs .equals()
int[] p = {1, 2, 3};
int[] q = {1, 2, 3};                    // a NEW array → different address
System.out.println("p == q: " + (p == q));         // false (different objects)
System.out.println("p.equals(q): " + p.equals(q)); // false! arrays' .equals == reference cmp

String s1 = "hello";
String s2 = "hello";
System.out.println("s1 == s2: " + (s1 == s2));         // true  (literals are interned/pooled)
System.out.println("s1.equals(s2): " + s1.equals(s2)); // true  (content match — the SAFE way)
```

## JavaScript comparison
- JS primitives copy; JS objects/arrays share a reference — **same as Java**
  (`let y = x; y[0]=99;` mutates `x` too — the classic "why did my array change?!").
- JS uses `===` for both; Java splits it: `==` = reference (like JS `===` on objects),
  `.equals()` = content. Java *gives* you the content-checker; JS makes you write one.

## Common mistakes
- **`==` on Strings/objects** to compare content → compares address, not value. Use `.equals()`.
- Assuming **same contents = same reference** — NO. Each `{...}` / `new` makes a fresh object.
  `{1,2,3} == {1,2,3}` is `false`.
- **Array `.equals()` trap:** for plain arrays, `.equals()` is reference comparison (same as `==`),
  NOT content. To compare array contents use `Arrays.equals(p, q)`.
- Trusting `==` on Strings because `"hi" == "hi"` is `true` (pooling) — but
  `new String("hi") == new String("hi")` is `false`. Always `.equals()` for content.

## Why it matters later
- **Linked lists / trees / graphs:** nodes connected by references; "two vars point to the
  same node" is the whole idea. "Visited?" checks compare references.
- **Passing arrays to methods:** the method gets the reference, so it can mutate your
  original array (primitives passed to methods are copies — can't).

## Interview tips
- Know `==` vs `.equals()` cold — signals you understand memory.
- The "swap two ints in a method doesn't work, but mutating an array does" question is a
  classic — it's exactly this concept (pass-by-value of the reference).

## Related concepts
- [[Variables and Types]] · [[Conditional Statements]] (where `.equals()` first appeared)
- (next) [[Classes and Objects]] — item 0.7, builds directly on references

## Practice problems
- (pure-language item — DSA problems continue in `problem-solving/`)

## Next problem
> Next: **item 0.7 — Classes & Objects** (DSA-minimal: fields, constructor, `new`, `this`).
> This is where references get powerful — you'll make your own objects.
