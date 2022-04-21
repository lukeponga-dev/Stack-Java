import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initlize Stack 
        Stack stack = new Stack();

        // push items onto stack
        stack.push("ONE ");
        stack.push("TWO ");
        stack.push("THREE ");
        stack.push("FOUR ");
        stack.dump();
        // Peek top of stack
      System.out.println("Peek: " +   stack.peek());
        // pop top of stack
        stack.pop();
        stack.dump();
        System.out.println("Peek: " +   stack.peek());
        System.out.println("Empty Stack: " + stack.isEmpty());
        System.out.println("Stack Length: " + stack.length());
Parser parser = new Parser();
System.out.println("Check : " + parser.check(") ) () ( ("));

     

        

       
    }
}