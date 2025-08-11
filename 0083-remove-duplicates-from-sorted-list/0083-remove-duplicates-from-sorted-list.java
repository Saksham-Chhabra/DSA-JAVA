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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        ListNode next;
        if(head == null) return head;
        while (curr.next!=null) {
            next = curr.next;
            if(curr.val == next.val) {
                curr.next = next.next;
            }
            else {
                curr = next;
            }
        }
            return head;
    }
}