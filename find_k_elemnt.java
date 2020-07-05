//find k element
class GfG
{
    /*You are required to complete this method*/
    int findK(int a[][], int m, int n, int k)
    {
	// Your code here
	ArrayList<Integer> al=new ArrayList<>();
	int row=0,i=0,col=0;
       while(row<m&&col<n){
           for(i=col;i<n;i++)
           al.add(a[row][i]);
           row++;
           for(i=row;i<m;i++)
           al.add(a[i][n-1]);
           n--;
           if(row<m){
           for(i=n-1;i>=col;i--)
           al.add(a[m-1][i]);
           m--;
           }
           if(col<n){
               for(i=m-1;i>=row;i--)
               al.add(a[i][col]);
               col++;
           }
       }
       return al.get(k-1);
    }
}