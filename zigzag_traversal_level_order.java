//zigzag traversal
class GFG
{
    // return an array containing the zig zag level order traversal of the given tree
	ArrayList<Integer> zigZagTraversal(Node rootNode)
	{
	    ArrayList<Integer> list=new ArrayList<>();
        // if null then return 
    if (rootNode == null) { 
    return list; 
    } 
  
    // declare two stacks 
    Stack<Node> currentLevel = new Stack<>(); 
    Stack<Node> nextLevel = new Stack<>(); 
  
    // push the root 
    currentLevel.push(rootNode); 
    boolean leftToRight = true; 
  
    // check if stack is empty 
    while (!currentLevel.isEmpty()) { 
  
    // pop out of stack 
    Node node = currentLevel.pop(); 
      
    // print the data in it 
    list.add(node.data); 
  
    // store data according to current 
    // order. 
    if (leftToRight) { 
        if (node.left != null) { 
        nextLevel.push(node.left); 
        } 
          
        if (node.right != null) { 
        nextLevel.push(node.right); 
        } 
    } 
    else { 
        if (node.right != null) { 
        nextLevel.push(node.right); 
        } 
          
        if (node.left != null) { 
        nextLevel.push(node.left); 
        } 
    } 
  
    if (currentLevel.isEmpty()) { 
        leftToRight = !leftToRight; 
        Stack<Node> temp = currentLevel; 
        currentLevel = nextLevel; 
        nextLevel = temp; 
    } 
    }
    return list;
	}
}