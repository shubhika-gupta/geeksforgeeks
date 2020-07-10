//sort segregate
class LinkedList
{
    static Node segregate(Node head)
    {
        Node dummy=new Node(0);
        Node prev=dummy;
        Node curr=head;
        while(curr!=null){
            prev=dummy;
            while(prev.next!=null&&prev.next.data<curr.data)
            prev=prev.next;
            Node next=curr.next;
            curr.next=prev.next;
            prev.next=curr;
            curr=next;
        }
        return dummy.next;
        
    }
}