---
type: concept
title: Classes and Objects
tags: [java, basics, phase-0, oop, classes]
created: 2026-06-09
status: seen
related: ["[[References vs Values]]", "[[Methods]]"]
---

# Classes and Objects

## Intuition
A **class** is a blueprint (a cookie cutter); an **object** is a real thing stamped from it
(one cookie). One class → many independent objects, each with its OWN data.

## Why it exists
Bundles related data + behavior into one custom type instead of loose variables.
Critically for DSA: every data structure (linked list, tree, graph) IS a class — a node
holds data + references to other nodes.

## How it works (the 5 pieces)
1. **Field** — data the object holds (a typed variable inside the class).
2. **Constructor** — special method that runs on `new`, sets up the fields.
3. **`new`** — builds a fresh object.
4. **dot `.`** — reach into an object to access a field/method.
5. **instance method** — behavior that uses the object's own fields (no `static`).

## Java implementation
```java
// MY code (T07_ClassesAndObjects.java)
class Dog {
    String name;                 // FIELD — each object has its own
    int age;

    Dog(String name, int age) {  // CONSTRUCTOR: same name as class, NO return type
        this.name = name;        // this.name = FIELD; name = PARAMETER
        this.age = age;          // `this` = reference to the current object
    }

    void bark() {                // INSTANCE method (no static) — uses the object's field
        System.out.println(name + " says woof");
    }
}

Dog d1 = new Dog("Tjj", 2);      // new builds the object; constructor fills it
d1.bark();                       // "Tjj says woof" — uses d1's OWN name
Dog d2 = new Dog("Rex", 3);      // independent object
System.out.println(d1.age);      // 2   ← proves objects don't share fields
System.out.println(d2.age);      // 3
```

## Constructor — definition & why
- **Definition:** a special method that runs automatically on `new`, to initialize fields.
- **2 rules that make it a constructor:** (1) name = exactly the class name, (2) NO return type
  (not even void — add a return type and it becomes a normal method, NOT run by `new`).
- **Why:** create+fill in one line; *forces* required data (no half-built objects); object is
  valid the instant it's born. If you write your own constructor, Java removes the free `new Dog()`.

## `this`
`this` = a reference to the current object (ties back to [[References vs Values]]).
Needed when a parameter SHADOWS a field (same name): `this.name` = the field, plain `name` = the
parameter. Without `this.`, `name = name` assigns the parameter to itself → field stays null (BUG).
If parameter names differ from fields, `this` isn't needed.

## static vs instance
- **`static`** = belongs to the CLASS. One shared copy. Called `ClassName.method()`. No object.
  (e.g. `Math.max`, `add(a,b)` — only uses parameters.)
- **instance** (no static) = belongs to each OBJECT. Each has its own. Called `object.method()`.
  Must be instance if it uses the object's own fields (like `bark()` reading `name`).

## JavaScript comparison
Java classes are like JS `class` + `constructor` + `this` — BUT Java declares fields with TYPES
at the top, the constructor is named like the class (no `constructor` keyword), and everything is typed.
(Learner is newer to JS classes too, so this was taught ground-up, not via JS.)

## Common mistakes
- Forgetting `this.` when parameter shadows a field → field stays null.
- Giving a "constructor" a return type (`void Dog()`) → it's NOT a constructor anymore.
- Making a method `static` when it needs the object's fields → won't compile / no object to read from.

## Why it matters in DSA (the payoff)
Every data structure is a class with references to other nodes:
```java
class ListNode { int val; ListNode next; }      // linked list (Phase 2)
class TreeNode { int val; TreeNode left, right; } // tree (Phase 4)
```
Combines classes (0.7) + references (0.6). Step 1 of "implement a linked list / reverse a tree" is
always: define the node class.

## Interview tips
- "Is `void Dog()` a constructor?" → No (has a return type). Classic trick.
- Be able to write a `ListNode`/`TreeNode` class from memory — it's the start of many problems.

## Related concepts
- [[References vs Values]] · [[Methods]]
- (next phase) ListNode / TreeNode build directly on this

## Practice problems
- (pure-language item — real DSA problems continue in `problem-solving/`)

## Next problem
> Next: **item 0.8 — Phase 0 mini-build** (a small class combining fields + constructor +
> methods, e.g. BankAccount), then Phase 0 is DONE → Phase 1 (Big-O + arrays).
