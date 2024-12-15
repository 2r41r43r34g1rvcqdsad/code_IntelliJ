import java.util.Scanner;

public class security {
    Scanner sc = new Scanner(System.in);
    private final String user_name = "kapil";
    private final String pass_word = "Kapil@123" ;

    public boolean CheckCredentials() {
        // take the user input
        System.out.println("Please enter the user name: ");
        String userName = sc.nextLine();
        System.out.println("Please enter the password: ");
        String password = sc.nextLine();

        // Now check the credentials
        if (userName.equals(user_name) && password.equals(pass_word)) {
            System.out.println("Login successful: ");
            return true;
        } else {
            System.out.println("Wrong credentials, please enter a correct credential! ");
            return false;
        }



    }


}
