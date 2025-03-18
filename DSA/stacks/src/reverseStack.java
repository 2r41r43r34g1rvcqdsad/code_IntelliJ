import java.util.Stack;

public class reverseStack {
    public static void revRec(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }

        int top = st.pop();
        revRec(st);
        insertAtBottom(st, top);
    }

    public static void insertAtBottom(Stack<Integer> st, int value) {
        if (st.isEmpty()) {
            st.push(value);
            return;
        }

        int top = st.pop();
        insertAtBottom(st, value);
        st.push(top);
    }


    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> t = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(5);
        System.out.println(st);
//        while(st.size()>0){
//            t.push(st.pop());
//        }
//        System.out.println(t);
//        Stack<Integer> r = new Stack<>();
//        while(t.size()>0){
//            r.push(t.pop());
//        }
//        System.out.println(r);
//        while(r.size()>0){
//            st.push(r.pop());
//        }
//        System.out.println(st);


        System.out.println("Before: " + st);

        revRec(st);

        System.out.println("After: " + st);
    }
}
