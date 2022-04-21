import java.util.ArrayDeque;
import java.util.Deque;

public class Parser {

    // Public Methods

    /**
     * Check if parentheses are balanced return true otherwise false
     * 
     * @param s
     * @return
     */
    public boolean check(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        int scount = 0;
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(c);
            else {
                if (c == ')' && !stack.isEmpty())
                    stack.pop();
                else if (c == ')' && scount > 0)
                    scount--;
                else if (c == ')')
                    return false;
                else {
                    scount++;
                    if (!stack.isEmpty()) {
                        stack.pop();
                        scount++;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    /**
     * Private method getString() for debuging check() method
     * generate random strings with correct and incorrect parentheses equations
     * string limit 10 characters
     */
    // // private List<String> getString(int n){
    // // List<String> combinations = new ArrayList<>();
    // // generateAll(new char[2 * n], 0, combinations);
    // // return combinations;

    // // }

    // private void generateAll(char[] s, int i, List<String> result) {
    // if(i == s.length){
    // if(valid(s))
    // result.add(new String(s));
    // }else{
    // s[i] = '(';
    // generateAll(s, i+1, result);
    // s[i] = ')';
    // generateAll(s, i+1, result);
    // }
    // }

    // public boolean valid(char[] current) {
    // int balance = 0;
    // for (char c: current) {
    // if (c == '(') balance++;
    // else balance--;
    // if (balance < 0) return false;
    // }
    // return (balance == 0);
    // }
}
