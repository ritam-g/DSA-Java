public class AmazoneQuestion {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80,90,100};
        int target=40;
        int index=binarySearchInfinite(arr, target);
        System.out.println("the index is "+index);
    }
   static int binarySearchRange(int arr[], int start, int end, int target){
    while(start <= end){
        int mid = start + (end - start) / 2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] > target) end = mid - 1;
        else start = mid + 1;
    }
    return -1;
    }

static int binarySearchInfinite(int arr[], int target){
    // Step 1: Define the first small box
    int start=0;
    int end=1;
    while (target>arr[end]) {
        //current box size
        int box=end-start +1;
        //pushing start
         start=end+1;
         end=end+box*2;

    }
    return binarySearchRange(arr, start, end, target);
}

}
