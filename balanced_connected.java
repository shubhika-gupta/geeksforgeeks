//balanced connected
void isSuperBalancedUtil(Node *root, int depth, int &minDepth, int &maxDepth) {
    // base case 
    // if current node is null
    if (!root)
        return;
    // if leaf calculate min depth and max depth
    if (!root->left && !root->right) {
        minDepth = min(minDepth, depth);
        maxDepth = max(maxDepth, depth);
        return;
    }
    // recur for left and right subtree
    isSuperBalancedUtil(root->left, depth + 1, minDepth, maxDepth);
    isSuperBalancedUtil(root->right, depth + 1, minDepth, maxDepth);
}

bool isPossible(Node *root) {
    // initialize mindepth and maxdepth
    int minDepth = INT_MAX, maxDepth = INT_MIN;
    // utility function to calculate mindepth and max depth
    isSuperBalancedUtil(root, 1, minDepth, maxDepth);
    // checking if absolute difference of maxdepth and mindepth is less than or equal to 1
    // if yes then return true otherwise false
    if (abs(maxDepth - minDepth) <= 1)
        return true;
    return false;
}