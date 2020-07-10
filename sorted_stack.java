//sort stack using another stack
class GfG{
	public Stack<Integer> sort(Stack<Integer> stack)
	{
		Stack<Integer> newStack = new Stack<Integer>();
 
	// iterate over till filled stack is not empty 
	while (!stack.isEmpty()) {
	 int tmp = stack.pop();
 
	 // iterate and check if newStack.peek value > tmp, 
	 // re-push in original stack from popping new stack
	 while (!newStack.isEmpty() && newStack.peek() > tmp) {
	  stack.push(newStack.pop());
	 }
	 newStack.push(tmp);
	}
	return newStack;
  }
}