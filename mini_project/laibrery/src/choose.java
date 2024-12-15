import java.util.Scanner;

public class choose{
    Scanner sc = new Scanner(System.in);
    public String choose(){
        System.out.println("Choose your book from the following list: \n "+
                "1. Rayamanya \n"+ "2. Mahabahrat \n"+ " 3. Geta \n"+ "4. vishnupuaran");

        System.out.println("Enter the number of the book: ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                return "Rayamana";

            case 2:
                return "Mahabharat";


            case  3:
                return "Geta";

            case 4:
                return "Vishnupuran";


            default:
                return "Invalid choice";
        }
    }
}