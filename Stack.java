/**
 * Stack class
 * 
 * Stack is a linkedlist of strings.
 * The Stack class holds the head of the
 * linkedlist and a set of stack operations 
 */
public class Stack {

        // The head of the stack to be private
        protected Node head;

        /**
        * Stack constructor
        */
        public Stack() {
                // Initialize head to empty
                head = null;
        }

        /**
        * push(String x)
        * pushes a new node onto the top of the stack
        * @param x, the string being inserted 
        */
        public void push(String x) {
                
                // create new node with values being x
                Node newNode = new Node(x);
                newNode.setValue(x);

                // push into an empty stack 
                // else move stack down & point next newNode to head
                if(isEmpty()){      
                      head = newNode;
                } else{  
                      newNode.setNext(head);
                      head = newNode;
                }
        }

        /**
         * pop()
         * removes the head node out of the stack. 
         * if stack is empty 
         * @return Stack Underflow
        */
        public void pop() {

                // print underflow if empty stack  
                if (isEmpty()) {
                        System.out.print("\nStack Underflow");
                        return;
                }
                
                // update the head to point to the next node
                head = head.getNext();
        }

        /**
         * peek()
         * looks at the head node and
         * @return the head value
        */
        public String peek() {
                if (isEmpty()) {
                        System.out.println("\nStack is empty");
                        return null;
                  } else {
                        return head.getValue();
                  }
        }

        /**
         * isEmpty()
         * if head is null the stack is empty,
         * @return, true or false
        */
        public boolean isEmpty() {
                if (head == null){
                        return true;
                }
                return false;
        }

        /**
         * length() 
         * count the items in stack
         * @return, int length of items in stack
        */
        public int length() {
                int count = 0;
                Node currNode = head;
                
                // Traverse the stack & increment count by 1
                while (currNode != null) {
                              count ++;
                              currNode = currNode.getNext();
                } 
                return count;
        }

        /**
         * dump()
         * dump the items in stack
        */
        public void dump() {
               Node currNode = head;

                // Traverse through the stack
                while (currNode != null) {
                            
                            // Print the data at current node
                            System.out.println(currNode.getValue());

                            // go to the next node
                            currNode = currNode.getNext();
                  }
        }
}
