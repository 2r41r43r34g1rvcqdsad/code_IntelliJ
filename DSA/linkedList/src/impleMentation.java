public class impleMentation {
    public static class node {
        int data;
        node next;   // address of the next node

        // Constructor to initialize the node with data
        node(int data) {
            this.data = data;
        }
    }

    public static class linkedList {
        node head = null;
        node tail = null;

        // Insert node at the end of the linked list
        void insertAtEnd(int val) {
            node temp = new node(val);   // Creating a new node
            if (head == null) {
                head = temp; // If list is empty, set head to the new node
            } else {
                tail.next = temp; // Link the current tail to the new node
            }
            tail = temp; // Update the tail to the new node
        }

        // Display the elements of the linked list
        public void display() {
            node temp = head;
            System.out.print("Linked List after updation: ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println(); // Move to the next line after printing
        }

        // Count the total number of elements in the linked list
        int size() {
            node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        // Insert node at the beginning of the linked list
        void insertAtBeginning(int val) {
            node temp = new node(val);
            if (head != null) {
                temp.next = head; // Link new node to current head
                head = temp; // Update head to the new node
            } else {
                insertAtEnd(val); // If list is empty, just insert at the end
            }
        }
        // insert at the midde of the  linked list
        void insertAt(int ind, int val){
            node t = new node(val);
            if(ind==size()){
                insertAtEnd(val);
                return;
            }
            if(ind == 0){
                insertAtBeginning(val);
                return;
            } else if (ind<0 || ind>size()) {
                System.out.println("Wrong input!");
            }
            node temp = head;
            for(int i=1;i<=ind-1;i++){
                temp= temp.next;}    // here the head is coming to the ind-1
            // now temp.next 4-5-3-6 3=temp.next because i am inserting at the 1 ind
            // now t.next will be val which i am putting in
            t.next = temp.next;
            // now what is temp.next here 5 so change it to head
            temp.next = t;
        }

        // get element at a given at given index
        int getAt(int ind){

            if (ind < 0 || ind >= size()) {
                System.out.println("Invalid index");
                return -1; // return -1 for invalid index
            }
            node temp = head;
            for (int i = 0; i < ind; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        // Delete the  any elemant
        public void deleteAt(int ind){
            node temp = head;
            for(int i=0 ;i< ind-1; i++){
                temp= temp.next;
            }
            temp.next = temp.next.next;
            tail=temp;

        }


    }



    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(4);
        ll.insertAtEnd(8);
        ll.insertAtBeginning(3);
        ll.display(); // Output: Linked List: 3 4 8
        ll.insertAtEnd(6);
        ll.display(); // Output: Linked List: 3 4 8 6
        ll.insertAt(1,10);
        ll.display();
        ll.deleteAt(4);
        ll.display();
        System.out.println(ll.tail.data);
        ll.deleteAt(1);
        ll.display();


        System.out.println("Size = " + ll.size()); // Output: Size = 4
    }
}
