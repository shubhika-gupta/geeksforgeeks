//print matrix in diagonal pattern
class GfG
{
    /*You are required to complete this method */
    void printMatrixDiagonal(int mat[][], int n)
    {
        // Your code here
        int mode = 0, it = 0, lower = 0; 
  
        // 2n will be the number of iterations 
        for (int t = 0; t < (2 * n - 1); t++) { 
            int t1 = t; 
            if (t1 >= n) { 
                mode++; 
                t1 = n - 1; 
                it--; 
                lower++; 
            } 
            else { 
                lower = 0; 
                it++; 
            } 
            for (int i = t1; i >= lower; i--) { 
                if ((t1 + mode) % 2 == 0) { 
                    System.out.print(mat[i][t1 + lower - i]+" "); 
                } 
                else { 
                    System.out.print(mat[t1 + lower - i][i]+" "); 
                } 
            } 
        } 
    }

}