//make binary tree from linked list
/*class Tree{
int data;
    Tree left;
    Tree right;
    Tree(int d){
        data=d;
        left=null;
        right=null;
    }
}

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/
class GfG {
    public static Tree convert(Node head, Tree node) {
        // add code here.
        Queue<Tree> q =  
                       new LinkedList<Tree>(); 
   
        // Base Case 
        if (head == null)  
        { 
            node = null;  
            return null; 
        } 
   
        // 1.) The first node is always the root node, and 
        //     add it to the queue 
        node = new Tree(head.data); 
        q.add(node); 
   
        // advance the pointer to the next node 
        head = head.next; 
   
        // until the end of linked list is reached, do the 
        // following steps 
        while (head != null)  
        { 
            // 2.a) take the parent node from the q and  
            //      remove it from q 
            Tree parent = q.peek(); 
            Tree pp = q.poll(); 
               
            // 2.c) take next two nodes from the linked list. 
            // We will add them as children of the current  
            // parent node in step 2.b. Push them into the 
            // queue so that they will be parents to the  
            // future nodes 
            Tree leftChild = null, rightChild = null; 
            leftChild = new Tree(head.data); 
            q.add(leftChild); 
            head = head.next; 
            if (head != null)  
            { 
                rightChild = new Tree(head.data); 
                q.add(rightChild); 
                head = head.next; 
            } 
   
            // 2.b) assign the left and right children of 
            //      parent 
            parent.left = leftChild; 
            parent.right = rightChild; 
        } 
           
        return node;
    }
}