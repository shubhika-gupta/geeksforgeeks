//minimum stack
class GfG{
    int minele=Integer.MAX_VALUE;
	public void push(int a,Stack<Integer> s)
	{
	    //add code here
	    if(a<=minele)
	    minele=a;
	    s.push(a);
	}
	public int pop(Stack<Integer> s)
        {
            //add code here.
            if(s.isEmpty())
            return -1;
            return s.pop();
	}
	public int min(Stack<Integer> s)
        {
           return minele;
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           //add code here.
           if(s.size()==n)
           return true;
           return false;
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           //add code here
           return s.isEmpty();
	}
}