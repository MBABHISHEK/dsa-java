class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         Node tp=head;
         int count=0;
         while(tp!=null)
    	{
    	    tp=tp.next;
    	    count++;
    	}
    	
    	int k=count/2;
    	tp=head;
    	count=0;
    	if(count<k)
    	while(count<k)
    	{
    	tp=tp.next;
    	count++;
    	}
    	return tp.data;
    }
         
}
