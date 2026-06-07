// Phase 0 · Item 0.5 — Methods  [Day 4]
// A method = a named, reusable block of code (= a JS function, but with TYPES).
// Covers: parameters (typed inputs), return types, `void` (returns nothing), `static`.
// Key idea: `static` lets methods in this class call each other directly from main
//           (no object needed). For DSA, methods are ALWAYS static.
// Run: cd src/phase0-java-basics && javac T05_Methods.java && java T05_Methods

class T05_Methods {
    public static void main(String[] args) {
        // Call a method that RETURNS a value -> store it, then use it.
        int sum = add(5, 3);
        System.out.println("Sum: " + sum);

        int squared = square(4);
        System.out.println("Squared: " + squared);

        // Call a VOID method -> nothing comes back, it just does its job (prints).
        greet("Thowfik");

        // A boolean-returning method reads like a yes/no question.
        boolean evenCheck = isEven(10);
        System.out.println("Is 10 even? " + evenCheck);
    }

    // static | returns int | name | (typed params). Hands back a + b.
    static int add(int a, int b) {
        return a + b;
    }

    static int square(int n) {
        return n * n;            // return type is int -> must hand back an int
    }

    // `void` = returns NOTHING. It prints; there is no value to store.
    static void greet(String name) {
        System.out.println("Hello, " + name + "!");   // `name` is a VARIABLE, concatenated in
    }

    // A comparison (n % 2 == 0) IS already a boolean -> return it directly.
    static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
