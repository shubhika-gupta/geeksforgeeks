//burning tree minimum time required
class Tree
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
     static class Data { 
        int leftDepth, rightDepth, time; 
        boolean contains; 
  
        Data() 
        { 
            contains = false; 
            leftDepth = rightDepth = 0; 
            time = -1; 
        } 
    } 
  
    /*  
        Function to calculate time required to burn  
        tree completely 
          
        node - address of current node 
        info - extra information about current node 
        target - node that is fired 
        res - stores the result 
    */
    public static void getResult(Node node, Data data, int target) 
    { 
  
        // Base case: if root is null 
        if (node == null) { 
            return; 
        } 
  
        // If current node is leaf 
        if (node.left == null && node.right == null) { 
  
            // If current node is the first burnt node 
            if (node.data == target) { 
                data.contains = true; 
                data.time = 0; 
            } 
            return; 
        } 
  
        // Information about left child 
        Data leftData = new Data(); 
        getResult(node.left, leftData, target); 
  
        // Information about right child 
        Data rightData = new Data(); 
        getResult(node.right, rightData, target); 
  
        // If left subtree contains the fired node then 
        // time required to reach fire to current node 
        // will be (1 + time required for left child) 
        data.time = (leftData.contains) ? (leftData.time + 1) : -1; 
  
        // If right subtree contains the fired node then 
        // time required to reach fire to current node 
        // will be (1 + time required for right child) 
        if (data.time == -1) 
            data.time = (rightData.contains) ? (rightData.time + 1) : -1; 
  
        // Storing(true or false) if the tree rooted at 
        // current node contains the fired node 
        data.contains = (leftData.contains || rightData.contains); 
  
        // Calculate the maximum depth of left subtree 
        data.leftDepth = (node.left == null) ? 0 : (1 + Math.max(leftData.leftDepth, leftData.rightDepth)); 
  
        // Calculate the maximum depth of right subtree 
        data.rightDepth = (node.right == null) ? 0 : (1 + Math.max(rightData.leftDepth, rightData.rightDepth)); 
  
        // Calculating answer 
        if (data.contains) { 
  
            // If left subtree exists and 
            // it contains the fired node 
            if (leftData.contains) { 
  
                // calculate result 
                res = Math.max(res, data.time + data.rightDepth); 
            } 
  
            // If right subtree exists and it 
            // contains the fired node 
            if (rightData.contains) { 
  
                // calculate result 
                res = Math.max(res, data.time + data.leftDepth); 
            } 
        } 
    } 
  
    // To store the result 
    public static int res; 
    public static int minTime(Node root, int target) 
    {
        // Your code goes here
        res = 0; 
        getResult(root, new Data(), target); 
        return res;
    }
}