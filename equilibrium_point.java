//equilibrium point
class EquilibriumPoint {

    // Function to find equilibrium point
    // a: input array
    // n: size of array
    public static int equilibriumPoint(long arr[], int n) {
        long sum=0;
        for(int i=0;i<n;++i){
            sum+=arr[i];
        }
        long right=0;
        for(int i=n-1;i>=0;i--){
            if(right==sum-(arr[i]+right))
            return i+1;
            right+=arr[i];
        }
        return -1;
    }
}