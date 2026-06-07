// Shared test framework for problem-solving · 01-arrays
// A reusable PASS/FAIL runner with colored, boxed output + a summary line.
// Every P0x problem in THIS folder uses it — write once, reuse everywhere.
//
// Java note: folder names like "01-arrays" can't be packages (invalid
// identifiers), so this lives once PER CATEGORY FOLDER and is compiled
// automatically by `javac *.java`. Copy it into each new category folder.
//
// API:
//   TestRunner.start("P0x - Title");                 // header + reset counters
//   TestRunner.check(inputArray, expected, got);     // got = yourMethod(inputArray)
//   TestRunner.summary();                            // footer: X/N passed

import java.util.Arrays;

public class TestRunner {
    static final String GREEN = "[32m";
    static final String RED   = "[31m";
    static final String BOLD  = "[1m";
    static final String RESET = "[0m";
    static final String BAR   = "=".repeat(54);
    static final String THIN  = "-".repeat(54);

    static int passed = 0;
    static int total  = 0;

    static void start(String title) {
        passed = 0;
        total = 0;
        System.out.println(BAR);
        System.out.println(BOLD + "  " + title + RESET);
        System.out.println(BAR);
    }

    // Compare a computed result against the expected value, print + count it.
    static void check(int[] input, int expected, int got) {
        total++;
        boolean ok = (got == expected);
        if (ok) passed++;
        String tag = ok ? GREEN + "PASS" + RESET : RED + "FAIL" + RESET;
        System.out.printf("  %s   input=%-16s exp=%-5d got=%-5d%n",
                tag, Arrays.toString(input), expected, got);
    }

    static void summary() {
        System.out.println(THIN);
        boolean all = (passed == total);
        String color = all ? GREEN : RED;
        String mark  = all ? "ALL GREEN" : (total - passed) + " FAILED";
        System.out.println(BOLD + color + "  " + passed + "/" + total + " passed   " + mark + RESET);
        System.out.println(BAR);
    }
}
