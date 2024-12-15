
import java.util.*;

public class BasicOfStacks {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(23);
        st.push(30);
        st.push(50);
        // peek retrun the topmost value of the stack
        System.out.println(st.peek());
        System.out.println(st); // to  print all teh elements of teh stack
        st.pop();  // to remove the elements from teh top of the stack
        System.out.println(st);
        System.out.println(st.size());

    }
}
