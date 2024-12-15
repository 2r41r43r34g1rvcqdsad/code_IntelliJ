public class Main {
    public static class node{
        int data;
        node next; // address of the next node

        node(int data){
            this.data =data;
        }


    }
    public static class basicCall { // Make this an outer class or static inner class
        public static void display(node head) {
            node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {

        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        node e = new node(5);
        a.next=b;  // here we are assigning the address of the bin the a like 1->2
        b.next=c;
        c.next=d;
        d.next=e;
        // 1-> 2-> 3-> 4-> 5-> null



       //  System.out.println(a.data+"\n"+a.next.data+ "\n"+a.next.next.data+"\n"+a.next.next.next.data);
        node temp =a; // pointing the head
//        for(int i=1;i<=5;i++){
//            System.out.print(temp.data+" ");
//            temp =temp.next;   // b ka address



        // suppose you dont't know the size of the linked list then how will you print
//        while(temp!=null){
//            System.out.print(temp.data+ " ");
//            temp=temp.next;
//        }



        //display(a);



    }
}