public class Node {

        // variables

        /** Private Variables
         *  String value to hold the string value
         *  Node next to hold a link to another Node
         */
        private String value;
        private Node next;

        // Node Constructor

        /** Node(String x)
         * takes value as a string argument and
         * copies that value into the Node’s private member variable
         * @param x
         */
        public Node(String x) {
                setValue(x);
                setNext(next);
        }

        // Methods 
        // setters and getters
        
        /** setValue(String x)
         * @param x
        */
        public void setValue(String x) {
                this.value = x;
        }

        /**
         * setNext(Node next)
         * @param next
        */
        public void setNext(Node next) {
                this.next = next;
        }

        /**
         * getNext()
         * 
         * @return
        */
        public Node getNext() {
                return next;
        }

        /**
         * getValue()
         * 
         * @return
        */
        public String getValue() {
                return value;
        }
}
