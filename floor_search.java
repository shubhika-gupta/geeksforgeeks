//floor search
class FloorSearch{
    
    // Function to find floor of x
    // arr: input array
    // left and right as 0 and n-1, where n is the size of array
    static int findFloor(long arr[], int left, int right, long x)
    {
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]>x){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return right;
    }
    
}