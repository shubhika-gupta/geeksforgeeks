//longest consequetive sequence in binary tree
class GfG
{
    class Result  
{ 
    int res = 0; 
} 
	public int longestConsecutive(Node root)
        {
         if (root == null) 
            return 0; 
  
        Result res = new Result(); 
          
        // call utility method with current length 0  
        longestConsecutiveUtil(root, 0, root.data, res); 
          
        return res.res==1?-1:res.res; 
    } 
  
    // Utility method to return length of longest  
    // consecutive sequence of tree  
    private void longestConsecutiveUtil(Node root, int curlength,int expected, Result res) 
    { 
        if (root == null) 
            return; 
  
        // if root data has one more than its parent  
        // then increase current length  
        if (root.data == expected) 
            curlength++; 
        else
            curlength = 1; 
  
        // update the maximum by current length  
        res.res = Math.max(res.res, curlength); 
  
        // recursively call left and right subtree with  
        // expected value 1 more than root data  
        longestConsecutiveUtil(root.left, curlength, root.data + 1, res); 
        longestConsecutiveUtil(root.right, curlength, root.data + 1, res); 
    } 
}
