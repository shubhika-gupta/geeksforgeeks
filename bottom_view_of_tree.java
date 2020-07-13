//bottom view of tree

class Tree
{
 
    // Method that returns the bottom view.
    public ArrayList <Integer> bottomView(Node root)
    {
    ArrayList<Integer> list=new ArrayList<>();
    if (root == null) 
            return list; 
  
        // Initialize a variable 'hd' with 0 for the root element. 
        int hd = 0; 
  
        // TreeMap which stores key value pair sorted on key value 
        Map<Integer, Integer> map = new TreeMap<>(); 
  
         // Queue to store tree nodes in level order traversal 
        Queue<Node> queue = new LinkedList<Node>(); 
  
        // Assign initialized horizontal distance value to root 
        // node and add it to the queue. 
        root.hd = hd; 
        queue.add(root); 
  
        // Loop until the queue is empty (standard level order loop) 
        while (!queue.isEmpty()) 
        { 
            Node temp = queue.remove(); 
  
            // Extract the horizontal distance value from the 
            // dequeued tree node. 
            hd = temp.hd; 
  
            // Put the dequeued tree node to TreeMap having key 
            // as horizontal distance. Every time we find a node 
            // having same horizontal distance we need to replace 
            // the data in the map. 
            map.put(hd, temp.data); 
  
            // If the dequeued node has a left child add it to the 
            // queue with a horizontal distance hd-1. 
            if (temp.left != null) 
            { 
                temp.left.hd = hd-1; 
                queue.add(temp.left); 
            } 
            // If the dequeued node has a left child add it to the 
            // queue with a horizontal distance hd+1. 
            if (temp.right != null) 
            { 
                temp.right.hd = hd+1; 
                queue.add(temp.right); 
            } 
        } 
  
        // Extract the entries of map into a set to traverse 
        // an iterator over that. 
        Set<java.util.Map.Entry<Integer, Integer>> set = map.entrySet(); 
  
        // Make an iterator 
        Iterator<java.util.Map.Entry<Integer, Integer>> iterator = set.iterator(); 
  
        // Traverse the map elements using the iterator. 
        while (iterator.hasNext()) 
        { 
            Map.Entry<Integer, Integer> me = iterator.next(); 
            list.add(me.getValue()); 
        }
        return list;
    }
	}