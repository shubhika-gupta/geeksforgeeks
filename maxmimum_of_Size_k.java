//arraylist of subarray of maximum size of k
class solve{
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer> list=new ArrayList<>();
        int j, max; 
  
        for (int i = 0; i <= n - k; i++) { 
  
            max = arr[i]; 
  
            for (j = 1; j < k; j++) { 
                if (arr[i + j] > max) 
                    max = arr[i + j]; 
            } 
            list.add(max);
        } 
        return list;
    }
}