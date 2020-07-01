//Stickler thief
class solve{
    // Function to return maximum of sum without adjacent elements
    public int FindMaxSum(int arr[], int n){
        // Your code here
        if(n==0)
        return 0;
        int val=arr[0];
        if(n==1){
            return val;
        }
        int val2=Math.max(arr[0],arr[1]);
        if(n==2)
        return val2;
        int max=0;
        for(int i=2;i<n;i++){
            max=Math.max(arr[i]+val,val2);
            val=val2;
            val2=max;
        }
        return max;
    }
}