//implement stack using linkedlist
class MyStack {

    // Note that top is by default null
    // in Java
    StackNode top;

    void push(int a) {
        // Add your code here
        if(top==null)
        {top=new StackNode(a);
        return;}
        StackNode x=new StackNode(a);
        x.next=top;
        top=x;
    }
    int pop() {
        // Add your code here
        if(top==null)
        return -1;
        int k=top.data;
        top=top.next;
        return k;
    }
}