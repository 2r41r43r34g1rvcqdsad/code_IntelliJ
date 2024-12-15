public class SumAvaragearray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = sum(arr);
        int avarage = aver(arr);
        System.out.println("The sum of the numbers in a array is: " + sum);
        System.out.println("The avarage of the arrya is: "+ avarage);

    }
    // sum of the array
    public static int  sum(int[] arr){
        int i=0;
        int s =0;
        while(i<arr.length){
            s=s+arr[i];
            i++;
        }
        return s;
    }
    // avarage of an array
    public static int aver(int[] arr){
        int a=sum(arr)/(arr.length-1);
        return a;
    }
}
