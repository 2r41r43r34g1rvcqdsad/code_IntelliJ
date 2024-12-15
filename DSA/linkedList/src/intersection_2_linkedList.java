public class intersection_2_linkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int lengthA = 0;
        while (tempA != null) {
            lengthA++;
            tempA = tempA.next;
        }
        int lengthB = 0;
        while (tempB != null) {
            lengthB++;
            tempB = tempB.next;
        }
        tempA = headA;
        tempB = headB;

        if (lengthA > lengthB) {
            int steps = lengthA - lengthB;
            for (int i = 1; i <= steps; i++) {
                tempA = tempA.next;
            }
        } else {
            int steps = lengthB - lengthA;
            for (int i = 1; i <= steps; i++) {
                tempB = tempB.next;
            }
        }
        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

//public class Main {
//    public static void main(String[] args) {
//        // Create two linked lists with an intersection point
//
//        // List A: 4 -> 1 -> 8 -> 4 -> 5
//        ListNode headA = new ListNode(4);
//        headA.next = new ListNode(1);
//        ListNode intersection = new ListNode(8);  // Intersection node
//        headA.next.next = intersection;
//        intersection.next = new ListNode(4);
//        intersection.next.next = new ListNode(5);
//
//        // List B: 5 -> 6 -> 1 -> 8 -> 4 -> 5
//        ListNode headB = new ListNode(5);
//        headB.next = new ListNode(6);
//        headB.next.next = new ListNode(1);
//        headB.next.next.next = intersection;  // Intersection node
//
//        // Create intersection_2_linkedList object and find intersection node
//        intersection_2_linkedList solution = new intersection_2_linkedList();
//        ListNode result = solution.getIntersectionNode(headA, headB);
//
//        // Print the result
//        if (result != null) {
//            System.out.println("Intersection at node with value: " + result.val);
//        } else {
//            System.out.println("No intersection.");
//        }
//    }
//}
