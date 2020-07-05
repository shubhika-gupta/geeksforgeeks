//transition element
int transitionPoint(int arr[], int n) {
   int lb = 0, ub = n-1; 
  
    // Perform Binary search 
    while (lb <= ub) 
    { 
        // Find mid 
        int mid = (lb+ub)/2; 
  
        // update lower_bound if mid contains 0 
        if (arr[mid] == 0) 
            lb = mid+1; 
  
        // If mid contains 1 
        else if (arr[mid] == 1) 
        { 
            // Check if it is the left most 1 
            // Return mid, if yes 
            if (arr[mid-1]==0) 
                return mid; 
  
            // Else update upper_bound 
            ub = mid-1; 
        } 
    } 
    return -1; 
}