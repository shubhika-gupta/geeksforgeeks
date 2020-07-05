//find negative positive pair
class Sol
{
    public static ArrayList<Integer>findPairs(int arr[], int n) 
    { 
    	// code here.
    	//Arrays.sort(arr);
    	ArrayList<Integer> al=new ArrayList<>();
    	ArrayList<Integer> v = new ArrayList<Integer> ();  
    HashMap<Integer,  
            Integer> cnt = new HashMap<Integer,  
                                       Integer>();  
  
    // For each element of array.  
    for (int i = 0; i < n; i++)  
    {  
  
        // If element has not encounter early,  
        // mark it on cnt array.  
        if (cnt.containsKey(Math.abs(arr[i])))  {
            v.add(Math.abs(arr[i]));
            cnt.put(Math.abs(arr[i]), 1);  
        }
        // If seen before, push it in vector  
        // (given that elements are distinct)  
        else 
        {  
            cnt.put(Math.abs(arr[i]), 0);  
        }  
    }  
  
    if (v.size() == 0)  
        return al;    
    for (int i = 0; i < v.size(); i++)  
    {al.add(0-v.get(i));
    al.add(v.get(i));}
    	return al;
    }
}