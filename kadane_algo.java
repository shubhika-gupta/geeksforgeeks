//Kadane algorithm
class Kadane{
    
    // Function to find subarray with maximum sum
    // arr: input array
    // n: size of array
    int maxSubarraySum(int arr[], int n){
        
        // Your code here
        int max_so_far=Integer.MIN_VALUE,max_ending_here=0;
        for(int i=0;i<n;i++){
            max_ending_here+=arr[i];
            if(max_so_far<max_ending_here){
                max_so_far=max_ending_here;
            }
            if(max_ending_here<0){
                max_ending_here=0;
            }
        }
        return max_so_far>=0?max_so_far:-1;
    }
    
}
