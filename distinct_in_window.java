// no. of distinct number in a window
class Solution
{
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>(); 
        for (int i = 0; i < k; i++) 
            hM.put(A[i], hM.getOrDefault(A[i], 0) + 1); 
        ArrayList<Integer> al=new ArrayList<>();
        al.add(hM.size());
        for (int i = k; i < A.length; i++) { 
            if (hM.get(A[i-k]) == 1) { 
                hM.remove(A[i-k]); 
            } 
            else
                hM.put(A[i-k],hM.get(A[i-k]) - 1);  
            hM.put(A[i], hM.getOrDefault(A[i], 0) + 1); 
            al.add(hM.size()); 
        }
        return al;
    }
}