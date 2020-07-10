//union of two linkedlist
class Sol
{
    static Node r;
    public static void append(int new_data) 
    { 
        /* 1. Allocate the Node & 
           2. Put in the data 
           3. Set next as null */
        Node new_node = new Node(new_data); 
  
        /* 4. If the Linked List is empty, then make the 
              new node as head */
        if (r == null) 
        { 
            r = new Node(new_data); 
            return; 
        } 
  
        /* 4. This new node is going to be the last node, so 
              make next of it as null */
        new_node.next = null; 
  
        /* 5. Else traverse till the last node */
        Node last = r;  
        while (last.next != null) 
            last = last.next; 
  
        /* 6. Change the next of last node */
        last.next = new_node; 
        return; 
    } 
	public static Node findUnion(Node head1,Node head2)
	{
	    //Add your code here.
	   r=null;
	   HashSet<Integer> set=new HashSet<>();
	   Node tmp=head1;
	   while(tmp.next!=null){
	       tmp=tmp.next;
	   }
	   tmp.next=head2;
	   Node root=head1;
	   while(root!=null){
	       set.add(root.data);
	       root=root.next;
	   }
	   ArrayList<Integer> al=new ArrayList<>(set);
	   Collections.sort(al);
	   for(int i=0;i<al.size();i++)
	   append(al.get(i));
	   return r;
	}
}