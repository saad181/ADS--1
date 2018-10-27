import java.util.Scanner;
/**
 * Class for linear probing.
 */
class LinearProbing {
    /**
    *intialising variable for capacity.
    */
    private static final int CAPACITY = 4;
    /**
     *intialising array alphabet.
     */
    private String[] alphabet;
    /**
     *intialising array value.
     */
    private Integer[] value;
    /**
     *intialising variable arraylength.
     */
    private int arraylength;
    /**
     *intialising variable size.
     */
    private int size;
    /**
     * Constructs the object.
     */
    LinearProbing() {
        this(CAPACITY);
    }
    /**
     * Constructs the object.
     *
     * @param      capacity  The capacity
     */
    LinearProbing(final int capacity) {
        arraylength = capacity;
        size = 0;
        alphabet = new String[arraylength];
        value = new Integer[arraylength];
    }
    /**
    *to put the alphabet in table.
    *complexity is O(N) in worst case.
    *
    * @param   string    The key
    * @param   val  The value
    */
    public void put(final String string, final int val) {
        if (size >= (arraylength / 2)) {
            resize(2 * arraylength);
        }
        int index;
        for (index = hash(string); alphabet[index] != null;
                index = (index + 1) % arraylength) {
            if (alphabet[index].equals(string)) {
                value[index] = val;
                return;
            }
        }
        alphabet[index] = string;
        value[index] = val;
        size++;
    }
    /**
     *this method returns the hash value.
     * @param      string   The key
     * complexity O(1).
     * @return hash value
     */
    public int hash(final String string) {
        return (((CAPACITY + CAPACITY + 2 + 1) * string.hashCode()) % arraylength);
    }
    /**
     *resizingthe arrays.
     *time complexity is O(N) as we are copying the whole array
      *to another.
     *
     * @param     capacity  The capacity
     */
    public void resize(final int capacity) {
        LinearProbing temp = new LinearProbing(capacity);
        for (int i = 0; i < arraylength; i++) {
            if (alphabet[i] != null) {
                temp.put(alphabet[i], value[i]);
            }
        }
        alphabet = temp.alphabet;
        value = temp.value;
        arraylength = temp.arraylength;
    }
    /**
     *to search for the key.
     *time complexity is O(N) in thw worst case.
     * @param      string   string
     *
     * @return it returns the value.
     *
     */
    public Integer get(final String string) {
        int index;
        for (index = hash(string); alphabet[index] == null;
                index = (index + 1) % arraylength) {
            if (alphabet[index].equals(string)) {
                //      System.out.println(value[index]);
                return value[index];
            }
        }
        return null;
    }
    /**
     *complexity is O(N) as we are adding all the elements
      *and complexity of enqueue is 1.
     * @return  key value pairs for printing..
     */
    public Iterable<String> keys() {
        Queue<String> queue = new Queue<String>();
        for (int i = 0; i < arraylength; i++) {
            if (alphabet[i] != null) {
                queue.enqueue(alphabet[i]);
            }
        }
        return queue;
    }
    /**
     *string representation of key value.
     *time complexity is O(N) as we are itearing the
      *whole array.
     * @return string contains the key value pairs.
     */
    public String display(){
        if (size == 0) {
            return "{}";
        }
        String str = "{";
        for (String check : keys()) {
            str += check + ":" + get(check) + ", ";
        }
        str = str.substring(0, str.length() - 2);
        str += "}";
        return str;
    }
    /**
     *the method is to delete the ke
     *complexity is O(N) which is the size of the array.
     * in worst case.
     * @param      string   string to be deleted.
     */
    public void delete(final String string) {
        if (!contains(string)) {
            return;
        }
        int i = hash(string);
        while (!string.equals(alphabet[i])) {
            i = (i + 1) % arraylength;
        }
        alphabet[i] = null;
        value[i] = null;
        i = (i + 1) % arraylength;
        while (alphabet[i] != null) {
            String charac = alphabet[i];
            int val = value[i];
            alphabet[i] = null;
            value[i] = null;
            size--;
            put(charac, val);
            i = (i + 1) % arraylength;
        }
        size--;
        if (size > 0 && size <= arraylength / (2 + 2 + 2 + 2)) {
            resize(arraylength / 2);
        }
    }
    /**
     *this returns whether the key is present or not.
     * @param      string  the key
     * complexity O(n) in worst case as the complexity of get
      * method is n in worst case.
     * @return  key is present
     * or not.
     */
    public boolean contains(final String string) {
        return get(string) != null;
    }
}
/**
 * Class for solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * main method for the program.
     * complexity O(n) as the complexities of put
     * and get method in linear probing class is n.
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        LinearProbing linear = new LinearProbing();
        String number = scan.nextLine();
        while (scan.hasNext()) {
            String[] tokens = scan.nextLine().split(" ");
            switch (tokens[0]) {
            case "put":
                linear.put(tokens[1], Integer.parseInt(tokens[2]));
                break;
            case "get":
                System.out.println(linear.get(tokens[1]));
                break;
            case "delete":
                linear.delete(tokens[1]);
                break;
            case "display":
                System.out.println(linear.display());
                break;
            default:
                break;
            }
        }
    }
}
