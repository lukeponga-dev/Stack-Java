import java.lang.annotation.Retention;
import java.util.Random;
import java.util.Scanner;
import javax.lang.model.element.Element;

public class Parser {

    // Public Methods

    /**
     * Check if parentheses are balanced return true otherwise false
     *
     * @param s
     * @return
     */
    public boolean check(String str) {
        // using Stack
        Stack stack = new Stack();

        // Initialize count
        int scount = 0;

        // Traversing characters in String
        for (char c : str.toCharArray()) {
            if (c == '(') {
                // push the element in the stack
                stack.push(str);
            } else if (c == ')' && !stack.isEmpty()) {
                stack.pop();
            } else if (c == ')' && scount > 0) {
                scount--;
            } else if (c == ')') {
                return false;
            } else {
                scount++;

                if (!stack.isEmpty()) {
                    stack.pop();
                    scount++;
                }
            }
        }

        // Check empty stack
        return stack.isEmpty();
    }

    /**
     * generate random parentheses strings
     */
    public String getString() {
        String str = "(" + ")";
        int n = 10;

        // create string buffer size of n
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            // generate a random
            int index = (int) (str.length() * Math.random());

            sb.append(str.charAt(index));
        }

        String test = sb.toString();
        boolean result = check(sb.toString());
        System.out.println(String.format("%.10s : %s", test, result));

        return sb.toString();
    }
}
