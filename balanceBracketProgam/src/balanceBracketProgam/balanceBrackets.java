package balanceBracketProgam;
import java.util.Stack;

public class balanceBrackets {

	static boolean checkBracketsBalanced(String expr)
    {
        // Using Stacks
        Stack<Character> stack= new Stack<Character>();
 
        
        for (int i = 0; i < expr.length(); i++)
        {
            char readChar = expr.charAt(i);
 
            if (readChar == '(' || readChar == '[' || readChar == '{')
            {
                // Push the element in the stack
                stack.push(readChar);
                continue;
            } 
            
            if (stack.isEmpty())
                return false;
            char check;
            switch (readChar) 
            {
	            case ')':
	            	check = stack.pop();
	            	if (check == '{' || check == '[')
	            		return false;
	            	break;
	
	            case '}':
	            	check = stack.pop();
	            	if (check == '(' || check == '[')
	            		return false;
	            	break;
	
	            case ']':
	            	check = stack.pop();
	            	if (check == '(' || check == '{')
	            		return false;
	            	break;
            }
        }
 
        // Check Empty Stack
        return (stack.isEmpty());
    }
	
	 // Driver code
    public static void main(String[] args)
    {
        String[] expr = {"([{}])", "([[{}]]))", "}{()}"};       
        
        // Foreach and call the Function
        for (String var : expr)         
        {
        if (checkBracketsBalanced(var))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
        }
    }
}
