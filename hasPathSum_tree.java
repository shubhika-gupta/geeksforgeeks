//has path sum
class Tree {
    /*you are required to complete this function */
    boolean hasPathSum(Node node, int sum) {
        if(node==null)
        return sum==0;
        return hasPathSum(node.left,sum-node.data)||hasPathSum(node.right,sum-node.data);
    }
}