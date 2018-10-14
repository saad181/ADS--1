class BST<Key extends Comparable<Key>, Value> {
    Node root;
    int size = 0;
    private class Node {
        private Book key;
        private Value value;
        private Node left;
        private Node right;
    }
    public void put(Book key, Value value) {
        if (key == null)  {
            System.out.println("null");
        }
        root = put(root, key, value);
    }
    /**
     * the time complexity for the method is O(logN).
     *
     * @param      root   The root
     * @param      key    The key
     * @param      value  The value
     *
     * @return     { description_of_the_return_value }
     */
    private Node put(Node root, Book key, Value value) {
        if (root == null) {
            Node n = new Node();
            n.key = key;
            n.value = value;
            n.left = null;
            n.right = null;
            root = n;
            size++;
        }
        int cmp = key.compareTo(root.key);
        if(cmp < 0) {
            root.left  = put(root.left,  key, value);
        }
        else if (cmp > 0) {
            root.right = put(root.right, key, value);
        }
        else {
            root.value = value;
        }
        return root;

    }
    public Value get(Book key) {
        return get(root, key);
    }
    /**
     * the time complexity for the method is O(logN).
     *
     * @param      x     { parameter_description }
     * @param      key   The key
     *
     * @return     { description_of_the_return_value }
     */
    private Value get(Node x, Book key) {
        if (key == null) {
            System.out.println("empty");
        }
        if (x == null) {
            //System.out.println("in get");
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            return get(x.left, key);
        }
        else if (cmp > 0) {
            return get(x.right, key);
        }
        else {
            return x.value;
        }
    }
}