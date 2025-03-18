public class practice3 {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data = data;}
    }
    public static class LL{
        node head = null;
        node tail = null;
        void inserAtEnd(int val){
            node temp = new node(val);
            if(head== null){
                head =temp;
            }
            else tail.next = temp;
            tail =temp;


        }

        int size(){
            node temp = head;
            int count =0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
        public void display(){
            node temp = head;
            System.out.println("Here is the updated list! ");
            while(temp != null){
                System.out.print(temp.data + " ");
                temp= temp.next;
            }
            System.out.println();

        }

        public void insertAtBeginning(int val){
            node temp = new node(val);
            if(head!=null){
                temp.next = head;
                head = temp;

            }
            else inserAtEnd(val);
        }


    }

    public static void main(String[] args) {
        LL l = new LL();
        l.inserAtEnd(4);
        l.inserAtEnd(5);
        l.inserAtEnd(6);
        l.insertAtBeginning(3);
        l.insertAtBeginning(2);
        l.display();

        System.out.println(l.size());
    }

}
