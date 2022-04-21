public class Parser {

    // Public Methods

    /**
     * Check if parentheses are balanced return true otherwise false
     *
     * @param s
     * @return
     */
    public boolean check(String s) {
        Stack stack = new Stack();
        int scount = 0;
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(toString());
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

    // generate random parentheses strings
    public String getString() {
        return null;
    }
}

// /**
// * Private method getString() for debuging check() method
// * generate random strings with correct and incorrect parentheses equations
// * string limit 10 characters
// */
// public void getString(char[] s, int i, List<String> result) {
// if (i == s.length) {
// if (valid(s)) result.add(new String(s));
// } else {
// s[i] = '(';
// getString(s, i, result);
// s[i] = ')';
// getString(s, i, result);
// }
// }

// public boolean valid(char[] current) {
// int balance = 0;
// for (char c : current) {
// if (c == '(') balance++; else balance--;
// if (balance < 0) return false;
// }
// return (balance == 0);
// }

// public List<String> generateParenthesis(int n) {
// List<String> toReturn = new ArrayList<>();

// dfs(0, n, n, new StringBuilder(), toReturn);

// return toReturn;
// }

// private void dfs(
// int numOpen,
// int openLeft,
// int n,
// StringBuilder current,
// List<String> result
// ) {
// if (current.length() >= (2 * n)) {
// result.add(current.toString());
// return;
// }

// if (openLeft > 0) {
// int position = current.length();
// current.append('(');
// dfs(numOpen + 1, openLeft - 1, n, current, result);
// current.delete(position, current.length());
// }

// if (numOpen > 0) {
// int position = current.length();
// current.append(')');
// dfs(numOpen - 1, openLeft, n, current, result);
// current.delete(position, current.length());
// }
// }

// }