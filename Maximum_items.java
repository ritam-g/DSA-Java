public class Maximum_items {
    public static void main(String[] args) {
        int[] arr={10,5,32,24,22,43,230,54,76,89};
        // System.out.println("the maximu, number is : ---> "+getMax(arr));
        // System.out.println("the maximum number between index 2 to 6 is : ---> "+findRange(arr,2,6));
        // System.out.println("the original array is : ---> ");
        for(int n:arr){
            System.out.print(n+" ");
        }
        System.out.println(" ");
        reverse(arr);
        System.out.println("the reversed array is : ---> ");
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
    /**============================================
     *!               GET MAX VALUE IN LINER SORTING TECHNIQUE
     *=============================================**/
    public static int getMax(int[]arr)
    {
        int max=arr[0];
        for(int n:arr)
        {
            if(n>max){
                max=n;
            }
        }
        return max;
    }
   /**============================================
    *!               THIS FUNCATION IS FINDING BETWEEN RANGE OF THE ARRAY
                      WHICH ONE IS THE MAXIMUM VALUE  
    *=============================================**/
    public static int findRange(int[] arr,int start,int end){
        int maxVal=arr[start];
        for(int i=start;i<=end;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
    /**============================================
     *!               REVERSING THE ARRAY
     *=============================================**/
    public static void reverse(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            ++start;
            --end;
        }

    }
}
