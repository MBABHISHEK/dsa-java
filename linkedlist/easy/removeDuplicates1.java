class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
    
	    HashSet<Integer> set = new HashSet<>();
        Node current = head;
        Node previous = null;
        while (current != null) {
            int data = current.data;
            if (set.contains(data))
            {
                // Duplicate found, remove the node
                previous.next = current.next;
            } else
            {
                // Unique value, add it to the set
                set.add(data);
                previous = current;
            }
            current = current.next;
        }
	  return head;
     
     
         // Your code here
    }
}
