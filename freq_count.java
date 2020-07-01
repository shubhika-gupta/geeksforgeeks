//frequency count
class Frequency{
    public static void frequencycount(int arr[], int n)
    {
        // code here
        int count[]=new int[40000];
        Arrays.fill(count,0);
        for(int i:arr)
        count[i]++;
        for(int i=0;i<n;i++)
        arr[i]=count[i+1];
    }
}