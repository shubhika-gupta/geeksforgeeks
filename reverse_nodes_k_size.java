//reverse nodes with k size
class GfG
{
    public static Node reverse(Node node, int k)
    {
        //Your code here
        Node prev=null;
        Node curr=node;
        Node next=null;
        int count=0;
        while(count<k&&curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(next!=null)
        node.next=reverse(next,k);
        return prev;
    }
}
