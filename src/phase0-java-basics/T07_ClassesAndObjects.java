// T07_ClassesAndObjects.java
// Concept 0.7 — Classes & Objects (DSA-minimal): fields, constructor, new, instance method, this
// Run (from this folder):  javac T07_ClassesAndObjects.java && java T07_ClassesAndObjects

// ── PART 1: define a class (the blueprint) ──────────────────────────────
// A helper class can live in the same file. Only the PUBLIC class must match
// the file name; this 'Dog' class needs no 'public'.

class Dog {
    // STEP 1 — FIELDS (what a Dog HAS).
    // Declare two fields (just declare them, no values yet):
    // a String called name
    // an int called age
    String name;
    int age;

    // STEP 2 — CONSTRUCTOR (runs when you write `new Dog(...)`).
    // Rules: same name as the class (Dog), NO return type (not even void).
    // Take two parameters: (String name, int age).
    // Inside, copy each parameter into the matching field using `this.`
    // this.name = name; // 'this.name' is the FIELD; 'name' is the PARAMETER
    // (Without `this.` Java can't tell the field from the parameter.)
    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // STEP 3 — INSTANCE METHOD (what a Dog DOES).
    // Write a method: void bark()
    // It prints exactly: <name> says woof
    // It can read the field `name` directly (no parameter needed).
    void bark() {
        System.out.println(name + " says woof");
    }

}

// ── PART 2: use the class (make objects) ────────────────────────────────
public class T07_ClassesAndObjects {
    public static void main(String[] args) {
        // STEP 4 — build a Dog object with `new`, passing a name + age.
        // Pattern: Dog d1 = new Dog("Rex", 3);
        Dog d1 = new Dog("Tjj", 2);

        // STEP 5 — call its instance method: d1.bark();
        d1.bark();

        // STEP 6 — build a SECOND, independent Dog (different name + age)
        // and bark() it too. This proves each object holds its OWN data.
        Dog d2 = new Dog("Rex", 3);
        d2.bark();

        // STEP 7 (observe) — print d1's age and d2's age on their own lines,
        // to confirm the two objects do not share fields.
        System.out.println(d1.age);
        System.out.println(d2.age);

    }
}
