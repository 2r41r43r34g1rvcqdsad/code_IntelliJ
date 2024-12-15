public class maxMin {
    public static void main(String[] args) {
        int[] arr = {1,2,3,44,5};
        int minimum = min(arr);
        int maximum = max(arr);
        System.out.println("The smallest number in the array is: "+ minimum);
        System.out.println("The largest number in the array is : "+ maximum);

    }
    // minimum element in an array
    public static int min(int[] arr){
        int i=0;
        int n = arr[0];
        for(i=1;i<arr.length;i++){
            if(arr[i]<n){
                n=arr[i];
            }
        }
        return n;
    }
    // maximum number in the array
    public static int max(int[] arr){
        int i=0;
        int n = arr.length-1;
        for(i=0;i<arr.length;i++){
            if(arr[i]>n){
                n=arr[i];
            }
        }
        return n;
    }

}
