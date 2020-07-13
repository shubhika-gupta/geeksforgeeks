//lowest common ancestor
class Tree
{

/* If n1 and n2 are present, return reference
   to LCA. If both are not present, return 
   null,. Else if left subtree contains any 
   of them return pointer to left.*/
	Node lca(Node root, int p,int q)
	{
    if (root == null || root.data == p || root.data == q) return root;
    Node left = lca(root.left, p, q);
    Node right = lca(root.right, p, q);
    return left == null ? right : right == null ? left : root;
}
}