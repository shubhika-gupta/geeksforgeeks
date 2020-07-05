//search in matrix
class SearchinMat
{
    //Complete this function
    static int search(int n1, int m1, int arr1[][], int x)
    {
       //Your code here
       ArrayList<Integer> al=new ArrayList<>();
       for(int i=0;i<n1;i++)
       for(int j=0;j<m1;j++)
       al.add(arr1[i][j]);
       return al.contains(x)?1:0;
    }
}