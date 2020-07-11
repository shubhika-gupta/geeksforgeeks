//Vertical sum
class Tree{
    static class LLNode 
    { 
        int data; 
        LLNode prev, next; 
        public LLNode(int d) { data = d; } 
    } 
  
    public ArrayList <Integer> verticalSum(Node root) {
        ArrayList<Integer> al=new ArrayList<>();
        LLNode llnode = new LLNode(0); 
  
        // Compute vertical sum of different lines 
        verticalSumDLLUtil(root, llnode); 
  
        // llnode refers to sum of vertical line 
        // going through root. Move llnode to the 
        // leftmost line. 
        while (llnode.prev != null) 
            llnode = llnode.prev; 
  
        // Prints vertical sum of all lines starting 
        // from leftmost vertical line 
        while (llnode != null) 
        { 
            al.add(llnode.data); 
            llnode = llnode.next; 
        }
        return al;
    } 
  
    // Constructs linked list 
    static void verticalSumDLLUtil(Node node, 
                                   LLNode llnode) 
    { 
        // Add current node's data to its vertical line 
        llnode.data = llnode.data + node.data; 
  
        // Recursively process left subtree 
        if (node.left != null) 
        { 
            if (llnode.prev == null) 
            { 
                llnode.prev = new LLNode(0); 
                llnode.prev.next = llnode; 
            } 
            verticalSumDLLUtil(node.left, llnode.prev); 
        } 
  
        // Process right subtree 
        if (node.right != null) 
        { 
            if (llnode.next == null) 
            { 
                llnode.next = new LLNode(0); 
                llnode.next.prev = llnode; 
            } 
            verticalSumDLLUtil(node.right, llnode.next); 
        } 
    } 
}