public class occurences {
    public static void main(String[] args) {
        int[] arr = {1,23,4,5,6,7,6,6};
        int n= 6;
        int oc = occur(arr,n);
        System.out.println("The number of occurenece is: "+ oc);

    }
    // No of occurences ofa number in a array
    public static int occur(int[] arr, int n){
        int i=0;
        int count=0;
        while(i<arr.length){
            if(n==arr[i]){
                count++;
            }
            i++;
        }
        return count;

    }
}


