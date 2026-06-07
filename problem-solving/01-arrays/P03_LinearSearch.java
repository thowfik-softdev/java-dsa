// Problem-Solving · 01-arrays · P03 — Linear Search  [pattern: scan + early return]
// Find the INDEX of `target` in nums. If it's not there, return -1.
// Run: cd problem-solving/01-arrays && javac *.java && java P03_LinearSearch
//
// ── TEST CASES (array, target -> expected index) ─────────────────────────────
//   [3,7,1,9,4], find 9 -> 3    (somewhere in the middle)
//   [3,7,1,9,4], find 3 -> 0    (first element)
//   [3,7,1,9,4], find 4 -> 4    (last element)
//   [3,7,1,9,4], find 5 -> -1   (NOT present)
//   [],          find 1 -> -1   (empty -> not found)
//   [5,5,5],     find 5 -> 0    (duplicates -> return the FIRST match)
//
// ── EDGE CASES / KEY IDEAS ───────────────────────────────────────────────────
//   • NOT FOUND -> return -1. This is a LEGIT sentinel (unlike P01's fake value):
//       valid indices are always >= 0, so -1 can NEVER be mistaken for a real
//       index. The caller checks `if (result == -1)`. That's a real contract.
//   • EARLY RETURN: the moment you find target, return its index — don't keep
//       scanning. (First match wins, which is why duplicates return index 0.)
//   • EMPTY array: loop never runs -> falls through to `return -1`. No guard needed.
// ─────────────────────────────────────────────────────────────────────────────

public class P03_LinearSearch {

    public static void main(String[] args) {
        TestRunner.start("P03 - Linear Search");

        int[] a = { 3, 7, 1, 9, 4 };
        TestRunner.check(a, 3, linearSearch(a, 9)); // find 9 -> 3
        TestRunner.check(a, 0, linearSearch(a, 3)); // find 3 -> 0
        TestRunner.check(a, 4, linearSearch(a, 4)); // find 4 -> 4
        TestRunner.check(a, -1, linearSearch(a, 5)); // find 5 -> -1 (absent)

        int[] empty = {};
        TestRunner.check(empty, -1, linearSearch(empty, 1)); // empty -> -1

        int[] dups = { 5, 5, 5 };
        TestRunner.check(dups, 0, linearSearch(dups, 5)); // first match -> 0

        TestRunner.summary();
    }

    // ── YOU FILL THIS ────────────────────────────────────────────────────────
    // Return the index of the FIRST occurrence of target in nums, or -1 if absent.
    static int linearSearch(int[] nums, int target) {
        // TODO:
        // 1) scan each index i from 0..length-1
        for (int i = 0; i < nums.length; i++) {

            // 2) if nums[i] equals target, return i IMMEDIATELY (early return)
            if (nums[i] == target) {
                return i; 
            }
        }
        // 3) if the loop finishes with no match, return -1 (the "not found" sentinel)
        return -1; 
    }
}
