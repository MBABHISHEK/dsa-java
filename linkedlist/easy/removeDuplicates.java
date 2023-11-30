class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	  int k;
	  Node prev;
	  Node cur=head;
	  
	  while(cur.next!=null)
	  {
	      k=cur.data;
	      
	      if(cur.next.data==k)
	      {
	          prev=cur;
	          while(cur.next!=null&&cur.next.data==k)
	          {
	              //System.out.print("abhi");
	           cur=cur.next;
	          }
	          
	          
	          if(cur.next==null)
	          prev.next=null;
	          else
	          prev.next=cur.next;
	      }
	      else
	      cur=cur.next;
	  }
	  return head;
	  
    }
}
