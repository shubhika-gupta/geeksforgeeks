//Serialize and deserialize
class Tree {
    int i=0;
	public void serialize(Node root, ArrayList<Integer> A) {
	    if(root==null)
	    return;
	    serialize(root.left,A);
	    A.add(root.data);
	    serialize(root.right,A);
	}
	
    public Node deSerialize(ArrayList<Integer> A){
        if(A.size()==0)
        return null;
        if(i<A.size()){
        int val=A.get(i++);
        Node root=new Node(val);
        root.right=deSerialize(A);
        root.left=deSerialize(A);
        return root;}
        return null;
    }
}