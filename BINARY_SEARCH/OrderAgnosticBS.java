public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int[] arr={10,20,30,40,50};
        int[] arr={60,50,40,30,20,10};
        int target=50;
        System.out.println(BS(arr, target));
        
    }
    static int BS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isASC=arr[start]<arr[end];
        while (start<=end) {
            
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if (isASC) {
                if(arr[mid]<target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(arr[mid]>target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
