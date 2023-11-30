//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node reverse(Node head)
    {
      Node tp,prev,next;
      tp=head;
      prev=null;
      
      while(tp!=null)
      {
         next=tp.next;
         tp.next=prev;
         prev=tp;
         tp=next;
          
      }        
        
        return prev;
    }
    
    static Node addTwoLists(Node first, Node second){
        
        Node fp=reverse(first);
        Node sp=reverse(second);
        Node rp=new Node(-1);
        Node s=rp;
        int sum=0;
        int carry=0;
        while(fp!=null&&sp!=null)
        {
            sum=fp.data+sp.data+carry;
            if(fp.next==null&&sp.next==null)
            {
                if(sum>=10)
                {
                 rp.next=new Node(sum%10);
                 rp=rp.next;
                 rp.next=new Node(1);
                 rp=rp.next;
                }
                else
                {
                       rp.next=new Node(sum);
                       rp=rp.next;
                }
                 fp=fp.next;
                 sp=sp.next;
                break;
            }
            rp.next=new Node(sum%10);
            rp=rp.next;
            sp=sp.next;
            fp=fp.next;
            carry=sum/10;
            }
            
            
        while(fp!=null)
        {
            
             if(fp.next==null)
             {
                 sum=fp.data+carry;
                 
                 if(sum>=10)
                {
                 sum=fp.data+carry;
                 rp.next=new Node(sum%10);
                 rp=rp.next;
                 rp.next=new Node(1);
                 rp=rp.next;
                }
                else
                {
                     rp.next=new Node(sum);
                      rp=rp.next;
                }
                       break;
             }
                       
              sum=fp.data+carry;
              rp.next=new Node(sum%10);
              carry=sum/10;
              rp=rp.next;
              fp=fp.next;
             }
         while(sp!=null)
        {
            
             if(sp.next==null)
             {  
                sum=sp.data+carry;
                if(sum>=10)
                {
                 sum=sp.data+carry;
                 rp.next=new Node(sum%10);
                 rp=rp.next;
                 rp.next=new Node(1);
                 rp=rp.next;
                }else
                {
                 
                   rp.next=new Node(sum);
                      rp=rp.next;    
                }
                       break;
             }
            sum=sp.data+carry;
            rp.next=new Node(sum%10);
            carry=sum/10;
             rp=rp.next;
             sp=sp.next;
            }
        rp.next=null;
        
        return reverse(s.next);
        
        
        
    }
}
