import java.util.ArrayList;
import java.util.Arrays;

public class finaalyBlockInExeptions {
    public static void main(String[] args) {
        int a[] = new int[4];
        System.out.println("Hello");
        try{
            System.out.println(a[8]);}
        catch (Exception e){
            System.out.println("Execpion handeled");

        }
        finally {
            System.out.println("I will run always");
        }




    }
}
