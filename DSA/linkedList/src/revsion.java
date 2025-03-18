

public class revsion {
    public static class node {    // this is out node
        int data;   // this is the value
        node next; // it will contain the address of the node
        node(int data){
            this.data = data;
        }

    }
    public static  class linklist{

        node head=null;
        node tail = null;

         void displayR(node head){
            if(head == null) return;
            System.out.println(head.data);
            displayR(head.next);        // this is the recursion method to dsiply the linked list


        }
         void display( ){
             node temp = head;
             while(temp!= null){
                 System.out.print(temp.data+ " ");
                 temp = temp.next;     // keeping the address of the next node

             }
            System.out.println();
        }
        int size(){
           node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;

        }
        void insertAtEnd(int val){
            node temp = new node(val); // it is the new node
            if(head == null){
                head = temp;

            }
            else {
                tail.next =temp;
            }
            tail = temp;
         }

         void insertAtBegining(int val){
             node temp = new node(val);
             if(head != null){
                 temp.next =head;
                 head = temp;
             }
             else insertAtEnd(val);

         }
         void insertAtIndex(int val, int ind){
             node temp = new node(val);   // it the new node which we want to insert
             // this the temperory node which is indicating towards head
             node t = head;

             if(ind== size()){
                 insertAtEnd(val);
                 return;
             }


             else if(ind == 0){
                 insertAtBegining(val);
                 return;
             }
             for(int i=1; i<=ind-1; i++){
                 t = t.next;  // we are triversing to the before index tho the isertion point


             }
             temp.next = t.next; // Link new node to the next node
             t.next = temp; // Link previous node to the new node




         }

         int getAt(int ind){
             node temp = head;
             for(int i =0;i<=ind;i++){
                 temp=temp.next;
             }
             return temp.data;
         }
         void deleteAtInd(int ind){
             node temp = head;
             if( ind == 0) head = head.next;
             for(int  i =0; i<=ind-1;i++){
                 temp = temp.next;
             }
             temp.next = temp.next.next;
             tail=temp;   // update the tail if we are deleting the tail

         }





    }

    public static void main(String[] args) {
        linklist l =  new linklist();
        l.insertAtEnd(3);
        l.insertAtEnd(4);
        l.display();
        //System.out.println(l.size());
        l.insertAtBegining(6);
        l.display();
        l.insertAtIndex(2,2);
        l.display();
        System.out.println(l.getAt(2));
        l.deleteAtInd(2);
        l.display();





    }

}
