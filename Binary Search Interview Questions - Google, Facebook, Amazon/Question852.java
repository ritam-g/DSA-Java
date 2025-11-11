class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[mid + 1]) {
                right = mid; // descending slope
            } else {
                left = mid + 1; // ascending slope
            }
        }
        return left; // peak index
    }
}

public class Question852 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {0, 10, 5, 2, 1};
        System.out.println(s.peakIndexInMountainArray(arr));
    }
}
