//spiral matrix
class Traverse
{
    //Complete this function
    static void spirallyTraverse(int m, int n, int a[][])
    {
       //Your code here
       int row=0,i=0,col=0;
       while(row<m&&col<n){
           for(i=col;i<n;i++)
           System.out.print(a[row][i]+" ");
           row++;
           for(i=row;i<m;i++)
           System.out.print(a[i][n-1]+" ");
           n--;
           if(row<m){
           for(i=n-1;i>=col;i--)
           System.out.print(a[m-1][i]+" ");
           m--;
           }
           if(col<n){
               for(i=m-1;i>=row;i--)
               System.out.print(a[i][col]+" ");
               col++;
           }
       }
       
    }
}