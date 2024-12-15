import java.util.Stack;

public class deleteAtBottam {
    public static void main(String[] args) {
        Stack<Integer> t = new Stack<>(); // first stack

        Stack<Integer> rt = new Stack<>();// second stack
        t.push(1);
        t.push(2);
        t.push(3);
        t.push(4);
        System.out.println("Normal stack: " +t);
        int ind = 2;

        while(t.size()>ind+1){  // copy till the targeted index
            rt.push(t.pop());
        }
        t.pop();

        while (!rt.isEmpty()) {
            t.push(rt.pop());
        }
        System.out.println("Updated stack "+ t);
    }
}
