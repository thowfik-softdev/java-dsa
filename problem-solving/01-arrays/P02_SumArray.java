// Problem-Solving · 01-arrays · P02 — Sum of an Array  [linear scan + accumulator]
// Run: cd problem-solving/01-arrays && javac *.java && java P02_SumArray
//   (javac *.java also compiles the shared TestRunner.java in this folder)
//
// TEST CASES: {1,2,3,4,5}->15, {42}->42, {-5,-2,-9}->-16, {0,0,0}->0, {}->0
// EDGE: sum of an empty array = 0 (additive identity) -> no guard needed; the
//       accumulator seeded at 0 already returns 0 when the loop never runs.

public class P02_SumArray {

    public static void main(String[] args) {
        TestRunner.start("P02 - Sum of an Array");

        int[] a = { 1, 2, 3, 4, 5 }; TestRunner.check(a, 15, sumArray(a));
        int[] b = { 42 };            TestRunner.check(b, 42, sumArray(b));
        int[] c = { -5, -2, -9 };    TestRunner.check(c, -16, sumArray(c));
        int[] d = { 0, 0, 0 };       TestRunner.check(d, 0, sumArray(d));
        int[] e = {};                TestRunner.check(e, 0, sumArray(e));

        TestRunner.summary();
    }

    // Sum all values via a linear scan + accumulator seeded at the identity (0).
    static int sumArray(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
