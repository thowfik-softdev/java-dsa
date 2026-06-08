// Phase 0 · Item 0.6 — References vs Values  [Day 5]
// Primitives COPY the value; objects (arrays/String/etc.) SHARE a reference.
// == compares address (same object?); .equals() compares content (same value?).
// Run: cd src/phase0-java-basics && javac T06_References.java && java T06_References

public class T06_References {
    public static void main(String[] args) {

        // ── PART 1: primitives COPY (changing the copy doesn't touch the original)
        // TODO:
        int a = 10;
        int b = a; // copies the VALUE (10)
        b = 99; // changes b, but a is unaffected
        System.out.println("a: " + a); // expect 10

        // ── PART 2: arrays SHARE a reference (change via one, the other sees it)
        // TODO:
        int[] x = { 1, 2, 3 };
        int[] y = x; // y points to the SAME array as x
        y[0] = 99; // changes the array that both x and y point to
        System.out.println("x[0]: " + x[0]); // expect 99 (x sees the change made via y)

        // ── PART 3: == vs .equals() 
        // TODO:
        int[] p = { 1, 2, 3 };
        int[] q = { 1, 2, 3 }; // a NEW array → different address
        System.out.println("p == q: " + (p == q)); // expect false (different arrays)
        System.out.println("p.equals(q): " + p.equals(q)); // expect false (default .equals() is same as == for arrays)

        String s1 = "hello";
        String s2 = "hello";
        System.out.println("s1 == s2: " + (s1 == s2)); // expect true (string literals are interned)
        System.out.println("s1.equals(s2): " + s1.equals(s2));

    }
}
