public class reversLinkedList {
    public static class node{
        int val;
        node next;
        node(int val){
            this.val = val;
        }
    }
    public static void display(node head){
        if(head == null) {
            System.out.println();
            return;
        }
        System.out.print(head.val +" -> "); // it will print in accending order

        display(head.next);
        //System.out.print(head.val +" -> "); // this will print in decending order


    }
    public static node reverse(node head){
        if(head.next ==  null) return head;
        node newHead = reverse(head.next);
        head.next.next = head; // interchanging the heads
        head.next = null;
        return newHead;



    }

    public static void main(String[] args) {
        node  a = new node(3);
        node  b = new node(5);
        node  c = new node(1);
        node  d = new node(2);
        node  e = new node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next =e;
        e.next = null;
        display(a);
        node r = reverse(a);
        display(r);



    }
}


