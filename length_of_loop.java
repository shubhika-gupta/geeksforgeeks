//find the length of loop
class Solution
{
    static int countnodes(Node n){
        int count=1;
        Node temp=n;
        while(temp.next!=n){
            count++;
            temp=temp.next;
        }
        return count;
    }
    static int countNodesinLoop(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(slow!=null&&fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            return countnodes(slow);
        }
        return 0;
    }
}