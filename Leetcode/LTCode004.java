package Leetcode;

public class LTCode004 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        LTCode004 solution = new LTCode004();
        ListNode l1 = new ListNode(1, new ListNode(9, new ListNode(8)));
        ListNode l2 = new ListNode(2, new ListNode(7, new ListNode(6)));
        ListNode result = solution.addTwoNumbers(l1, l2);
        printList(result);
        l1 = new ListNode(0);
        l2 = new ListNode(1, new ListNode(2));
        result = solution.addTwoNumbers(l1, l2);
        printList(result);
        l1 = new ListNode(4, new ListNode(9));
        l2 = new ListNode(6, new ListNode(5, new ListNode(8)));
        result = solution.addTwoNumbers(l1, l2);
        printList(result);
        l1 = new ListNode(9, new ListNode(9));
        l2 = new ListNode(1);
        result = solution.addTwoNumbers(l1, l2);
        printList(result);
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    
}
