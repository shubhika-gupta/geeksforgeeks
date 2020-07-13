//construct tree from inorder and postorder
class GfG {
    // Complete the function
    Node buildTree(int in[], int post[], int n) {
      return helper(in, post, post.length - 1, 0, in.length - 1);    
    }
    
    Node helper(int[] inorder, int[] postorder, int ppos, int is, int ie){
      if(ppos >= postorder.length || is > ie) return null;
      Node node = new Node(postorder[ppos]);
      int pii = 0;
      for(int i = 0; i < inorder.length; i++){
        if(inorder[i] == postorder[ppos]) pii = i;  
      }
      node.left = helper(inorder, postorder, ppos - 1 - ie + pii, is, pii - 1);
      node.right = helper(inorder, postorder, ppos - 1 , pii + 1, ie);
      return node;
    }
}
