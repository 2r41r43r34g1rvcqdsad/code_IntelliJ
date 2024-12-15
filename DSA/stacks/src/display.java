import java.util.Stack;

public class display {
    public static void displayRev(Stack<Integer> s){ // printing the stack in the recursive order
        if(s.size()==0) return;
        int top = s.pop();
        System.out.print(top + " -> ");
        displayRev(s);
        s.push(top);

        return;
    }
    public static void Display(Stack<Integer> s){  // printing the stack in the regular order
        if(s.size()==0) return;
        int top = s.pop();
        Display(s);
        System.out.print(top + " -> ");

    }
    public static void main(String[] args) {
        Stack<Integer> t = new Stack<>();// second stack
        t.push(1);
        t.push(2);
        t.push(3);
        t.push(4);
        displayRev(t);
        Display(t);

    }
}
