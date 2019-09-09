import mystack.StackIsEmptyException;
import parentheses.parenthesesBalance;

/**
 * ParanthesesBalanceTest
 */
public class ParanthesesBalanceTest {

    public static void main(String[] args) throws StackIsEmptyException {
        String[] lines = new String[12];
        boolean[] isBalanced = new boolean[12];
        lines[0] = "([](){([])})";      isBalanced[0] = true;
        lines[1] = "()[]}";             isBalanced[1] = false;
        lines[2] = "{{[()]]";           isBalanced[2] = false;
        lines[3] = "[]";                isBalanced[3] = true;
        lines[4] = "[]{}";              isBalanced[4] = true;
        lines[5] = "[()]";              isBalanced[5] = true;
        lines[6] = "(())";              isBalanced[6] = true;
        lines[7] = "{[]}()";            isBalanced[7] = true;
        lines[8] = "{";                 isBalanced[8] = false;
        lines[9] = "{[}";               isBalanced[9] = false;
        lines[10] = "foo(bar);";        isBalanced[10] = true;
        lines[11] = "foo(bar[i);";      isBalanced[11] = false;
        for (int i = 0; i < lines.length; i++) {
            System.out.println("For\t" + lines[i]);
            System.out.println("Test,\tFact");
            System.out.println(parenthesesBalance.isBalanced(lines[i]) + ",\t" + isBalanced[i]);
            System.out.println("");
        }
    }
}