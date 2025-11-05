public class Binary_Search {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70};
        int target=60;
        int count=0;
        int[] res= BinaryALgo(arr,target,count);
        if(res[0]!=-1){
            System.out.println("we got the value at the index of "+res[0]);
            System.out.println("the step we taken for finding the value is "+res[1]);
        }
    }
    static int[] BinaryALgo(int[] arr,int target,int count){
        if(arr.length==0) return new int[]{-1,count};
        int start=0;
        int end=arr.length-1;
        
        while (start<end) {
            int mid=start+(end-start)/2;
            count++;
            if(arr[mid]==target){
                return new int[]{mid,count};
            }
            else if(arr[mid]<target){
                start =mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return new int[]{-1,count};
    }
}
