public class Stack {
    
    // make node head private
     private Node head;

    // Constructor
     public Stack() {
        
        // initialize head to empty 
        head = null;
       
    }

    // Public Methods

    /**
     * Adds new node to the top of the stack
     */
    public void push(String x) {
        Node newNode = new Node(x);
        newNode.value = x;
        newNode.next = head;
        head = newNode;
        return;
    }

    /**
     * Removes the node from front of the list
     */
    public void pop() {

       // check for stack underflow
        if(head == null){
            System.out.print("\nStack Underflow");
          
            return ;
        }

        // update the head pointer to point to the next node
        head = head.next;
    }

    /**
     * look at the head of the list and return its value
     */
    public String peek() {
        if (!isEmpty()) {
            return head.value;
        } else {
            System.out.println("Stack is empty");
            return null;
        }
    }

    /**
     * checks if stack is empty
     */
    public boolean isEmpty() {
       return length() == 0;
    }

    /**
     * Get the length of the stack
     */
    public int length() {
        int counter = 0;
        Node current = head;
        while (current != null) {
            counter++;
            current = current.next;
        }
        return counter;
    }

    /**
     * Print the stack
     */
    public void dump() {
        Node current = head;
        while (current != null) {
            System.out.println("->" + current.value);
            current = current.next;
        }
    }
}