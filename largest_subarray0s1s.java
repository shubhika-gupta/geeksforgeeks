//largest subarray of 0s and 1s
class GfG {

    // arr[] : the input array containing 0s and 1s
    // N : size of the input array
    
    // return the maximum length of the subarray
    // with equal 0s and 1s
    int maxLen(int[] arr, int N)
    {
        for(int i=0;i<N;i++)
        if(arr[i]==0)arr[i]=-1;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int max=0,sum=0;
        for(int i=0;i<N;i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
            max=Math.max(max,i-map.get(sum));
            }
            else
            map.put(sum,i);
        }
        return max;
    }
}
