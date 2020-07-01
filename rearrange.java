//rearrange with o(1) extra space
class rearrange
{
    // Function to rearrange the elements
    // arr: input array
    // n: size of array
    static void arrange(long arr[], int n)
    {
        // your code here
        int a[]=new int[n];
        for (int i = 0; i < n; i++) 
            a[i]=(int)arr[i] + ((int)arr[(int)arr[i]] % n) * n; 
  
        // Second Step: Divide all values by n 
        for (int i = 0; i < n; i++) 
            a[i] /= n;
        for(int i=0;i<n;i++)
        arr[i]=(long)a[i];
    }
}