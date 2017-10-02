
import java.util.Scanner;
import java.util.Stack;
/**
1) Declare a Stack of type String/character.
2) Now traverse the expression string expression.
	a) If the current character is a opening bracket (‘(‘ or ‘{‘ or ‘[‘) then push it to stack.
	b) If the current character is a closing bracket (‘)’ or ‘}’ or ‘]’) then pop from stack and if the popped character is the matching opening bracket then fine else parenthesis are not balanced.
3) After complete traversal, if there is some starting bracket left in stack then "not balanced".
 */
public class BalancedParentheses {

	private static String isBalanced(String s){
		Stack<String> st = new Stack<String>();
		boolean isBal = false;

		for(int i=0; i < s.length(); i++){
			String c = ""+s.charAt(i);		//store characters as String

			//if opening bracket then push into stack
			if(c.equals("(") || c.equals("[") || c.equals("{")){
				st.push(c);
			}
            else{
                if(st.isEmpty()){
                    return "NO";
                }
                if(c.equals(")")){
                    if(!st.pop().equals("(")){
                        return "NO";
                    }
                }
                if(c.equals("}")){
                    if(!st.pop().equals("{")){
                        return "NO";
                    }
                }
                if(c.equals("]")){
                    if(!st.pop().equals("[")){
                        return "NO";
                    }
                }
            }
        }
        if(s.length() > 0 && st.isEmpty()){
            return "YES";
        }
        return "NO";
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}
