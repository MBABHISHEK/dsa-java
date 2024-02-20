/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
        return head;
       Node temp=head;
        while(temp!=null)
        {
            Node next=temp.next;
            Node newNode=new Node(temp.val);
            temp.next=newNode;
            newNode.next=next;
            temp=next;
        }
    
    temp=head;
    while(temp!=null)
    {
        if(temp.random!=null)
        {
            temp.next.random=temp.random.next;
        }
        temp=temp.next.next;
    }

    temp=head;
    Node newHead=head.next;
    Node copyTemp=newHead;
    while(temp!=null)
    {
        temp.next=temp.next.next;
     if(copyTemp.next!=null)
    {
       copyTemp.next=copyTemp.next.next;
    }
    temp=temp.next;
    copyTemp= copyTemp.next;
    }

    return newHead;

    }
}
