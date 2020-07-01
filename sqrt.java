//Square root of integer
class SquareRoot
{
     long floorSqrt(long A)
	 {
		// Your code here
		if(A<=1){
		    return A;
		}
		long start=0,end=A/2+1;
		while(start<=end){
		    long mid=(start+end)/2;
		    if(mid*mid==A){
		        return mid;
		    }
		    else if(mid*mid<A){
		        start=mid+1;
		    }
		    else{
		        end=mid-1;
		    }
		}
		return end;
	 }
}