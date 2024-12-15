import java.util.Arrays;

public class remove_even {
    // input arr {3,2,4,7,10,6,5}
    // output arr = {3,7,5}

    int[] removeEven(int [] arr){
        int n = arr.length;
        int oddCount=0;
        for(int i =0; i<n; i++){
            if(arr[i]%2!=0){
                oddCount++;
            }

        }
        int[] result = new int[oddCount];
        int idx=0;
        for(int i=0;i<arr.length; i++){
            if(arr[i]%2!=0){
                result[idx]=arr[i];
                idx++;

            }
        }
        return result;

    }

    public static void main(String[] args) {
        remove_even r = new remove_even();
        System.out.println(Arrays.toString(r.removeEven(new int[] {1, 2, 3, 4, 5})));



    }

}
