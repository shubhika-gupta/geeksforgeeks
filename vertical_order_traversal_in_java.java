//vertical order traversal in java
class BinaryTree
{
    static void vert(Node node,int hd,TreeMap<Integer,Vector<Integer>> map){
        if(node==null)
        return;
        Vector<Integer> get=map.get(hd);
        if(get==null){
            get=new Vector<Integer>();
            get.add(node.data);
        }
        else{
            get.add(node.data);
        }
        map.put(hd,get);
        vert(node.left,hd-1,map);
        vert(node.right,hd+1,map);
    }
    static ArrayList <Integer> verticalOrder(Node root)
    {
        ArrayList<Integer> list=new ArrayList<>();
        TreeMap<Integer,Vector<Integer>> map=new TreeMap<>();
        int hd=0;
        vert(root,hd,map);
        for(java.util.Map.Entry<Integer,Vector<Integer>> ee:map.entrySet()){
            Vector<Integer> v=ee.getValue();
            for(int i:v){
                list.add(i);
            }
        }
        return list;
    }
}