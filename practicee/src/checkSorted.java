public class checkSorted {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        System.out.println(issorted(arr));
    }
    // check if the array is sorted or not
    public static boolean issorted(int[] arr){
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false ;
            }

        }
        return true;
    }

}
