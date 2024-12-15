import java.util.Scanner;

public class multi_dArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of the rows :");
        int  rows = s.nextInt();
        System.out.println("Enter the number of columns :");
        int columns = s.nextInt();
        int [] [] arr = new int [rows][columns];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                arr[i][j] = s.nextInt();
            }
        }


        System.out.println("The array is : ");
        //System.out.println(arr[1][2]);  // = 5
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");

            }
            System.out.println();
        }
    }
}
