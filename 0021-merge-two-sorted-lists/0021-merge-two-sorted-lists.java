class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode dummy = new ListNode();
        ListNode cur = dummy;

        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                cur.next = temp1;
                temp1 = temp1.next;
            } else {
                cur.next = temp2;
                temp2 = temp2.next;
            }
            cur = cur.next;
        }

        // Attach the remainder
        if (temp1 != null) cur.next = temp1;
        if (temp2 != null) cur.next = temp2;

        return dummy.next;
    }
}
