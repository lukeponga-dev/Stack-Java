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
        * Stack constructor
        */
        public Stack() {
                head = null;  
        }

        /**
        * push(String x)
        * pushes a new node onto the top of the stack
        * @param x, the string being inserted 
        */
        public void push(String x) {
                
                Node newNode = new Node(x);
              
                // push into an empty stack 
                if(isEmpty()) {      
                        head = newNode;
                        return;
                } else {  
                        newNode.setNext(head);
                        head = newNode;
                        return;
                }
        }

        /**
         * pop()
         * removes the head node out of the stack. 
         * if stack is empty 
         * @return Stack Underflow
        */
        public int pop() {

                // print underflow if empty stack  
                if (isEmpty()) {
                        System.out.println("\nStack is empty");
                        return -1;
                 }
                
                // update the head to point to the next node
                head = head.getNext();
                return -1;
        }

        /**
         * peek()
         * looks at the head node.
         * @return the head value
        */
        public String peek() {
                if (isEmpty()) {
                        return "\nEmpty Stack";
                } else {
                       return head.getValue();
                  }
        }

        /**
         * length() 
         * count the items in stack
         * @return, int length of items in stack
        */
        public int length() {
                Node currNode = head;

                // Initialises variable to keep count
                int count = 0;

                // loop to ilterate through the stack
                while (currNode != null) {

                        // increment 1 to count
                        count ++;

                        // move to next node
                        currNode = currNode.getNext();
                } 
                // return count
                return count;
        }

         /**
         * isEmpty()
         * true if length() is 0, false otherwise.
         * @return, true or false
        */
        public boolean isEmpty() {
                if (length() == 0) {
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
