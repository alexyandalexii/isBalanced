package parentheses;
import mystack.*;

/**
 * parenthesesBalance
 */
public class parenthesesBalance {

    public static boolean isBalanced(String str) throws StackIsEmptyException {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else if (str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')') {
                if(stack.isEmpty()) return false;
                char ch = stack.pop();
                if(
                    ch == '(' && str.charAt(i) != ')' || ch == '[' && str.charAt(i) != ']'
                    || ch == '{' && str.charAt(i) != '}'
                ) return false;
            }
        }
        return stack.isEmpty();
    }
}