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
    public ListNode partition(ListNode head, int x) {
        
        ListNode lessThanX = new ListNode(0); // Dummy head for the list with nodes < x
        ListNode greaterOrEqualX = new ListNode(0); // Dummy head for the list with nodes >= x
        ListNode currentLess = lessThanX;
        ListNode currentGreaterOrEqual = greaterOrEqualX;

        while (head != null) {
            if (head.val < x) {
                currentLess.next = head;
                currentLess = currentLess.next;
            } else {
                currentGreaterOrEqual.next = head;
                currentGreaterOrEqual = currentGreaterOrEqual.next;
            }
            head = head.next;
        }

        // Connect the two lists
        currentLess.next = greaterOrEqualX.next;
        // Set the end of the greaterOrEqualX list to null to avoid cycles in the final result
        currentGreaterOrEqual.next = null;

        return lessThanX.next;
    }
}
