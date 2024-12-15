import java.util.Scanner;
public class numbers {

    public static void main(String[] args) {

        numbers n = new numbers();
        n.takeInpput();}


    // take input in the array
    public void takeInpput(){
        Scanner sc=new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter your input in int format: ");
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        // print out the elements of an array
        for(int i =0;i<10;i++){
            System.out.println(arr[i]);
        }


sc.close();
    }
}
