package Samples;

public class FloorSquareRoot {

    /**
     * Returns the largest integer whose square is ≤ x
     * (i.e. floor of √x).
     */
    public static int floorSqrt(int x) {
        if (x == 0 || x == 1) {          // 0 or 1
            return x;
        }

        int start = 1;
        int end   = x;
        int ans   = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2; // avoid overflow

            if (mid * mid == x) {        // exact square
                return mid;
            } else if (mid * mid < x) {  // mid too small
                start = mid + 1;
                ans   = mid;             // record best so far
            } else {                     // mid too large
                end = mid - 1;
            }
        }

        System.out.println("floorSqrt(" + x + ") = " + ans);
        return ans;
    }
}