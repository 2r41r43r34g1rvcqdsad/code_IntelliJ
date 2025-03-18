import java.net.HttpRetryException;

public class revison2 {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;

        }
    }
    public static class linkl{
        node head = null;
        node tail = null;

        void display(){
            node temp = head;
            if(temp == null) return;
            for( int i=0; i<size(); i++){
                System.out.print(temp.data + " ");

            }

        }
        int size (  ){
            node temp  = head;
            int count = 0;
            while(temp!=null){
                count++;
                temp= temp.next;
            }
            return count;
        }

        void insterAtEbd(int val){
            node temp = new node(val);
            if(head ==null){
                head = temp;
            }
            else tail.next = temp;
            tail = temp;           // assigning the temp as the tail
        }
        void insertAtBeginning(int val){
            node temp = new node(val);
            if(head!=null){
                temp.next =head;
                head = temp;

            }
            else insterAtEbd(val);
        }
        void insertAtIndex(int val, int ind){
            node temp = new node(val);
            node t  = head;
            if(ind == size()) {
                insterAtEbd(val);
                return;
            }
            if(ind  == 0){
                insertAtBeginning(val);
                return;
            }
            // after checking both the coditions now we are going to insert at a poitnt

            for( int i = 0; i<=ind -1; i++){
                t = t.next;
            }
            temp.next = t.next;
            t.next = temp;
        }
        int getAt(int ind){
            node  temp = head;
            for(int i=0; i<=ind; i++){
                temp= temp.next;
            }
            return temp.data;
        }
        void deleteAt(int ind){
            node temp = head;
            if( ind == 0) head = head.next;
            for(int  i =0; i<=ind-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail=temp;   // update the tail if we are deleting the tail

        }
    }
}
