//online span problem
class solve{
    
    // Function to calculate span
    // price[]: input array
    public static int[] calculateSpan(int price[], int n)
    {
        int S[]=new int[n];
        Stack<Integer> st = new Stack<>(); 
        st.push(0); 
  
        // Span value of first element is always 1 
        S[0] = 1; 
  
        // Calculate span values for rest of the elements 
        for (int i = 1; i < n; i++) { 
  
            // Pop elements from stack while stack is not 
            // empty and top of stack is smaller than 
            // price[i] 
            while (!st.empty() && price[st.peek()] <= price[i]) 
                st.pop(); 
  
            // If stack becomes empty, then price[i] is 
            // greater than all elements on left of it, i.e., 
            // price[0], price[1], ..price[i-1]. Else price[i] 
            // is greater than elements after top of stack 
            S[i] = (st.empty()) ? (i + 1) : (i - st.peek()); 
  
            // Push this element to stack 
            st.push(i); 
        } 
        return S;
    }
    
}