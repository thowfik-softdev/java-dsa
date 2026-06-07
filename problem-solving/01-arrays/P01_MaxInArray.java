// Problem-Solving · 01-arrays · P01 — Find the Max in an Array  [linear scan]
// Run: cd problem-solving/01-arrays && javac *.java && java P01_MaxInArray
//   (javac *.java also compiles the shared TestRunner.java in this folder)
//
// TEST CASES: {23,7,45,12,89,34}->89, {42}->42, {-5,-2,-9}->-2, {7,7,7}->7,
//             {1,2,3,4,5}->5, {5,4,3,2,1}->5
// EDGE: an empty array has NO max -> throw (don't return a fake value). The
//       max pattern needs a real first element, so seed with nums[0], not 0.

public class P01_MaxInArray {

    public static void main(String[] args) {
        TestRunner.start("P01 - Max in Array");

        int[] a = { 23, 7, 45, 12, 89, 34 }; TestRunner.check(a, 89, findMax(a));
        int[] b = { 42 };                    TestRunner.check(b, 42, findMax(b));
        int[] c = { -5, -2, -9 };            TestRunner.check(c, -2, findMax(c));
        int[] d = { 7, 7, 7 };               TestRunner.check(d, 7, findMax(d));
        int[] e = { 1, 2, 3, 4, 5 };         TestRunner.check(e, 5, findMax(e));
        int[] f = { 5, 4, 3, 2, 1 };         TestRunner.check(f, 5, findMax(f));
        // empty: findMax(new int[]{}) throws IllegalArgumentException (test by hand)

        TestRunner.summary();
    }

    // Largest value via a linear scan; seed "best so far" with the first element.
    static int findMax(int[] nums) {
        if (nums.length == 0) {
            throw new IllegalArgumentException("empty array has no max");
        }
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}
