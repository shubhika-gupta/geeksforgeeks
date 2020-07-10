//add 1 to number represented as linkedlist
class Sol
{
    public static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static Node add(Node head){
        Node res=head;
        Node temp=null;
        int carry=1,sum;
        while(head!=null){
            sum=carry+head.data;
            carry=(sum>=10)?1:0;
            sum=sum%10;
            head.data=sum;
            temp=head;
            head=head.next;
        }
        if(carry>0)
        temp.next=new Node(carry);
        return res;
    }
    public static Node addOne(Node head) 
    { 
        head=reverse(head);
        head=add(head);
        return reverse(head);
    }
}