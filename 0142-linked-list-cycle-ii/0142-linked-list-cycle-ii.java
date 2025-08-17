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
    public boolean isCycle(ListNode head) {
     // let's detect the cycle first
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
            return false;
    }
    public ListNode detectCycle(ListNode head) {
       if(!isCycle(head)) return null;
           ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }

    }
        slow = head;
        while( fast!=null && slow!=fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}