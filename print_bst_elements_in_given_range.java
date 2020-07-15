//print bst in given range
/*
Node is as follows:
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

*/
class Solution
{   
    
	ArrayList<Integer> list=new ArrayList<Integer>();
	public ArrayList<Integer> printNearNodes(Node root, int n1, int n2)
	{
	    if (root == null)  
        return list;  
  
    Node curr = root;  
  
    while (curr != null) {  
  
        if (curr.left == null)  
        {  
            // check if current node  
            // lies between n1 and n2  
            if (curr.data <= n2 && curr.data >= n1)  
            {  
                list.add(curr.data); 
            }  
  
            curr = curr.right;  
        }  
  
        else {  
            Node pre = curr.left;  
            // finding the inorder predecessor-  
            // inorder predecessor is the right  
            // most in left subtree or the left  
            // child, i.e in BST it is the  
            // maximum(right most) in left subtree.  
            while (pre.right != null && pre.right != curr)  
                pre = pre.right;  
  
            if (pre.right == null)  
            {  
                pre.right = curr;  
                curr = curr.left;  
            }  
  
            else {  
                pre.right = null;  
  
                // check if current node lies  
                // between n1 and n2  
                if (curr.data <= n2 && curr.data >= n1)  
                {  
                    list.add(curr.data);  
                }  
  
                curr = curr.right;  
            }  
        }  
    }
    return list;
    }
	}