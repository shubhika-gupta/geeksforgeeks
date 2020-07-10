//node pairwise swap
class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    {
        // code here
        Node temp1=head;
        while(temp1!=null&&temp1.next!=null){
            int temp=temp1.data;
            temp1.data=temp1.next.data;
            temp1.next.data=temp;
            temp1=temp1.next.next;
        }
        return head;
    }
}