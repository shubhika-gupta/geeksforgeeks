//evaluation of expression tree
class GfG {
    public int evalTree(Node ptr) {
         if (ptr.left == null && ptr.right == null)
            return Integer.parseInt(ptr.data);
        else
        {
            int result = 0;
            int left = evalTree(ptr.left);
            int right = evalTree(ptr.right);
            char operator = (ptr.data).charAt(0);
 
            switch (operator)
            {
            case '+' : result = left + right; break;
            case '-' : result = left - right; break;
            case '*' : result = left * right; break;
            case '/' : result = left / right; break;
            default  : result = left + right; break;
            }
            return result;
        }
    }
}