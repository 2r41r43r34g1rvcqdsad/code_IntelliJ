import java.util.*;

public class Move_stack {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements  ");
        n= sc.nextInt();
        System.out.println("Enter the  elements");

        for(int i=0;i<=n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println("Normal order is " +st);
        // reverse oder
        Stack <Integer> ro = new Stack<>(); // second stack
        Stack<Integer> rd = new Stack<>();  // third stack
        while(st.size()>0){
//            int x = st.peek();
//            ro.push(x);  // this is one way to copy stack one from other
//            st.pop();
            // There is another way to copy
            // Using pop method, It is carrting the value of that element at the time when it is removing it
            ro.push(st.pop());// this is anoher method


        }
        System.out.println("The reverse order is: " + ro);
        // the problem is now suppse the stack 1,2,3,4 should copy as same but it is
        // coping like 4,3,2,1, we can solve it by creating another 3rd stack
        while (ro.size()>0){
            rd.push(ro.pop());// second method to do

        }
        System.out.println("The output of the third stack in normal order: "+ rd);
    }
}

