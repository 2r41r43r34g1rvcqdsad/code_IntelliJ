public class practice1 {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data= data;
        }
    }
    // This class contains all the display, delete, insertion all the methods

    public static   class linkedL{
        node head = null;
        node tail = null ;
        // Inserting at the end of the linked list
        void insertAtEnd(int data){
            node temp = new node(data);
            if(head==null){
                head= temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;
        }
        void display(){
            node temp = head;
            while(temp!=null){
                System.out.print(temp.data+ " ->  ");
                temp = temp.next;
            }
            System.out.println();
        }

        // size of the linked list
        int size(){
            node temp = head;
            int count = 0;
            while(temp!=null){
                count++;
                temp = temp.next;
            }

            return count;
        }

        // insert at beginning
        void insertAtBeginning(int data){
            node temp = new node(data);
            if(head!=null){
                temp.next = head;
                head = temp;
            }
            else {
              insertAtEnd(data);
            }

        }
        void inserAtMiddle(int val, int ind){
            node newNode = new node(val);
            node temp = head;
            if(ind == size()){
                insertAtEnd(val);
                return;
            }
            if(ind == 0){
                insertAtBeginning(val);
                return;
            }
            else if(ind < 0 || ind > size()){
                System.out.println("Invalid index");
                return;
            }
            for(int i=0; i<=ind-1; i++){ // we can put i==1 also if we want to print before the temp
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next=newNode;


        }
        void deleteAtMiddle(int ind){
            node temp = head;
            for(int i=0;i<=ind-1;i++){
                temp= temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;

        }

    }

    public static void main(String[] args) {
        linkedL l = new linkedL();
        l.insertAtEnd(2);
        l.insertAtEnd(3);
        l.insertAtEnd(4);
        l.display();
        l.insertAtBeginning(1);
        l.display();
        l.inserAtMiddle(6,2);
        l.display();
        l.deleteAtMiddle(2);
        l.display();

    }
}
