//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution
{
    
    
        public static Node reverse(Node head) 
        {
            Node prev=null;
            Node tp=head;
            Node next;
            while(tp!=null)
           {
             next=tp.next;
             tp.next=prev;
             prev=tp;
             tp=next;
           }
  
        return prev;
        }
    public static Node addOne(Node head) 
    { 
        //code here.
        Node nhead=reverse(head);
        Node tp=nhead;
        while(tp!=null)
       {
         if(tp.next==null&&tp.data==9)
         {
              tp.data=0;
              tp.next=new Node(1);
              tp=tp.next;
             tp.next=null;
             break;
         }
         else if(tp.data==9)
         {
             tp.data=0;
             tp=tp.next;
         }
         else
         {
          tp.data+=1;
          break;
         }
       }
        return reverse(nhead);
    }
}
