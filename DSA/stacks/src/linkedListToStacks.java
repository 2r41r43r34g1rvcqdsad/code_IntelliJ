public class linkedListToStacks  {
    public static class Node{// user defined data type
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    public static class stack{ // user defined data structure
        Node head = null;
        private int size =0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        void displayrec(Node h){
            if(h == null) return;
            displayrec(head.next);
            System.out.print(h.val);

        }
        void display(){
            displayrec(head);
        }
        void displayrev(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val +" ");
                temp = temp.next;

            }
            System.out.println();
        }
        int size(){
            return size;
        }
        int pop(){
            if(head == null){
                System.out.println("Stack  is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x;
        }
        int peek(){
            if(head == null){
                System.out.println("Stack  is empty");
                return -1;
            }
            return head.val;

        }
        boolean isEmpty(){
            if(size == 0)return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        arrayToStack.Stack st = new arrayToStack.Stack();
        st.push(4);
        st.push(5);
        st.push(1);
        st.push(2);
        st.display();
        st.peek();
        System.out.println(st.size());
        st.pop();
        st.display();
        st.push(4);
        st.push(7);
        st.display();


    }
}
