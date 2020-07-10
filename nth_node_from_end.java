//get nth node from end
class GfG
{
    // Function to find the nth node from end in the linked list
    // head: head of the linked list
    // n: nth node from end to find
    int getlength(Node head){
        int count=0;
        while(head!=null)
        {
            count++;
            head=head.next;
        }
        return count;
    }
    int getNthFromLast(Node head, int n)
    {
        int len=getlength(head);
        if(n>len)
        return -1;
        int index=len-n;
        while(head!=null&&index-->0){
            head=head.next;
        }
        return head.data;
    }
}