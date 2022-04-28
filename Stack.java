/**
 * Stack class
 * 
 * Stack is a linkedlist of strings.
 * The Stack class holds the head of the
 * linkedlist and a set of stack operations
 */
public class Stack {

        // The head of the stack
        private Node head;

        /**
         * Constructor
         */
        public Stack() {
                head = null;
        }

        /**
         * push(String x)
         * pushes a new node onto the top of the stack
         * 
         * @param x, the string being inserted
         */
        public void push(String x) {
                Node newNode = new Node(x);
                if (head == null) {
                        newNode.setNext(head);
                }
                newNode.setNext(head);
                head = newNode;
        }

        /**
         * pop()
         * removes the head node out of the stack.
         * if stack is empty
         * 
         * @return Stack Underflow
         */
        public void pop() {

                // print underflow if empty stack
                if (isEmpty()) {
                        System.out.println("\nStack is empty");
                        return;
                }

                // update the head to point to the next node
                head = head.getNext();
        }

        /**
         * peek()
         * looks at the head node.
         * 
         * @return the head value
         */
        public String peek() {
                if (!isEmpty()) {
                        return head.getValue();
                }
                return null;
        }

        /**
         * length()
         * count the items in stack
         * @return, int length of items in stack
         */
        public int length() {
                Node currNode = head;
                int count = 0;

                // loop to ilterate through the stack
                while (currNode != null) {
                        // increment 1 to count
                        count++;

                        // move to next node
                        currNode = currNode.getNext();
                }
                // return count
                return count;
        }

        /**
         * isEmpty()
         * If Node head is empty
         * 
         * @return true else false
         */
        public boolean isEmpty() {
                if (head == null) {
                        return true;
                }
                return false;
        }

        /**
         * dump()
         * prints out the strings in stack
         */
        public void dump() {
                Node currNode = head;

                // loop to iterate through the stack
                while (currNode != null) {

                        // Print the data at current node
                        System.out.println(currNode.getValue());

                        // go to the next node
                        currNode = currNode.getNext();
                }
        }
}
