//intersection in y shaped
class Intersect
{
	int intersectPoint(Node headA, Node headB)
	{
         // code here
         if(headA==null||headB==null)
         return 0;
         Node tmp1=headA;
         Node tmp2=headB;
         while(tmp1!=tmp2){
             tmp1=(tmp1==null)?headB:tmp1.next;
             tmp2=(tmp2==null)?headA:tmp2.next;
         }
         return tmp1.data;
	}
}