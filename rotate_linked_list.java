//rotate linked list from kth node
class Rotate{
    // This function should rotate list counter-
    // clockwise by k and return head node
    
    public Node rotate(Node head, int k) {
        // add code here
        if(k==0)
        return null;
        int count=1;
        Node curr=head,node=null;
        while(count<k&&curr!=null){
            curr=curr.next;
            count++;
        }
        if(curr==null)
        return null;
        Node kth=curr;
        while(curr.next!=null)
        curr=curr.next;
        curr.next=head;
        head=kth.next;
        kth.next=null;
        return head;
    }
}