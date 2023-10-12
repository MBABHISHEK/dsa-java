class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here	
    	
    	
    	Node tp=head;
    	int count=0;
    	while(tp!=null)
    	{
    	    tp=tp.next;
    	    count++;
    	}
    	int k=count-n;
    	tp=head;
    	count=0;
    	if(k<0)
    	return -1;
    	while(count<k)
    	{
    	tp=tp.next;
    	count++;
    	}
    	return tp.data;
    }
}
