//remove loop
class solver
{
    public static void removeLoop(Node head){
       HashSet<Node> h=new HashSet<Node>();
       Node temp=head;
       Node prev=null;
       while(temp!=null){
           if(h.contains(temp)){
               prev.next=null;
               return;
           }
           else{
               h.add(temp);
               prev=temp;
               temp=temp.next;
           }
       }
    }
    
}