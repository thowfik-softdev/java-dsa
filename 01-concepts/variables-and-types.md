---
type: concept
title: Variables and Types
tags: [java, basics, phase-0, types]
created: 2026-06-03
status: seen
related: ["[[Running a Java Program]]"]
---

# Variables and Types

## Intuition
A variable is a labeled box that holds a value. In Java, unlike JavaScript,
you must say **what kind** of value the box holds (its *type*) when you create it.

## Why it exists
JavaScript has one `let` for everything and figures out the kind at runtime.
Java makes you declare the type so it can catch mistakes *before* the program
runs and so it knows exactly how to store/compute the value. Strictness = safety.

## How it works
Pattern: `type name = value;`

The 5 core types:
| Type | Holds | Example | Quotes |
|------|-------|---------|--------|
| `int` | whole numbers | `int age = 23;` | — |
| `double` | decimals | `double height = 6.2;` | — |
| `boolean` | true/false | `boolean isMarried = false;` | — |
| `char` | ONE character | `char grade = 'A';` | single `' '` |
| `String` | text | `String name = "Thowfik";` | double `" "` |

## Java implementation
```java
int age = 23;
double height = 6.2;
boolean isMarried = false;
char grade = 'A';
String name = "Thowfik";
System.out.println("Age: " + age);   // + joins values into the string
```

## JavaScript comparison
- JS: `let x = 5;` (one keyword, any value). Java: pick the type — `int x = 5;`.
- JS: `5` and `3.14` are both "number". Java: `5` is `int`, `3.14` is `double` — **different types**.
- JS: `'A'` and `"A"` are the same. Java: `'A'` is a `char`, `"A"` is a `String` — **different**.
- Naming: both use `camelCase` (`isMarried`).

## Brute force / Optimal
n/a (foundational).

## Complexity
n/a.

## Common mistakes
- **Integer division trap:** `int / int` throws away the decimal — `7 / 2` is `3`, NOT `3.5`.
  To keep decimals, make one side a `double`: `7.0 / 2` → `3.5`, `(double) 7 / 2` → `3.5`.
  (This bites in averages, midpoints, percentages.)
- Using double quotes for a `char` (`char c = "A";` ❌ → must be `'A'`).
- Putting a decimal into an `int` (`int x = 6.2;` ❌ — won't compile).

## Interview tips
- For an array midpoint, `(left + right) / 2` uses integer division *on purpose* (you want a whole index).
- Be conscious whether you're in "int-land" (chops) or "double-land" (keeps decimals).

## Related concepts
- [[Running a Java Program]]
- (next) [[Conditional Statements]] — item 0.3

## Practice problems
- (none yet — pure-language item)

## Next problem
> Next session: **item 0.3 — Conditional statements** (`if/else`, `switch`).
