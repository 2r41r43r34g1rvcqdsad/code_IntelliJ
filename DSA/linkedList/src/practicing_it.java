public class practicing_it {
    public static class node{
        int data;
        node next;   //address of the next node
        node(int data){
            this.data=data;
        }
    }
    // inserting at the ned of the linked list
    public static class linkedList{
        node head = null;
        node tail= null;
        // Inserting the node at the end of the linked list
        void insertAtEnd(int val){
            node temp = new node(val);
            if(head==null){
                head=temp; // If the tail is empty then the head is new node
            }
            else {
                tail.next=temp; // link the current tail to the new noe
            }
            tail=temp;  // update the tail to the new npde

        }
        // Making a function to display the linked list
        public void display(){
            node temp=head;
            System.out.print("Updated linked list ");
            while(temp!=null){
                System.out.print(temp.data + " -> ");
                temp= temp.next;
            }
            System.out.println();
        }
        // count the size of the elements in the linked list
        int size(){
            node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;

        }

        // Insert at beginning
        void insertAtBeginning(int val){
            node temp = new node(val);
            if(head!=null){
                temp.next=head;
                head= temp;
            }
            else{
                insertAtEnd(val);
            }
        }
        void insertAtMiddle(int ind, int val){
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

            for(int i = 0; i < ind-1; i++){
                temp = temp.next;
            }
            // Now temp is at ind-1
            newNode.next = temp.next;  // Point new node to temp's next node
            temp.next = newNode;       // Point temp to the new node
        }

        // get element at a given element
        int getAt(int ind){
            if(ind<0|| ind>=size()){
                System.out.println("Invalid intex");
                return -1;
            }
            node temp = head;
            for(int i=0; i<ind;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        // delete any element
        public void deleteAt(int ind){
            node temp= head;
            for(int i=0;i<ind-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;
        }



    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.insertAtEnd(7);
        ll.display();
        ll.insertAtBeginning(3);
        ll.display();
        ll.insertAtMiddle(3,9);
        ll.display();
        System.out.println("size if the list is "+ ll.size());
    }

}

