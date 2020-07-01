//Mountain subarray problem
vector<bool> processQueries(int a[], int n, vector<pair<int, int>> &queries,
                            int q) {
    // code here
    int* left = new int[n+1];
    int* right= new int[n+1];
    left[0]=0;
    for (int i = 1; i < n; i++)
    {
        if (a[i] > a[i - 1])
            left[i] = i;
            else
            left[i] = left[i-1];
    }
    right[n - 1] = n - 1;
    for (int i = n - 2; i >= 0; i--)
    {
        if (a[i] > a[i + 1])
            right[i] = i;
        else
        right[i] = right[i+1];
    }
    vector<bool>ans;
    for(int i=0; i<q; i++)
    {
        int l=queries[i].first, r=queries[i].second;
        if(right[l]>=left[r])
            ans.push_back(true);
        else
            ans.push_back(false);
    }
    delete [] left;
    delete [] right;
    return ans;
}