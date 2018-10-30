/**.
 * List of linkeds.
 */
class LinkedList {
    /**
     * size
     */
    private int size;
    /**
     * Node description
     */
    private Node start;
    /**
     * Constructs the object. for linked list
     */
    LinkedList() {
        size = 0;
        start = null;
    }
    /**
     * Pushes given data to right.
     *
     * @param      data  The data
     */
    public void pushRight(int data) {
        //Node newnode = new Node(data);
        if (start == null) {
            Node newnode = new Node(data);
            start = newnode;
        } else {
            Node a = new Node(data);
            Node temp = start;
            while (temp.getLink() != null) { 
                temp = temp.getLink();    
            }
            temp.setLink(a);
        }
        size++;

    }
    /**
     * Pushes given data to  left.
     *
     * @param      data  The data
     */
    public void pushLeft(int data) {
        Node newnode = new Node(data);
        newnode.setLink(start);
        start = newnode;
        size++;

    }
    /**
     * Removes the left most element in the LInkedList.
     */
    public  void removeLeft() {
        if (start == null) {
            System.out.println("No nodes to remove");
        }
        if (start != null) {
            start = start.getLink();
        }
        size--;
    }
    /**
     * pops out the Left most element in the Linked list.
     */
    public  void popLeft() {
        if (start == null) {
            System.out.println("No nodes to remove");
        }
        if (start != null) {
            start = start.getLink();
        }
        size--;
    }
    /**
     * gives size of linked list
     *
     * @return     { description_of_the_return_value }
     */
    public int size() {
        if (size <= 0) {
            return 0;
        }
        return size;
    }
    /**
     * Removes  right most element in the linked list.
     */
    public void removeRight() {
        Node temp = start;

        if (start == null) {
            System.out.println("Node is Empty");;
        } else if (size < 2) {
            start = null;
        } else {
            while (temp.getLink().getLink() != null) {
                temp = temp.getLink();

            }
            temp.setLink(null);
        }
        size--;
    }
    /**
     * removes the given item
     * @param      item  The item
     */
    public void remove(int item) {
        Node current = start ;
        Node temp = null;
        if(current != null && current.getData() == item) {
            current = current.getLink();
            start = current;
        } else{
            while (current.getLink().getLink() != null && current.getLink().getData() != item) {
                temp = current;
                current = current.getLink();
            }
            if(current.getLink().getData() == item) {
                current = current.getLink().getLink();
            }
            
        }
        size--;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String str = "";
        Node temp = start;
        if (temp == null) {
            return "Empty linked list";
        }
        while (temp != null) {
            str = str  + temp.getData() + ", " ;
            temp = temp.getLink();
        }
        str = str.substring(0, str.length() - 2);
        return str;
    }
}