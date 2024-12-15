public class nth_node_fromLast {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
        public static node nthNode(node head,int n){// we can put return node types
            int size = 0;
            node temp =head;
            while(temp!=null){ // heare calculating the size of the node
                size++;
                temp=temp.next;

            }
            int m=size-n+1;
            //mth node from start
            temp=head;
            // Move to the m-th node (no need to subtract 1)

            for(int i=1;i<m;i++){
                temp=temp.next;

            }
            return temp;


        }

        public static node deleteNthFormEnd(node head, int n) {
            node dummy = new node(0);  // Create a dummy node to handle edge cases like deleting the head
            dummy.next = head;
            node slow = dummy;
            node fast = dummy;

            // Move the fast pointer `n+1` steps ahead so the slow pointer will be just before the node to be deleted
            for (int i = 1; i <= n + 1; i++) {
                fast = fast.next;
                if (fast == null && i != n + 1) {
                    // If `n` is greater than the size of the list
                    return head;
                }
            }

            // Move both slow and fast pointers until fast reaches the end
            while (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }

            // Delete the node by skipping it
            slow.next = slow.next.next;

            return dummy.next;  // Return the updated list
        }

        public static node nthNode2(node head, int n){
            node slow=head;
            node fast=head;

            for(int i=1;i<=n;i++){
                fast=fast.next;
            }
            while(fast!=null){
                slow=slow.next;
                fast=fast.next;
            }
            return slow;

        }
        public static void display(node head){
            node temp = head;

            while(temp!=null){
                System.out.print(temp.data+ " -> ");
                temp= temp.next;
            }
            System.out.println("null");
            System.out.println();

        }


    }
    public static void main(String[] args) {
        node a = new node(100);
        node b = new node(13);
        node c = new node(4);
        node d = new node(5);
        node e = new node(12);
        node f = new node(10);
        a.next = b;
        b.next =c;
        c.next =d;
        d.next=e;
        e.next =f;
        //node temp = node.nthNode2(a,2);
        //node t = node.nthNode(a,2);
        node.display(a);
        a=node.deleteNthFormEnd(a,6);
        node.display(a);

//        System.out.println(temp.data);
//        System.out.println(t.data);




    }
}
