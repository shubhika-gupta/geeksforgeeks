//leftmost and rightmost nodes
class Tree
{
    public static void printCorner(Node root)
    {
         //  star node is for keeping track of levels 
        Queue<Node> q = new LinkedList<Node>(); 
  
        // pushing root node and star node 
        q.add(root); 
        // Do level order traversal of Binary Tree 
        while (!q.isEmpty())  
        { 
            // n is the no of nodes in current Level 
            int n = q.size(); 
            for(int i = 0 ; i < n ; i++){ 
            // dequeue the front node from the queue 
            Node temp = q.peek(); 
            q.poll(); 
            //If it is leftmost corner value or rightmost corner value then print it 
            if(i==0 || i==n-1) 
                System.out.print(temp.data + " ");  
            //push the left and right children of the temp node 
            if (temp.left != null)  
                q.add(temp.left);  
            if (temp.right != null)  
                q.add(temp.right);  
        } 
        } 
  
    }
    
}