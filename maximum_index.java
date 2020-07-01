//maximum index
class MaxDifference{
    
    // Function to find maximum difference of j-1
    // arr[]: input array
    // n: size of array
    static int maxIndexDiff(int arr[], int n) { 
        
        // Your code here
        int max=-1;
        int lmin[]=new int[n];
        int rmax[]=new int[n];
        lmin[0]=arr[0];
        for(int i=1;i<n;i++)
        lmin[i]=Math.min(lmin[i-1],arr[i]);
        rmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        rmax[i]=Math.max(rmax[i+1],arr[i]);
        int i=0,j=0;
        while(j<n&&i<n){
            if(lmin[i]<=rmax[j]){
                max=Math.max(max,Math.abs(j-i));
                j++;
            }
            else
            i++;
        }
        return max;
    }
}