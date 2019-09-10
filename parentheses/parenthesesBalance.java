package parentheses;
import mystack.*;

/**
 * parenthesesBalance
 */
public class parenthesesBalance {

    public static int isBalanced(String str) throws StackIsEmptyException {
        Stack<Character> stack = new Stack<Character>();
        Stack<Integer> indexStack = new Stack<Integer>();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
                stack.push(str.charAt(i));
                indexStack.push(i);
            } else if (str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')') {
                if(stack.isEmpty()) {
                    return i+1; /** индекс закрывающей скобки, для которой нет соответствующей
                                    открывающей скобки*/
                }
                char ch = stack.pop();
                indexStack.pop();
                if(
                    ch == '(' && str.charAt(i) != ')' || ch == '[' && str.charAt(i) != ']'
                    || ch == '{' && str.charAt(i) != '}'
                ) return i+1;  /**  индекс закрывающей скобки, для которой не соответствующей 
                                    открывающей скобки*/
            }
        }
        if(!stack.isEmpty()) {
            return indexStack.pop() + 1; /** индекс первой открывающей скобки, для которой нет закрывающей */
        } else {
            return 0; // Success!
        }
    }
}