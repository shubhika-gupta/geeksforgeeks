//number of turns to reach binary tree
class Tree
{
    static int Count; 
     static Node findLCA(Node root, int n1, int n2) { 
        // Base case 
        if (root == null) 
            return null; 
  
        // If either n1 or n2 matches with 
        // root's data, report the presence by 
        // returning root (Note that if a data 
        // is ancestor of other, then the 
        // ancestor data becomes LCA 
        if (root.data == n1 || root.data == n2) 
            return root; 
  
        // Look for datas in left and right subtrees 
        Node left_lca = findLCA(root.left, n1, n2); 
        Node right_lca = findLCA(root.right, n1, n2); 
  
        // If both of the above calls return 
        // Non-NULL, then one data is present 
        // in once subtree and other is present 
        // in other, So this node is the LCA 
        if (left_lca != null && right_lca != null) 
            return root; 
  
        // Otherwise check if left subtree or right 
        // subtree is LCA 
        return (left_lca != null) ? left_lca : right_lca; 
    } 
  
    // function count number of turn need to reach 
    // given node from it's LCA we have two way to 
    static boolean CountTurn(Node root, int data, boolean turn) { 
        if (root == null) 
            return false; 
  
        // if found the data value in tree 
        if (root.data == data) 
            return true; 
  
        // Case 1: 
        if (turn == true) { 
            if (CountTurn(root.left, data, turn)) 
                return true; 
            if (CountTurn(root.right, data, !turn)) { 
                Count += 1; 
                return true; 
            } 
        } else // Case 2: 
        { 
            if (CountTurn(root.right, data, turn)) 
                return true; 
            if (CountTurn(root.left, data, !turn)) { 
                Count += 1; 
                return true; 
            } 
        } 
        return false; 
    } 
  
    static int NumberOfTurns(Node root, int first, int second)
    {
        Node LCA = findLCA(root, first, second); 
  
        // there is no path between these two node 
        if (LCA == null) 
            return -1; 
        Count = 0; 
  
        // case 1: 
        if (LCA.data != first && LCA.data != second) { 
  
            // count number of turns needs to reached 
            // the second node from LCA 
            if (CountTurn(LCA.right, second, false) 
                    || CountTurn(LCA.left, second, true)) 
                ; 
  
            // count number of turns needs to reached 
            // the first node from LCA 
            if (CountTurn(LCA.left, first, true) 
                    || CountTurn(LCA.right, first, false)) 
                ; 
            return Count + 1; 
        } 
  
        // case 2: 
        if (LCA.data == first) { 
  
            // count number of turns needs to reached 
            // the second node from LCA 
            CountTurn(LCA.right, second, false); 
            CountTurn(LCA.left, second, true); 
            return Count; 
        } else { 
  
            // count number of turns needs to reached 
            // the first node from LCA1 
            CountTurn(LCA.right, first, false); 
            CountTurn(LCA.left, first, true); 
            return Count; 
        } 
    }
}


