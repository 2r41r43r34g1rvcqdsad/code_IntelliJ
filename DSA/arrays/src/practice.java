public class practice {

    public void pringArray(int [] arr){
        int n  = arr.length;
        for(int i=0; i<n;i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        practice p = new practice();  // creating the instance of the practice
        p.pringArray(new int [] {5,1,4,2,6,10});


    }

}
