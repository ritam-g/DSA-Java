public class Swap {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        System.out.println("before swaping ");
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        swap(arr,1,3);
        System.out.println("after swaping ");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    public static void swap(int[] arr,int index1,int index2){
        /**================================================================================================
         *!                                        WE NEED A TEMP VALUE FOR SWAPING
         *================================================================================================**/
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        System.out.println("swoping is done ");
    }
}
