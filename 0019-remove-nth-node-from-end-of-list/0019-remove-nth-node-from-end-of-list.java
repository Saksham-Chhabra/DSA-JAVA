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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode prev = head;
        int size = 0;
        while(temp != null) {
            temp = temp.next;
            size++;
        }
        if (n == size) {
            head = head.next;
        }
        if (size == 1) {
            head = null;
            return head;
        }
        else {
            int i = 1;
            while (i < size-n) {
                prev = prev.next;
                i++;
            }
            prev.next = prev.next.next;
        }
        return head;
    }
}