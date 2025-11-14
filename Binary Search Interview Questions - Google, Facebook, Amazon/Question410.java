public class Question410 {

    public static void main(String[] args) {

        Solution sol = new Solution();

        // TEST 1
        int[] nums1 = {7, 2, 5, 10, 8};
        System.out.println("Output 1 : " + sol.splitArray(nums1, 2));  // expected 18

        // TEST 2
        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println("Output 2 : " + sol.splitArray(nums2, 2));  // expected 9

        // TEST 3
        int[] nums3 = {10};
        System.out.println("Output 3 : " + sol.splitArray(nums3, 1));  // expected 10

        // TEST 4
        int[] nums4 = {5, 5, 5, 5, 5};
        System.out.println("Output 4 : " + sol.splitArray(nums4, 5));  // expected 5

        // TEST 5
        int[] nums5 = {2, 16, 1, 8, 3};
        System.out.println("Output 5 : " + sol.splitArray(nums5, 2));  // expected 17
    }
}

class Solution {

    public int splitArray(int[] nums, int k) {

        int low = 0;
        int high = 0;

        // low = largest element
        // high = total sum
        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        // binary search for the minimum possible max subarray sum
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canSplit(nums, k, mid)) {
                high = mid;      // mid works, try smaller
            } else {
                low = mid + 1;   // mid too small, try bigger
            }
        }
        return low;
    }

    private boolean canSplit(int[] nums, int k, int maxAllowed) {

        int currentSum = 0;
        int parts = 1;   // at least 1 subarray

        for (int num : nums) {

            // if adding this number exceeds the limit -> create new subarray
            if (currentSum + num > maxAllowed) {
                parts++;
                currentSum = num;

                if (parts > k) return false;   // too many subarrays

            } else {
                currentSum += num;
            }
        }
        return true;
    }
}
