//common nodes in two bst
/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left,right;
	Node (int d){
		data=d;
		left=right=null;
	}
}
*/
class BST
{
	// print a list containing the intersection of the two BSTs in a sorted order
	public static ArrayList<Integer> printCommon(Node root1,Node root2)
    {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        inorder(list1,root1);
        inorder(list2,root2);
        list1.retainAll(list2);
        Collections.sort(list1);
        return list1;
    }
    static void inorder(ArrayList<Integer> list,Node root){
        if(root!=null){
            inorder(list,root.left);
            list.add(root.data);
            inorder(list,root.right);
        }
    }
}