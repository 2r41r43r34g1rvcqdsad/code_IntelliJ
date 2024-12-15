public class Implement2 {
    public static class node{
        int data;
        node next;
        // build a constructore
        node(int data){
            this.data = data;

        }
    }


    public static class LL{
        node head = null;
        node tail = null;
        void insertAtEnd(int val){
            node t= new node(val);
            if(head==null){
                t.next=head;
                head = t;

            }
            else {
                tail.next= t;
            }
            tail= t;


        }
        int size(){
            node temp = head;
            int count = 0;
            while(temp!=null){
                temp= temp.next;
                count++;
            }
            return count;
        }
        public void display(){
            node temp =  head;
            System.out.println("LinkList after updation! ");
            while(temp!=null){
                System.out.print(temp.data+ " ->  ");
                temp =temp.next;
            }
            System.out.println();
        }
        void insertAtBeginning(int val){
            node t = new node(val);
            if(head!=null){
                t.next =head;
                head=t;

            }
            else {
                insertAtEnd(val);
            }
        }
        void insertAt(int ind, int val){
            node t = new node(val);
            if(ind==size()){
                insertAtEnd(val);
                return;
            }
            else if (ind==0){
                insertAtBeginning(val);
                return;
            }
            if(ind<0 || ind>size()){
                System.out.println("Wrong input");
            }

            node temp =head;
            for(int i=1; i<=ind-1; i++){
                temp =temp.next;

                t.next =temp.next;
                temp.next= t;

            }
        }
        int findAt(int ind){
            if (ind < 0 || ind >= size()) {
                System.out.println("Invalid index");
                return -1; // return -1 for invalid index
            }
            node temp = head;

            for(int i =1; i<=ind; i++){
                temp = temp.next;
            }
            return temp.data;

        }
    }


    public static void main(String[] args) {
        LL l = new LL();
        l.insertAtEnd(2);
        l.display();
        l.insertAtEnd(3);
        l.display();
        l.insertAtBeginning(1);
        l.display();
        l.insertAt(2,7);
        l.display();
        int p=l.findAt(2);
        System.out.println(p);
    }
}

