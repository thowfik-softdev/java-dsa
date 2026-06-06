// Problem-Solving · 01-arrays · P01 — Find the Max in an Array  [first DSA pattern: linear scan]
// Pattern: LINEAR SCAN — walk the array once, keep a "best so far", update when you beat it.
// Run: cd problem-solving/01-arrays && javac P01_MaxInArray.java && java P01_MaxInArray
//
// ── TEST CASES (input -> expected) ───────────────────────────────────────────
//   {23, 7, 45, 12, 89, 34} -> 89    normal case
//   {42}                    -> 42    single element
//   {-5, -2, -9}            -> -2    all negatives (why seeding with 0 would be WRONG)
//   {7, 7, 7}              -> 7     all duplicates
//   {1, 2, 3, 4, 5}         -> 5     max at the END  (don't stop early)
//   {5, 4, 3, 2, 1}         -> 5     max at the START (don't drift off it)
//   {-2147483648}           -> ?     array holds exactly Integer.MIN_VALUE (sentinel trap!)
//   {}  (empty)             -> ???   EDGE CASE — you must DECIDE the behavior (see below)
//
// ── EDGE CASES to handle in findMax() ────────────────────────────────────────
//   • EMPTY array (length 0): there IS no max. Pick a policy and implement it:
//       (a) throw new IllegalArgumentException("empty array")   ← interview-preferred
//       (b) return a documented sentinel                        ← but then caller can't tell
//     Whatever you choose, it must NOT silently return a fake number.
//   • Single element  -> that element is the max.
//   • All negatives   -> must still work (so DON'T start max at 0).
//   • Duplicated max  -> fine, value is the same.
// ─────────────────────────────────────────────────────────────────────────────

public class P01_MaxInArray {

    public static void main(String[] args) {
        // Test runner: prints PASS/FAIL for each case. (Don't change this part.)
        runTest(new int[]{23, 7, 45, 12, 89, 34}, 89);
        runTest(new int[]{42}, 42);
        runTest(new int[]{-5, -2, -9}, -2);
        runTest(new int[]{7, 7, 7}, 7);
        runTest(new int[]{1, 2, 3, 4, 5}, 5);
        runTest(new int[]{5, 4, 3, 2, 1}, 5);

        // EMPTY case: uncomment once you've decided + implemented the behavior.
        // If you throw, wrap this in try/catch (we'll cover that later) or just
        // test it by hand. If you return a sentinel, assert that value here.
        // runTest(new int[]{}, /* expected? */ 0);
    }

    // ── YOU FILL THIS ────────────────────────────────────────────────────────
    // Return the largest value in nums (linear scan).
    // Your earlier loop logic was CORRECT — port it here, then add the empty guard.
    static int findMax(int[] nums) {
        // TODO:
        //   1) handle empty array (length 0) per your chosen policy
        if(nums.length == 0){
            throw new IllegalArgumentException("empty array has no max");
        }

        //   2) seed your "best so far"  (nums[0] is cleaner than a sentinel — why?)
        //   3) scan and update when you find something bigger
        int max = nums[0];
        for (int i = 1 ; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        //   4) return the max
        return max;
    }

    // ── test helper (already done) ───────────────────────────────────────────
    static void runTest(int[] nums, int expected) {
        int got = findMax(nums);
        String status = (got == expected) ? "PASS" : "FAIL";
        System.out.println(status + "  expected=" + expected + "  got=" + got);
    }
}
