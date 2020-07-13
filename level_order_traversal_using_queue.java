//level order traversal in linear time
class Level_order_traversal
{
    //You are required to complete this method
    static ArrayList <Integer> levelOrder(Node root) 
    {
        ArrayList<Integer> list=new ArrayList<>();
        Queue<Node> queue = new LinkedList<Node>(); 
        queue.add(root); 
        while (!queue.isEmpty())  
        { 
  
            /* poll() removes the present head. 
            For more information on poll() visit  
            http://www.tutorialspoint.com/java/util/linkedlist_poll.htm */
            Node tempNode = queue.poll(); 
            list.add(tempNode.data); 
  
            /*Enqueue left child */
            if (tempNode.left != null) { 
                queue.add(tempNode.left); 
            } 
  
            /*Enqueue right child */
            if (tempNode.right != null) { 
                queue.add(tempNode.right); 
            } 
        }
        return list;
    }
}





