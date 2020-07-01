//Minimum distance in array
class Solution {
    int minDist(int a[], int n, int x, int y) {
        // code here
       int min=Integer.MAX_VALUE;
       int p=-1;
       for(int i=0;i<n;i++){
           if(a[i]==x||a[i]==y){
               if(p!=-1&&a[i]!=a[p]){
                   min=Math.min(min,i-p);
               }
               p=i;
           }
       }
       return min==Integer.MAX_VALUE?-1:min;
    }
}