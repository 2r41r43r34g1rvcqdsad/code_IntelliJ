import java.util.Stack;

public class displayStack {
    public static void displayRec(Stack<Integer> s){
        if(s.size()==0) return;
        int top = s.pop();
        System.out.print(top + " ");
        displayRec(s);
        s.push(top);

    }public static void displayNormal(Stack<Integer> s){
        if(s.size()==0) return;
        int top = s.pop();

        displayNormal(s);
        System.out.print(top + " ");
        s.push(top);

    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> t = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(5);
//        while(st.size()>0){
//            t.push(st.pop());
//        }
//        while(t.size()>0){
//            int x = t.pop();
//            System.out.print(x +" ");
//            st.push(x);
//        }
//        System.out.println(st);
//        int n= st.size();
//        int[] arr = new int[n];
//        for(int i = n-1; i>=0;i--){
//            arr[i] = st.pop();
//        }
//        for(int i =0; i<n;i++){
//            System.out.print(arr[i]);
//            st.push(arr[i]);
//        }

        //displayRec(st);
        displayNormal(st);


    }
}
