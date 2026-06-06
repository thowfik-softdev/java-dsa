// Phase 0 · Item 0.4 — Loops  [Day 3]
// for, while, do-while, enhanced-for, break/continue
// Run: cd src/phase0-java-basics && javac T04_Loops.java && java T04_Loops

public class T04_Loops {        // ← ONE class only
    public static void main(String[] args) {   // ← ONE main only

        // 1) for: 1 → 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("for loop: " + i);
        }

        // 2) while: 10 → 1
        int w = 10;
        while (w >= 1) {
            System.out.println("while loop: " + w);
            w--;
        }

        // 3) do-while: 10 → 1 (runs at least once)
        int d = 10;
        do {
            System.out.println("do while loop: " + d);
            d--;
        } while (d >= 1);

        // 4) enhanced for: print each mark
        int[] marks = {85, 90, 78, 60};
        for (int m : marks) {
            System.out.println("for each loop: " + m);
        }

        // 5) break / continue: 1→20, skip multiples of 3, stop at 15
        for (int i = 1; i <= 20; i++) {
            if (i == 15) break;
            if (i % 3 == 0) continue;
            System.out.println("Current number: " + i);
        }
    }
}
