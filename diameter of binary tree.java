//diameter of binary tree
class Tree {
    static class A 
{ 
    int ans = Integer.MIN_VALUE; 
} 
  
/* Function to find height of a tree */
static int height(Node root, A a)  
{  
    if (root == null)  
        return 0;  
  
    int left_height = height(root.left, a);  
  
    int right_height = height(root.right, a);  
  
    // update the answer, because diameter of a  
    // tree is nothing but maximum value of  
    // (left_height + right_height + 1) for each node  
    a.ans = Math.max(a.ans, 1 + left_height + 
                    right_height);  
  
    return 1 + Math.max(left_height, right_height);  
}  
  
/* Computes the diameter of binary  
tree with given root. */
static int diameter(Node root)  
{  
    if (root == null)  
        return 0;  
  
    // This will store the final answer 
    A a = new A(); 
    int height_of_tree = height(root, a);  
    return a.ans;  
}  
  
}