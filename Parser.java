/**
 * Parser class
 * 
 * Parser class has a method which uses stack class,
 * to determine if a string is well formated with regards to its parentheses
 * and a private method getString() which,
 * generates random strings with random parentheses. to debug the check() method
 */
public class Parser {

        /**
         * Check(str) if parentheses are balanced
         * @return, return true otherwise false
         */
        public boolean check(String str) {

                // Initilize variables
                Stack stack = new Stack();
                int scount = 0;

                // Traverse the characters in String str
                for (char ch : str.toCharArray()) {
                        if (ch == '(') {
                                // push the element in the stack
                                stack.push(str);
                        } else if (ch == ')' && !stack.isEmpty()) {
                                stack.pop();
                        } else if (ch == ')' && scount > 0) {
                                scount --;
                        } else if (ch == ')') {
                                return false;
                        } else {
                                scount ++;
                                if (!stack.isEmpty()) {
                                        stack.pop();
                                        scount ++;
                                }
                        }
                }

                // Check empty stack
                return stack.isEmpty();
        }

        /**
         * generate random parentheses strings
         */
        protected String getString() {

                // Contains ( )
                String str = "()";
                int strLength = 10;

                // create string buffer size of strLength
                StringBuilder sBuilder = new StringBuilder(strLength);
                for (int i = 0; i < strLength; i++) {

                        // generate a random string of index
                        int index = (int) (str.length() * Math.random());
                        sBuilder.append(str.charAt(index));

                     
                        
                }
                String test = sBuilder.toString();
                boolean result = check(test);
                System.out.println(String.format("%10s: %s", test, result));

                return sBuilder.toString();
        }
}
