//queue implementation using two stacks
class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2=new Stack<>();

    /* The method insert to push element
       into the queue */
    void Push(int x)
    {
	   while (!s1.isEmpty()) 
        {  
            s2.push(s1.pop());  
            //s1.pop();  
        }  
  
        // Push item into s1  
        s1.push(x);  
  
        // Push everything back to s1  
        while (!s2.isEmpty())  
        {  
            s1.push(s2.pop());  
            //s2.pop();  
        }  
    }
	
    
    /* The method remove which return the
      element popped out of the queue*/
    int Pop()
    {
	   if (s1.isEmpty())  
        {  
            return -1; 
        }  
  
        // Return top of s1  
        int x = s1.peek();  
        s1.pop();  
        return x;  
    }
}