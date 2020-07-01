//circular subarray
class Kadane{
    
    // Function to find circular subarray with maximum sum
    // a: input array
    // n: size of array
    static int circularSubarraySum(int A[], int n) {
        
        // Your code here
        int total = 0, maxSum = A[0], curMax = 0, minSum = A[0], curMin = 0;
        for (int a : A) {
            curMax = Math.max(curMax + a, a);
            maxSum = Math.max(maxSum, curMax);
            curMin = Math.min(curMin + a, a);
            minSum = Math.min(minSum, curMin);
            total += a;
        }
        return maxSum > 0 ? Math.max(maxSum, total - minSum) : maxSum;
    }
    
}
