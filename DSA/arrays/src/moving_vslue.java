public class moving_vslue {
    public void move(int arr[]){
        int n = arr.length;
        int j =0;
        for(int i = 0; i<n;i++){
            if(arr[i]!=0 ){
                int swap=arr[i];
                arr[i]=arr[j];
                arr[j]=swap;
                j++;
            }
        }


    }

    public static void main(String[] args) {
        int arr[]= {1,4,3,0,9,8,0};
        moving_vslue m = new moving_vslue();
        m.move(arr);

        // print the array
        for(int i :arr){
            System.out.println(i+" ");
        }

    }
}
