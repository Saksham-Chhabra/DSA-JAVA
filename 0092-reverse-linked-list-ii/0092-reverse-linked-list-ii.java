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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if ((head == null) || (head.next == null)) return head;

        ListNode leftNode = head;
        ListNode rightNode = head;
        int counter = 1;

        while (counter < left) {
            leftNode = leftNode.next;
            counter++;
        }
        // ListNode slow = leftNode;
        // ListNode fast = leftNode;
        // while (fast != null && fast.next != null) {
        //     fast = fast.next.next;
        //     slow = slow.next;
        // }
        counter = 0;
        int count = 0;
        int loop = (right - left)/2;
        int loopCount = 0;
        while (loopCount <= loop) {
        counter++;
        count = counter;
        while (counter < right) {
            rightNode = rightNode.next;
            counter++;
        }
        counter = count;
        int temp = leftNode.val;
        leftNode.val = rightNode.val;
        rightNode.val = temp;

        leftNode = leftNode.next;
        rightNode = head;
        loopCount++;
        }

          
        return head;  
    }
}