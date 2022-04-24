public class Stack {

  // set private head
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
    // create new node
    Node newNode = new Node(x);

    // add next value onto head of stack
    newNode.setValue(x);
    newNode.setNext(head);
    head = newNode;

    return;
  }

  /**
   * Removes the node from front of the list
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
   * look at the head of the list and return its value
   */
  public String peek() {
    if (!isEmpty()) {
      // return the value of the head
      return head.getValue();
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
   * return the length of items in stack
   *
   * @return
   */
  public int length() {
    // initialize counter
    int counter = 0;
    Node current = head;

    while (current != null) {
      counter++;
      current = current.getNext();
    }
    return counter;
  }

  /**
   * dump the stack
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
