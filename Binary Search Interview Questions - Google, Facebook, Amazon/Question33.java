public class Question33 {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // If array is not rotated, just do normal binary search
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // If target is the pivot element
        if (nums[pivot] == target) {
            return pivot;
        }

        // If target lies in left sorted part
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        // Else target lies in right sorted part
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    // 🔹 Standard binary search between indices s and e
    private int binarySearch(int[] nums, int target, int s, int e) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }

    // 🔹 Find pivot (index of the largest element)
    private int findPivot(int[] nums) {
        int s = 0;
        int e = nums.length - 1;

        // If already sorted (no rotation)
        if (nums[s] <= nums[e]) {
            return -1;
        }

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (mid < e && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > s && nums[mid - 1] > nums[mid]) {
                return mid - 1;
            }

            if (nums[mid] >= nums[s]) {
                s = mid + 1; // pivot lies to the right
            } else {
                e = mid - 1; // pivot lies to the left
            }
        }
        return -1;
    }

    
    public static void main(String[] args) {
        Question33 obj = new Question33();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(obj.search(nums, 0));  
        System.out.println(obj.search(nums, 3));  
        System.out.println(obj.search(new int[]{1}, 0)); 
    }
}

