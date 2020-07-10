//rearrange even and odd
class gfg
{

   // Should rearrange given linked list such that all even
   // positioned Nodes are before odd positioned.
   // Returns new head of linked List.
    Node rearrangeEvenOdd(Node head)
    {
        if(head==null)
        return null;
        Node odd=head;
        Node even=head.next;
        Node evenfirst=even;
        while(1==1){
            if(odd==null||even==null||even.next==null)
            {
                odd.next=evenfirst;
                break;
            }
            odd.next=even.next;
            odd=even.next;
            if(odd.next==null){
                even.next=null;
                odd.next=evenfirst;
                break;
            }
            even.next=odd.next;
            even=odd.next;
        }
          return head;
     }
}