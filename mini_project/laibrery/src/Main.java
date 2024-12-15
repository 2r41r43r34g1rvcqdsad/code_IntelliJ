import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        security s = new security();
        choose c = new choose();
        // check the security
        if(s.CheckCredentials()){
            // allowing to choose the books
            String choosenBook = c.choose();
            if(!choosenBook.equals("Invalid choice")){
            System.out.println("Your choosen book is " + choosenBook);
            System.out.println("Book location : Alice 2, SSelf 5");}
            else {
                System.out.println(" Seclect a valid book: ");
            }

        }
        else {
            System.out.println("Access denied! ");
        }








    }



}