//sorted merge 
class LinkedList
{
    Node sortedMerge(Node headA, Node headB) {
     // This is a "method-only" submission. 
     // You only need to complete this method
     Node temp=headA;
     if(headA==null)
     return headB;
     if(headB==null)
     return headA;
     if(headA.data<headB.data){
         headA.next=sortedMerge(headA.next,headB);
         return headA;
     }
     else{
         headB.next=sortedMerge(headA,headB.next);
         return headB;
     }
   } 
}