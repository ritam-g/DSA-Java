public class FindMinimumNumber {
    public static void main(String[] args) {
        int[] arr={3,5,7,2,8,10,4};
        findMin(arr);
    }
    static void findMin(int[] arr){
        if(arr.length==0){
            System.out.println("Array is empty");
            return;
        }
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum number is: "+min);
    }
}
