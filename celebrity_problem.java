//Celebrity Problem
class Celebrity
{
    // The task is to complete this function
    int getId(int M[][], int n)
    {
        // Your code here
        Stack<Integer> stack=new Stack<>();
        int c=0;
        for(int i=0;i<n;i++){
            stack.push(i);
        }
        while(stack.size()>1){
            int a=stack.pop();
            int b=stack.pop();
            if(M[a][b]==1){
                stack.push(b);
            }
            else{
                stack.push(a);
            }
        }
        c=stack.pop();
        for(int i=0;i<n;i++){
            if(i!=c&&(M[c][i]==1||M[i][c]==0))
            return -1;
        }
        return c;
    }
}