//largest subarray with 0 sum
class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0,maxl=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0&&maxl==0)
            maxl=1;
            if(sum==0)
            maxl=i+1;
            Integer prev=map.get(sum);
            if(prev!=null)
            maxl=Math.max(maxl,i-prev);
            else
            map.put(sum,i);
        }
        return maxl;
    }
}