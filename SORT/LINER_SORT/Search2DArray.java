public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr={
            {1},
            {2,3,0},
            {4,5,0,0},
            {6,7,0,0,0}
        };
        int target=7;
        System.out.println(search2Darray(arr,target));
    }
    static int search2Darray(int[][] arr,int target){
        if (arr.length==0) {
            return -1;
        }
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(target== arr[row][col]){
                    return 1;
                }
            }
        }
        return -1;
    }
}
