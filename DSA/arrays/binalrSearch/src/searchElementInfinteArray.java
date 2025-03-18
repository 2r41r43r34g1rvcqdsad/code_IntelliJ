public class searchElementInfinteArray {

    static int ans (int arr[], int target) {
        // first dinf the range
        // frist satart with the bpx size of 2
        int start = 0;
        int end = 1;




        // condition if the if the target is greated then end, no need to check the start
        // if the target is then end keep doubling
        while (target>arr[end]){
          int temp =end+1;
            // double the box
            // end= previous end + sizeofbox*2
            end = end +(end-start +1)*2;
            start =  temp;

        }
     return binarySearch(arr,target,start,end);

    }

    public static int binarySearch(int arr[], int target, int start, int end){
        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid]>target){
                end =mid-1;

            }
            else if (arr[mid]<target){
                start =mid+1;

            }
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5,6,7,8,9,12,13,14,15,16};
        int target = 7;
        System.out.println(ans(arr,target));
    }
}
