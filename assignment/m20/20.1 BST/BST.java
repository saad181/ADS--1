public class BST<Key extends Comparable<Key>, Value> {
    private Node root;
    int size = 0;
    /**
     * Class for node.
     */
    private class Node {
        /**
         * created a variable key.
         */
        private Key key;
        /**
         * created a variable value.
         */
        private Value value;
        /**
         * created a variable left.
         */
        private Node left;
        /**
         * created a variable right.
         */
        private Node right;
        /**
         * created a variable count.
         */
        private int count;
    }
    /**
     * created a  method put.
     *
     * @param      key    The key
     * @param      value  The value
     */
    public void put(Key key, Value value) {
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
    private Node put(Node root, Key key, Value value) {
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
        root.count = 1 + size(root.left) + size(root.right);
        return root;

    }
    public Value get(Key key) {
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
    private Value get(Node x, Key key) {
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
    /**
     *the time complexity is O(logN)
     * created a method min.
     *
     * @return     { description_of_the_return_value }
     */
    public Key min() {
        return min(root).key;
    }
    /**
     * created a method min.
     *
     * @param      x     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    private Node min(Node x) {
        if (x.left == null) {
            return x; 
        }
        else {
            return min(x.left); 
        }
    }
    /**
     *the time complexity is O(logN).
     * created a method max.
     *
     * @return     { description_of_the_return_value }
     */
    public Key max() {
        return max(root).key;
    }
    /**
     * created a method max.
     *
     * @param      x     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    private Node max(Node x) {
        if (x.right == null) {
            return x;
        }
        else {
            return max(x.right);
        }
    }
    /**
     * the time complexity is O(logN).
     * created a method floor.
     *
     * @param      key   The key
     *
     * @return     { description_of_the_return_value }
     */
    public Key floor(Key key) {
        Node x = floor(root, key);
        if (x == null) {
            return null;
        }
        return x.key;
    }
    /**
     * The time complexity is O(logN).
     * 
     * created a method floor.
     *
     * @param      x     { parameter_description }
     * @param      key   The key
     *
     * @return     { description_of_the_return_value }
     */
    private Node floor(Node x, Key key) {
         if (x == null) {
            return null;
         }
         int cmp = key.compareTo(x.key);
         if (cmp == 0) {
            return x;
         }
         if (cmp < 0) {
            return floor(x.left, key);            
         }
         Node t = floor(x.right, key);
         if (t != null) {
            return t;
         }
         else {
            return x;
         }
    }
    /**
     * The time complexity is O(logN).
     * created a method ceiling.
     *
     * @param      key   The key
     *
     * @return     { description_of_the_return_value }
     */
    public Key ceiling(Key key) {
        Node x = ceiling(root, key);
        if (x == null) {
            return null;
        }
        return x.key;
    }
    /**
     * created a method ceiling.
     *
     * @param      x     { parameter_description }
     * @param      key   The key
     *
     * @return     { description_of_the_return_value }
     */
    private Node ceiling(Node x, Key key) {
        if (x == null) {
            return null;
         }
         int cmp = key.compareTo(x.key);
         if (cmp == 0) {
            return x;
         }
         if (cmp > 0) {
            return ceiling(x.right, key);            
         }
         Node t = ceiling(x.left, key);
         if (t != null) {
            return t;
         }
         else {
            return x;
         }
    }
    /**
     * The time complexity is O(logN).
     * created a method size.
     *
     * @return     { description_of_the_return_value }
     */
    public int size() { 
        return size(root);
    }
    /**
     * created a method size.
     *
     * @param      x     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    private int size(Node x) {
        if (x == null) {
            return 0;
        }
        return x.count;
    }
    /**
     * The time complexity is O(logN).
     * created a method size.
     *
     * @param      k     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public Key select(int k) {
        Node x = select(root, k);
        return x.key;
    }
    /**
     * created a method select.
     *
     * @param      x     { parameter_description }
     * @param      k     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    private Node select(Node x, int k) {
        if (x == null) {
            return null; 
        }
        int t = size(x.left); 
        if (t > k) {
            return select(x.left,  k); 
        }
        else if (t < k) {
            return select(x.right, k - t - 1); 
        }
        else {
            return x; 
        }
    }
    /**
     *created a method deledteMin.
     * the time complexity for the method is O(h).
     * h is the height of the tree.
     */
    public void deleteMin() {
        root = deleteMin(root);
    }
    /**
     * created a method deleteMin.
     * the time complexity for the method is O(h).
     * h is the height of the tree.
     *
     * @param      x     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    private Node deleteMin(Node x) {
        if (x.left == null) {
            return x.right;
        }
        x.left = deleteMin(x.left);
        x.count = size(x.left) + size(x.right) + 1;
        return x;
    }
    /**
     * created a method deleteMax.
     * the time complexity for the method is O(h).
     * h is the height of the tree.
     */
    public void deleteMax() {
        root = deleteMax(root);
    }
    /**
     * created a method deleteMax.
     * the time complexity for the method is O(h).
     * h is the height of the tree.
     *
     * @param      x     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    private Node deleteMax(Node x) {
        if (x.right != null) {
            return x.left;
        }
        x.right = deleteMax(x.right);
        x.count = size(x.left) + size(x.right) + 1;
        return x;
    }
    /**
     * created a method deledte.
     * the time complexity for the method is O(h).
     * h is the height of the tree.
     *
     * @param      key   The key
     */
    public void delete(Key key) {
        root = delete(root, key);
    }
    /**
     * created a method delete.
     * the time complexity for the method is O(h).
     * h is the height of the tree.
     *
     * @param      x     { parameter_description }
     * @param      key   The key
     *
     * @return     { description_of_the_return_value }
     */
    private Node delete(Node x, Key key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left  = delete(x.left,  key);
        } else if (cmp > 0) {
            x.right = delete(x.right, key);
        } else { 
            if (x.right == null) {
                return x.left;
            }
            if (x.left  == null) {
                return x.right;
            }
            Node t = x;
            x = min(t.right);
            x.right = deleteMin(t.right);
            x.left = t.left;
        } 
        x.count = size(x.left) + size(x.right) + 1;
        return x;
    }
}

