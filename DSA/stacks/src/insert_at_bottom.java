import java.util.Stack;

public class insert_at_bottom {
    public static void main(String[] args) {
        Stack<Integer> t = new Stack<>(); // first stack

        Stack<Integer> rt = new Stack<>();// second stack
        t.push(1);
        t.push(2);
        t.push(3);
        t.push(4);
        System.out.println("Normal stack: " +t);
        int ind = 1;
        int x=7;
        while (t.size()>ind){
            rt.push(t.pop());

        }
        t.push(x);  // push the element at the given index

        while (rt.size()>0){   // repush the elemnts at the stack again
            
            t.push(rt.pop());

        }

        System.out.println("Updated stack: "+ t);
    }


}

