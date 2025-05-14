class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class LinkedListAddition {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null){
            int x = (l1 != null) ? l1.val : 0;

            int y = (l2 != null) ? l2.val : 0;

            int sum = x + y + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null){
                l2 = l2.next;
            }
        }

        if (carry >0){
            current.next = new ListNode(carry);
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        LinkedListAddition solution = new LinkedListAddition();
        ListNode l1 = createLinkedList(new int[]{2,4,5});
        ListNode l2 = createLinkedList(new int[]{3,5,1});

        ListNode result = solution.addTwoNumbers(l1, l2);

        printLinkedList(result);
    }

    private static ListNode createLinkedList(int[] nums){
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        for(int num : nums) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }

    private static void printLinkedList(ListNode head){
        ListNode current = head;
        while (current != null){
            System.out.println(current.val + " ");
            current = current.next;
        }
        System.out.println();

    }

}