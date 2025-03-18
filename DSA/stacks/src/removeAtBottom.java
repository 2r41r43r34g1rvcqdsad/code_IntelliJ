import java.util.Stack;

public class removeAtBottom {
    public static void remove(Stack<Integer> s, int ind){
        if(s.size()==ind+1){
            s.pop();
            return;
        }
        int top = s.pop();
        remove(s,ind);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> t = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(5);
        st.push(4);
        System.out.println(st);
        remove(st, 1);
        System.out.println(st);

    }
}
