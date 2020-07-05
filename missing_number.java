//missing number in array
class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        int count[]=new int[n+1];
        for(int i:array)
        count[i]++;
        for(int i=1;i<=n;i++){
            if(count[i]==0){
                return i;
            }
        }
        return -1;
    }
}