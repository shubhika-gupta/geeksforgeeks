//Product array puzzle
class Solution 
{ 
    public static long prod(int arr[],int in){
        long max=1;
        for(int i=0;i<arr.length;i++){
            if(i==in)
            continue;
            max*=arr[i];
        }
        return max;
    }
	public static long[] productExceptSelf(int arr[], int n) 
	{ 
        // code here
        long p[]=new long[n];
        for(int i=0;i<n;i++){
            p[i]=prod(arr,i);
        }
        return p;
	} 
} 