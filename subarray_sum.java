//subarray of given sum
void subarraySum(int m[], int n, int s){
    
    // Your code here
    int sum=m[0],si=0;
        bool flag=false;
        for(int i=1;i<=n;i++){
            while(sum>s&&si<i-1)
            {
                sum-=m[si];
                si++;
            }
            if(sum==s)
            {
                cout<<si+1<<" "<<i;
                return;
            }
            if(i<n)
            sum+=m[i];
        }
            cout<<"-1";
            return;
    
}
}