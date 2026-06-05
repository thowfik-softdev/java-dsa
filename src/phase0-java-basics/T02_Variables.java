// Phase 0 · Item 0.2 — Variables & Data Types  [DONE]
// Concept: int, double, boolean, char, String. char='single', String="double".
//          Integer-division trap: int/int chops the decimal (7/2 = 3).
// Run:  cd src/phase0-java-basics && javac T02_Variables.java && java T02_Variables

public class T02_Variables {
    public static void main(String[] args) {
        int age = 23;
        String name = "Thowfik";
        char grade = 'A';
        double height = 6.2;
        boolean isMarried = false;

        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Height: " + height);
        System.out.println("Is Married: " + isMarried);

        // int vs double division
        System.out.println(7 / 2);     // 3   (int / int -> decimal chopped)
        System.out.println(7.0 / 2);   // 3.5 (one double -> keeps decimal)
        System.out.println(7 / 2.0);   // 3.5
    }
}
