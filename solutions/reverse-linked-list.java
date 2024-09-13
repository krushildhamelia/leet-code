
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode reverseList(ListNode head) { // 1 // 2
        ListNode current = null, prev = null;
        while(head != null) {
            current = head.next; // 2  // null
            head.next = prev; // 1 -> null // 2 -> 1
            prev = head; // 1 // 2
            head = current; // 2 // null
        }
        return prev;
    }
}
