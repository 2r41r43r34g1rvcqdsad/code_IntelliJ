import java.util.Scanner;

public class gussingGame {
    int randome;

    gussingGame(){
        randome = (int)Math.ceil(Math.random()*100);
    }
    /**
     * @gussinggame - return when the value is less
     * + retrun when the value is more
     * 0 return tehn teh value is equa
     *
     */
    int guess (int GussingNum){
        return GussingNum-randome;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        gussingGame g = new gussingGame();
        System.out.println("Welcome to the guessing game: ");
        int guess;
        int result;
        do{
            guess=s.nextInt();
            result = g.guess(guess);
            if(result < 0){
                System.out.println("You are sueesing less! ");
            } else if (result>0) {
                System.out.println("You are gussing hight!");
            }
            else{
                System.out.println("Congrats, you have gussed correct!");
            }
        }while(result!=0);
        }


    }


