import java.util.Stack;

public class intfixToprefix {

    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";
        System.out.println(infix);
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i=0; i< infix.length();i++){
            char  ch  = infix.charAt(i);
            int ascii = (int)ch;
            // '0' -> 48 & '9' -> 57
            if(ascii >=48 && ascii<=57){
                // 0 - 9 chainging to string will store in the form of string
                String s = ""+ch;
                val.push(s);


            }
            else if (op.size()==0 || ch=='(' ||op.peek() == '('){
                op.push(ch);
            } else if (ch == ')') {
                // work
                while(op.peek()!= '('){
                    String v2 = val.pop();
                    String v1 = val.pop();

                    char o= op.pop();
                    String t = o+v1+v2;
                    val.push(t);

                }
                op.pop(); // '(' is k bhi hta do


            } else {
                if(ch == '+' || ch == '-'){
                    // work
                    String v2 = val.pop();
                    String v1 = val.pop();

                    char o= op.pop();
                    String t = o+v1+v2;
                    val.push(t);
                    // push
                    op.push(ch);

                }
                if(ch == '*' || ch == '/'){
                    if(op.peek() == '*' || op.peek()=='/'){
                        String v2 = val.pop();
                        String v1 = val.pop();

                        char o= op.pop();
                        String t = o+v1+v2;
                        val.push(t);
                        // push
                        op.push(ch);

                    }
                    else op.push(ch);

                }

            }
        }
        while (val.size()>1){
            String v2 = val.pop();
            String v1 = val.pop();

            char o= op.pop();
            String t = o+v1+v2;
            val.push(t);



        }
        String prefix = val.pop();
        System.out.println(prefix);
    }
}
