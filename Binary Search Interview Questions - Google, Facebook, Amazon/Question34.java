class Solution {
    public int[] searchRange(int[] nums, int target) {
        // Find the first (leftmost) occurrence of target
        int firstElement = findFirst(nums, target);

        // Find the last (rightmost) occurrence of target
        int lastElement = findLast(nums, target);

        // Return both positions as the final result
        return new int[]{firstElement, lastElement};
    }

    // Binary search to find the FIRST (leftmost) index of target
    int findFirst(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        // Continue searching while range is valid
        while (start <= end) {
            int mid = start + (end - start) / 2;  // Prevents integer overflow

            if (nums[mid] == target) {
                // If mid is the first index OR previous element is different, return mid
                if (mid == 0 || nums[mid - 1] != target) {
                    return mid;  // Found the first occurrence
                } else {
                    // Otherwise, continue searching in the left half
                    end = mid - 1;
                }
            } 
            else if (nums[mid] > target) {
                // Target lies in the left half
                end = mid - 1;
            } 
            else {
                // Target lies in the right half
                start = mid + 1;
            }
        }

        // Target not found
        return -1;
    }

    // Binary search to find the LAST (rightmost) index of target
    int findLast(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        // Continue searching while range is valid
        while (start <= end) {
            int mid = start + (end - start) / 2;  // Prevents integer overflow

            if (nums[mid] == target) {
                // If mid is the last index OR next element is different, return mid
                if (mid == nums.length - 1 || nums[mid + 1] != target) {
                    return mid;  // Found the last occurrence
                } else {
                    // Otherwise, continue searching in the right half
                    start = mid + 1;
                }
            } 
            else if (nums[mid] > target) {
                // Target lies in the left half
                end = mid - 1;
            } 
            else {
                // Target lies in the right half
                start = mid + 1;
            }
        }

        // Target not found
        return -1;
    }
}
