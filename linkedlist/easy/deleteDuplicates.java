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
        ListNode tp=head;
        if(head==null || head.next==null)
        return head;
      

        while(tp.next!=null)
        {
           if(tp.val==tp.next.val)
            tp.next=tp.next.next;
            else
            tp=tp.next;
        }
        return head;
    }
}
