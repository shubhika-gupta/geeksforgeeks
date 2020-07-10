//implement stack using queues
class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    static int curr_size=0;
    /*The method pop which return the element poped out of the stack*/
    int pop()
    {
	    // Your code here
	    if(q1.isEmpty()){
	        return -1;
	    }
	    int k=q1.peek();
	    q1.remove();
	    curr_size--;
	    return k;
    }
	
    /* The method push to push element into the stack */
    void push(int a)
    {
	    // Your code here
	    curr_size++;
	    q2.add(a);
	    while(!q1.isEmpty()){
	        q2.add(q1.peek());
	        q1.remove();
	    }
	    Queue<Integer> q=q1;
	    q1=q2;
	    q2=q;
    }
}