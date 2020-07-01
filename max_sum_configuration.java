//maximum sum in configuration
class GfG
{
    int max_sum(int A[], int n)
    {
        int cursum=0;
        for(int i:A){
            cursum+=i;
        }
        int curval=0;
        for(int i=0;i<n;i++){
            curval+=i*A[i];
        }
        int res=curval;
        for(int i=1;i<n;i++){
            int nextval=curval-(cursum-A[i-1])+A[i-1]*(n-1);
            curval=nextval;
            res=Math.max(res,nextval);
        }
        return res;
    }
}
