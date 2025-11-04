public class Main{
    public static void main(String[] args) {
        /**============================================
         *!               THIS WILL BE FOR LINER SERCH TECHINQE ALGO 
         *=============================================**/
        int[] arr={2322,3,23,23,2,2,323};
        int res=linearSearch(arr,23);
        System.out.println(linearSearchBol(arr, 3));
        System.out.println(res);
    }
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            //this will return -1 if the array is empty
            return -1;
        }
        for (int index = 0; index <arr.length; index++) {
            if(arr[index]==target){
                return 1;
            }
        }
        return -1;
    }
    static boolean linearSearchBol(int[] arr,int target){
        if(arr.length==0){
            //this will return -1 if the array is empty
            return false;
        }
        for (int index = 0; index <arr.length; index++) {
            if(arr[index]==target){
                return true;
            }
        }
        return false;
    }
}