/**
 * List of linkeds.
 */
class LinkedList {
    /**
     * Head Node
     */
    Node head;
    /**
     * Tail Node.
     */
    Node tail;
    /**
     * Size of Linked List.
     */
    int size;
    /**
     * Insert Node at Head.
     *
     * @param      data   The data
     * @param      value  The value
     */
    public void insertAtHead(String data, int value) {
        Node start = new Node(data, value);
        size++;
        if (head == null) {
            head = start;
            tail = start;
            // System.out.println(printList());
            return;
        }
        start.setAddress(head);
        head = start;
        // System.out.println(printList());
        return;
    }
}
/**
 * Class for node.
 */
class Node {
    /**
     * Data variable.
     */
    String data;
    /**
     * Value Variable.
     */
    int value;
    /**
     * Next Node address.
     */
    Node next;
    Node(String key, int value1) {
        data = key;
        value = value1;
        next = null;
    }
    /**
     * Gets the address.
     *
     * @return     The address.
     */
    public Node getAddress() {
        return next;
    }
    /**
     * Set the address of next node.
     *
     * @param      address  The address
     */
    public void setAddress(Node address) {
        next = address;
    }
    /**
     * Set the data for data variable.
     *
     * @param      data1  The data 1
     */
    public void setdata(String data1) {
        data = data1;
    }
}