//2 sum
class Solution
{
    // A[] : the input array of positive integers
    // N : size of the array arr[]
    // X : the required sum
    public boolean keypair(int[] A, int N, int X)
    {
        // code here
        Arrays.sort(A);
        int i=0;
            int j=N-1;
            while(i<j){
                int sum=X-A[i];
                if(sum==A[j]){
                    return true;
                }
                else if(sum>A[j]){
                    i++;
                }
                else
                j--;
            }
            return false;
    }
}