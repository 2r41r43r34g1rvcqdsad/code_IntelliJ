public class Main {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9};
        int target = 6;
        System.out.println(binarySearch(arr, target));



    }
    public static int binarySearch(int arr[],int target){
        int start =0;
        int end = arr.length-1;

        while(start<=end){
            // find the mid
            int mid = (start+end)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }
            else return mid;
        }

        return -1;

    }
}