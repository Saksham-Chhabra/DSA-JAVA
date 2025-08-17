/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // let's detect the cycle first
        ListNode slow = head;
        ListNode fast = head;
        boolean cycleExists = false;
        while (fast != null && fast.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycleExists = true;
                break;
            }
        }
        if (cycleExists) {
        slow = head;
        while( slow!=fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
        }
        return null;
    }
}