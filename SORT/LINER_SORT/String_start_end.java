public class String_start_end {
    public static void main(String[] args) {
        
        String name= "ritam maty";
        char target='m';
        int start=2;
        int end=6;
        checkInRange(name,target,start,end);
    }
    static void checkInRange(String str,char target,int s,int e){
        if(str.length()==0){
            System.out.println("String is empty");
            return;
        }
        for(int i=s;i<=e;i++){
            if(target==str.charAt(i)){
                System.out.println("Found at index: "+i);
                return;
            }
        }
        System.out.println("Not found in the given range");

    }
}
