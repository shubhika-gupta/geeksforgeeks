//Container with most water

class Solve{
    
    long maxArea(int a[], int len){
        // Code Here
        int i=0,j=len-1;
        long sum=0;
        while(i<j){
            sum=Math.max(sum,Math.min(a[i],a[j])*(j-i));
            if(a[i]>a[j])
            j--;
            else
            i++;
        }
        return sum;
    }
    
}