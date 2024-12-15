import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //multiTable();
        //sumOfOdd();
        //factorial();
        sumDigits();

    }

    //Question1 -> multiplicatoin table 
    public static void multiTable() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = s.nextInt();
        for(int i = 0; i<=10 ; i++){
            int a = num*i;
            System.out.println(num + " * " + i+ " = "+ a);
        }
    }

    // Question2 -> sum of all odd numabers to a specified numbare n
    public static void sumOfOdd(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        int sum =0;

        for(int i=1; i<=n ;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println("The sum of the odd numbars till " + n + " is: " + sum);
    }

    // Question3 -> factorial of a numaber
    public static void factorial(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();
        int f = 1;
        for(int i=1; i<=num;i++){
            f*=i;
        }
        System.out.println("The factorial of "+ num + " is "+ f);
    }

    //Question4 -> sum of digits of an integer

    public static void sumDigits(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a numaber: ");
        int n = s.nextInt();
        int sum =0;
        while(n>0){
            sum+= n%10;// add the last digit to the sum
            n=n/10; // remove the last digit form the n
        }
        System.out.println("The sum of digits of n numbers is : "+ sum);
        s.close();
    }

    //Question5 -> LCM of the two numbers


    public static class moving_element {
    }
}