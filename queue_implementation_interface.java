//implementation queue
class GfgQueue {
    Queue<Integer> q=new LinkedList<>();
    void enqueue(int x){
        // Code here
        q.add(x);
    }
    void dequeue(){
        // code here
        if(q.isEmpty())
        return;
        q.remove();
    }
    int front(){
        // Code here
        return q.peek();
    }
    String find(int x){
        // Code here
        if(q.contains(x))
        return "Yes";
        else
        return "No";
    }
}