//zigzag in linked list
class Solution{
	public static Node zigZag(Node head){
        boolean flag=true;
        Node temp=head;
        while(temp!=null&&temp.next!=null){
            if(flag==true){
                if(temp.data>temp.next.data){
                    int k=temp.data;
                    temp.data=temp.next.data;
                    temp.next.data=k;
                }
            }
            else{
                if(temp.data<temp.next.data){
                int k=temp.data;
                temp.data=temp.next.data;
                temp.next.data=k;
            }}
            temp=temp.next;
            flag=!(flag);
        }
        return head;
    }
}