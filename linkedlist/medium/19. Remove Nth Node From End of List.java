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
        
        if(head==null)
        return null;

        int count=0;
        ListNode temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }

        System.out.println(count);
        int k=count-n;
        System.out.println(k);
        count=0;
        ListNode prev=null;
        temp=head;
        if(k==0)
        return head.next;

        while(k>count)
        {
            prev=temp;
            temp=temp.next;
            count++;
        }
        prev.next=temp.next;
        return head;
    }
}
