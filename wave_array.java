//wave array
class Wave{

    
    // Function to convert the given array to wave like array
    // arr: input array
    // n: size of the array
    public static void convertToWave(int arr[], int n){
        
        // Your code here
        for(int i=0;i<n-1;i=i+2){
            if(arr[i]<arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
    
}
