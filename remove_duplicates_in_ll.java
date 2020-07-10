//remove dupliactes
class GfG
{
    // Function to remove duplicates from the given linked list
    public Node removeDuplicates(Node head) 
    {
// Hash to store seen values 
        HashSet<Integer> hs = new HashSet<>(); 
      
        /* Pick elements one by one */
        Node current = head; 
        Node prev = null; 
        while (current != null)  
        { 
            int curval = current.data; 
              
             // If current value is seen before 
            if (hs.contains(curval)) { 
                prev.next = current.next; 
            } else { 
                hs.add(curval); 
                prev = current; 
            } 
            current = current.next; 
        } 
        return head;
    }
}