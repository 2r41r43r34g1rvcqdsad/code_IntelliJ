import java.util.Stack;

public class copy_stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> t = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(5);
        st.push(4);
        System.out.println(st);
        while(st.size()!=0){
            t.push(st.pop());    // copy st -> t
        }

        System.out.println(t);
        Stack<Integer> r = new Stack<>();
        while(t.size()!=0){
            r.push(t.pop());  // copy t -> r
        }
        System.out.println(r);
    }

}
