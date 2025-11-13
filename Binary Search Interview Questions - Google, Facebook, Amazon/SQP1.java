public class SQP1 {

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 0, 1, 2};
        int index = rotationCount(nums);
        System.out.println("The rotation count (index of smallest element) is: " + index +
                           " and the smallest element is: " + nums[index]);
    }

    static int rotationCount(int[] nums) {
        // It's a rotated sorted array — use binary search
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Finding the smallest element in the array
            // Note: Rotation count == index of smallest element

            if (mid < nums.length - 1 && nums[mid] > nums[mid + 1]) {
                return mid + 1;
            } 
            else if (mid > 0 && nums[mid] < nums[mid - 1]) {
                return mid;
            } 
            else {
                // Smallest element always lies on the right side if mid element > end element
                if (nums[mid] > nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }
        }
        return -1; // Fallback (should not happen for valid rotated sorted arrays)
    }
}
