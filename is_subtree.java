//check if subtree
class Tree {
    public static boolean isSubtree(Node T, Node S) {
        if(T==null)
        return false;
        if(issame(T,S))
        return true;
        return isSubtree(T.left,S)||isSubtree(T.right,S);
    }
    public static boolean issame(Node t,Node s){
        if(t==null&&s==null)
        return true;
        if(t==null||s==null)
        return false;
        if(t.data!=s.data)
        return false;
        return issame(t.left,s.left)&&issame(t.right,s.right);
    }
}