import java.io.IOException;

public class Try {
    public static void main(String[] args) {
        int a[] = new int[5];

        System.out.println("Hello ");

        try {
            System.out.println(a[8]);
        }
//        catch (ArrayIndexOutOfBoundsException  | ArithmeticException | NullPointerException e){
//            System.out.println("Make sure entering the correct array !");
//
//        }
//        catch (RuntimeException e){
//            System.out.println("Runtime excpeption ");
//        }
        catch (Exception e){     // It handels  all type of exceptions
            System.out.println("l");
        }
        System.out.println("Bye ! ");
    }
}
