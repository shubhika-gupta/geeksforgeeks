//reverse linked list
class ReverseLL
{
    // This function should reverse linked list and return
    // head of the modified linked list.
    Node reverseList(Node head)
    {
        // code here
        Node prev=null,curr=head,next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }
}