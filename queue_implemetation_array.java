//implementation of queue using array
class MyQueue {

    int front, rear;
	int arr[] = new int[100005];

    MyQueue()
	{
		front=0;
		rear=0;
	}
	
	/* The method push to push element
	   into the queue */
	void push(int x)
	{
	    arr[rear++]=x;
	} 

    /* The method pop which return the 
       element poped out of the queue*/
	int pop()
	{
		if(front==rear)
		return -1;
		int k=arr[front];
		front++;
		return k;
	} 
}