/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode (ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public void reorderList(ListNode head) {
        // so we solve this problem in three steps
        // 1) find the middleNode (fast and slow pointer approach)
        // 2) reverse the second half 
        // 3) altrenative merging
    
        // 1)
            ListNode midNode = middleNode(head);
        // 2)
        ListNode prev = null;
        ListNode curr = midNode.next;
        ListNode next;
        midNode.next = null;

        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // 3)
        ListNode lh = head;
        ListNode rh = prev;
        ListNode nextL;
        ListNode nextR;

        while (lh!= null && rh!=null) {
            nextL = lh.next;
            lh.next = rh;
            nextR = rh.next;
            rh.next = nextL;

            rh = nextR;
            lh = nextL;
    }
    }
}