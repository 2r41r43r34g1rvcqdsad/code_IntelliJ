import java.util.Stack;

public class InsertATbootom {
    public static void pusBottom(Stack<Integer> s , int value){
        if(s.isEmpty()){
            s.push(value);
            return;
        }
        int top = s.pop();
        pusBottom(s, value);
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
//        while(st.size()>0){
//            t.push(st.pop());
//
//        }
//        st.push(9);
//        while(t.size()>0){   // similarly we can insert any elemnet in th stack
//            st.push(t.pop());
//        }
//        System.out.println(st);
        pusBottom(st, 8);
        System.out.println(st);
    }
}
