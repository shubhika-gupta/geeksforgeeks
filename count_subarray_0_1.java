//count subarray with equal 0 and 1
//replace 0 with -1 and calculate sum if sum==0 it means that equal 0 and 1s check if map contain teh value
class countsubArray
{
    // arr[] : the input array
    // N : size of the input array
    
    // return the number of subarrays with equal 0s and 1s
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        // add your code here
        Map<Integer, Integer> myMap = new HashMap<>(); 
        int sum = 0; 
        int count = 0; 
        for (int i = 0; i < n; i++) { 
            //Replacing 0's in array with -1 
            if (arr[i] == 0) 
                arr[i] = -1; 
          
            sum += arr[i]; 
              
            //If sum = 0, it implies number of 0's and 1's are  
            //equal from arr[0]..arr[i] 
            if (sum == 0) 
                count++; 
              
            if (myMap.containsKey(sum)) 
                count += myMap.get(sum); 
  
            if (!myMap.containsKey(sum)) 
                myMap.put(sum, 1); 
            else
                myMap.put(sum, myMap.get(sum) + 1); 
        } 
        return count; 
    }
}