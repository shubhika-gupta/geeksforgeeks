//max sum path in two arrays
class GfG
{
    /*You are required to complete this method
    * ar1 : 1st array
    * ar2 : 2nd array
    */
    int maxPathSum(int ar1[], int ar2[])
    {
        // Your code here
        int m=ar1.length;
        int n=ar2.length;
        int i=0,j=0;
        int result=0,sum1=0,sum2=0;
        while(i<m&&j<n){
            if(ar1[i]<ar2[j]){
                sum1+=ar1[i++];
            }
            else if(ar1[i]>ar2[j]){
                sum2+=ar2[j++];
            }
            else{
                result+=Math.max(sum1,sum2);
                sum1=0;sum2=0;
                while(i<m&&j<n&&ar1[i]==ar2[j]){
                    result+=ar1[i++];
                    j++;
                }
            }
        }
        while(i<m){
            sum1+=ar1[i++];
        }
        while(j<n){
            sum2+=ar2[j++];
        }
        result+=Math.max(sum1,sum2);
        return result;
    }
}