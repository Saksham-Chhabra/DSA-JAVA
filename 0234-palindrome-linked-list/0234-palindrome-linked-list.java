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
    public ListNode midNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr =  head;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }
        head = prev;
        return head;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode start = head;
        if(start == null) return false;
        ListNode mid = midNode(head);
        ListNode end = reverseList(mid);
            while(end != null) {
                if(start.val != end.val) return false;
                start = start.next;
                end = end.next;
            }
        
        return true;
    }
}