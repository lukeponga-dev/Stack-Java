
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
                        newNode.setValue(x);
                        newNode.setNext(head);
                        head = newNode;
                }

                /**
                 * pop()
                 * removes the head node out of the stack.
                 * @return 
                 * @return 
                */
                public String pop() {
                        String result = head.getValue();
                        head = head.getNext();
                        return result;
                }
               
                /**
                 * peek()
                 * 
                 * @return the head node in stack
                */
                public String peek() {
                        return head.getValue();
                }

                /**
                 * length()
                 * count the items in stack
                 * @return, int length of items in stack
                 */
                // public int length( ) {
                //           return lengthR(1,head);
                // }

                // public int lengthR(int x, Node target)  {
                                 
                //         if(!isEmpty()){
                //                         return x;
                //                 }
                //                 if(target.getNext() == null){
                //                         return x;
                //                 }
                //                 else{
                //                         x++;
                //                         target = target.getNext();
                //                       return  lengthR(x++, target.getNext());
                //                 }
                        
                        
                //         }
                private int lengthR(Node from) {
                        return (from == null) ? 0 : (1 + lengthR(from.getNext()));
                    }
                    public int length(){
                            return lengthR(head);
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
