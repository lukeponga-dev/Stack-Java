/**
 * Stack class
 * 
 * Stack is a linkedlist of strings.
 * The Stack class holds the head of the
 * linkedlist and a set of stack operations 
 */
public class Stack {

        // The head of the stack 
        protected Node head;

        /**
        * Stack constructor
        */
        public Stack() {
                // initialize head to empty
                head = null;
        }

        /**
        * push(String x)
        * pushes a new node onto the top of the stack
        * @param x, the string being inserted 
        */
        public void push(String x) {
                // create new node
                Node newNode = new Node(x);

                // push into an empty stack
                if(isEmpty()){      
                      head = newNode;
                } else{
                      newNode.setNext(head);
                      head = newNode;
                }
        }

        /**
        * pop()
        * removes the head node out of the stack 
        */
        public void pop() {

                // check for stack underflow
                if (head == null) {
                         System.out.print("\nStack Underflow");
                         return;
                }
                // update the head pointer to point to the next node
                head = head.getNext();
          }

        /**
        * peek()
        * look at the head of the stack 
        * @return, the value of the head
        */
        public String peek() {
                if (!isEmpty()) {
                        return head.getValue();
                  } else {
                        System.out.println("Stack is empty");
                        return null;
                  }
          }

        /**
         * isEmpty()
         * checks if stack is empty
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
         * count the items
         * @return, the length of items in stack
        */
        public int length() {
                int count = 0;
                Node current = head;
                while (current != null) {
                              count ++;
                              current = current.getNext();
                }
                return count;
          }

        /**
         * dump()
         * print the stack
        */
        public void dump() {
               Node current = head;

                // Traverse through the stack
                while (current != null) {
                            
                            // Print the data at current node
                            System.out.println(current.getValue());

                            // go to the next node
                            current = current.getNext();
                  }
          }
  }
