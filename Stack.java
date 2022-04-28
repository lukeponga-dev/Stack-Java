/**
 * Stack class
 * 
 * Stack is a linkedlist of strings.
 * The Stack class holds the head of the
 * linkedlist and a set of stack operations
 * 
 * @author Luke Ponga
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
                        newNode.setNext(head);
                        head = newNode;
                }

                /**
                 * pop()
                 * removes the head node out of the stack.
                 * @return 
                */
                public void pop() {
                        head = head.getNext();
                }
               
                /**
                 * peek()
                 * 
                 * @return the head node in stack
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
                        return lengthR(head);
                }

                public int lengthR(Node current) {
                        int count = 0;
                        while (current != null) {
                                count++;
                                current = current.getNext();
                        }
                        return count;
                }

                /**
                 * isEmpty()
                 * If Node head is empty
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
                 * calls dumpR() method
                 */
                public void dump() {
                        dumpR(head);
                }

                /**
                 * dumpR() Recursive method 
                 * prints out the strings in stack to the console
                 * @param currNode
                 */
                private void dumpR(Node currNode) {
                        if (currNode == null) {
                                return;
                        } 
                        // output the value of current node
                        System.out.println(currNode.getValue());
                             
                        // go to the next node
                        dumpR(currNode.getNext());
                }

}
