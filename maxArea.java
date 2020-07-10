//max rectangle
class GfG {
    public int maxArea(int matrix[][], int m, int n) {
        // add code here.
         if(matrix.length==0) return 0;
        int h[]=new int[n];
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0)
                {
                    h[j]=0;
                    continue;
                }
                h[j]++;
                for(int k=j-1,pre=h[j];k>=0;k--){
                    if(h[k]==0)break;
                    pre=Math.min(pre,h[k]);
                    ans=Math.max(ans,(j-k+1)*pre);
                }
                ans=Math.max(ans,h[j]);
            }
        }
        return ans;
    }
}