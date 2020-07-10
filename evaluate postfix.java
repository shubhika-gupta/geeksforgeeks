//evaluate postfix
class solve{
    public static int evaluatePostFix(String exp){
        Stack<Integer> stack = new Stack<>(); 
          
        // Scan all characters one by one 
        for(int i = 0; i < exp.length(); i++) 
        { 
            char c = exp.charAt(i); 
              
            if(c == ' ') 
            continue; 
              
            // If the scanned character is an operand  
            // (number here),extract the number 
            // Push it to the stack. 
            else if(Character.isDigit(c)) 
            { 
                
                stack.push(c-'0'); 
            } 
              
            // If the scanned character is an operator, pop two 
            // elements from stack apply the operator 
            else
            { 
                int val1 = stack.pop(); 
                int val2 = stack.pop(); 
                  
                switch(c) 
                { 
                    case '+': 
                    stack.push(val2+val1); 
                    break; 
                      
                    case '-': 
                    stack.push(val2- val1); 
                    break; 
                      
                    case '/': 
                    stack.push(val2/val1); 
                    break; 
                      
                    case '*': 
                    stack.push(val2*val1); 
                    break; 
            } 
            } 
        } 
        return stack.pop(); 
    }
    
}