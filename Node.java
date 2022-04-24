public class Node {

    // Variables

    /**
     * variable values
     * to hold the string value
     */
    private String value;

    /**
     * variable next
     * pointing to hold a link to next node
     */
    private Node next;

    // Constructor
    public Node(String x) {
        setValue(x);
        setNext(null);

    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
