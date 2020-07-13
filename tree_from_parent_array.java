//construct tree from parent array
class GfG
{
    static Node root;
   static void createNode(int parent[], int i, Node created[])  
    { 
        // If this node is already created 
        if (created[i] != null) 
            return; 
   
        // Create a new node and set created[i] 
        created[i] = new Node(i); 
   
        // If 'i' is root, change root pointer and return 
        if (parent[i] == -1)  
        { 
            root = created[i]; 
            return; 
        } 
   
        // If parent is not created, then create parent first 
        if (created[parent[i]] == null) 
            createNode(parent, parent[i], created); 
   
        // Find parent pointer 
        Node p = created[parent[i]]; 
   
        // If this is first child of parent 
        if (p.left == null) 
            p.left = created[i]; 
        else // If second child 
           
            p.right = created[i]; 
    } 
   
    /* Creates tree from parent[0..n-1] and returns root of  
       the created tree */
    static Node createTree(int parent[], int n)  
    {     
        // Create an array created[] to keep track 
        // of created nodes, initialize all entries 
        // as NULL 
        Node[] created = new Node[n]; 
        for (int i = 0; i < n; i++)  
            created[i] = null; 
   
        for (int i = 0; i < n; i++) 
            createNode(parent, i, created); 
   
        return root; 
    } 
    
}
