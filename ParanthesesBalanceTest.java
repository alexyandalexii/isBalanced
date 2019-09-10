import mystack.StackIsEmptyException;
import parentheses.parenthesesBalance;

/**
 * ParanthesesBalanceTest
 */
public class ParanthesesBalanceTest {

    public static void main(String[] args) throws StackIsEmptyException {
        String[] lines = new String[13];
        int[] indexes = new int[13];
        lines[0] = "([](){([])})";      indexes[0] = 0;
        lines[1] = "()[]}";             indexes[1] = 5;
        lines[2] = "{{[()]]";           indexes[2] = 7;
        lines[3] = "{{{[][][]";         indexes[3] = 3;
        lines[4] = "{*{{}";             indexes[4] = 3;
        lines[5] = "[[*";               indexes[5] = 2;
        lines[6] = "{*}";               indexes[6] = 0;
        lines[7] = "{{";                indexes[7] = 2;
        lines[8] = "{}";                indexes[8] = 0;
        lines[9] = "";                  indexes[9] = 0;
        lines[10] = "}";                indexes[10] = 1;
        lines[11] = "*{}";              indexes[11] = 0;
        lines[12] = "{{{**[][][]";      indexes[12] = 3;
        for (int i = 0; i < lines.length; i++) {
            System.out.println("For\t" + lines[i]);
            int index = parenthesesBalance.isBalanced(lines[i]);
            if(index == indexes[i]) 
                System.out.println("OK");
            else
                System.out.println("Result " + index + " is not " + indexes[i]);
            System.out.println(""); //
        }
    }
}