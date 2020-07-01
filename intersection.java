//intersection of two arrays
public static int NumberofElementsInIntersection (int a[], int b[] , int n, int m)
{
    //Your code here
    Set<Integer> set=new HashSet<>();
    Arrays.sort(a);
    Arrays.sort(b);
    int i=0,j=0;
    while(i<n&&j<m){
        if(a[i]<b[j]){
            i++;
        }
        else if(a[i]>b[j]){
            j++;
        }
        else{
            set.add(a[i]);
            i++;
            j++;
        }
    }
    return set.size();
}