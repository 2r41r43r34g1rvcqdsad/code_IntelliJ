public class minimum_vaalue {
    public static void minimum(int [] arr){
        int min =arr[0];
        for(int i= 1; i< arr.length; i++){
            if(arr[i]<min){
                min=arr[i];

            }
        }

        System.out.println(" The  minimum value is "+ min);


    }
    public static void max(int[] arr){
        int max = arr[0];
        for(int i=1; i< arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The maximum element is " + max);
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        minimum(arr);
        max(arr);
    }
}
