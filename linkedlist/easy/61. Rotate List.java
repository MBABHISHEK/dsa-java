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

    public int sizeOfList(ListNode head)
    {
        ListNode temp=head;
        int cnt=0;
        while(temp!=null)
        {
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
    public ListNode rotateRight(ListNode head, int k) {
   
   if(head==null)
   return null;

   int n=sizeOfList(head);

   k=k%n;
   int r=0;

   while(r<k)
   {
       ListNode p=head;
       ListNode t=head.next;
       while(t.next!=null)
       {
           t=t.next;
           p=p.next;
       }
       t.next=head;
       head=t;
       p.next=null;
       r++;
   }
   return head;


        
    }
}
