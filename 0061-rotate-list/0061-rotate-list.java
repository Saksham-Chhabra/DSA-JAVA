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
    public ListNode rotateRight(ListNode head, int k) {
        int size = 1;
        ListNode tail = head;
        if (head == null) return head;
        if (head.next == null) return head;
        while (tail.next != null) {
            tail = tail.next;
            size++;
        }
        k = k % size;
        if (k == 0) {
            return head;
        }
        ListNode newTail = head;
        for (int i = 0; i < size - 1 - k; i++) {
            newTail = newTail.next;
        }
        tail.next = head;
        head = newTail.next;
        newTail.next = null;
        return head;
    }
}