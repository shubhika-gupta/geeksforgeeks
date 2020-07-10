//add two numbers as linkedlist
class Solution{
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
    static Node addLists(Node first, Node second){
        if(first==null)
        return second;
        if(second==null)
        return first;
        Node l1=reverse(first);
        Node l2=reverse(second);
        Node head=l1;
        int sum=0,carry=0;
        Node prev=null;
        while(l1!=null&&l2!=null){
            sum=carry+l1.data+l2.data;
            l1.data=sum%10;
            carry=sum/10;
            prev=l1;
            l1=l1.next;
            l2=l2.next;
        }
        if(l1 != null||l2 != null) 
        { 
            if(l2 != null) prev.next = l2; 
            l1 = prev.next; 
            while(l1 != null) 
            { 
                sum = carry + l1.data; 
                l1.data = sum % 10; 
                carry = sum / 10; 
                prev = l1; 
                l1 = l1.next; 
            } 
        } 
        if(carry > 0) prev.next = new Node(carry); 
        return reverse(head);
    }
}