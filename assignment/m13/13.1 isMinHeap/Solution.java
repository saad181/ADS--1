import java.util.Scanner;
/**
 * Class for solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() { }
    /**
     * function_description.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        int n = Integer.parseInt(s.nextLine());
        switch (s1) {
            case "String":
            while (n > 0) {
            String[] tokens = s.nextLine().split(",");
            Priority<String> m = new Priority<String>(tokens);
            System.out.println(m.isminHeap());
            n--;
                }
                break;
            case "Integer":
            while (n > 0) {
            String[] tokens = s.nextLine().split(",");
            Integer[] intTokens = new Integer[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                intTokens[i] = Integer.parseInt(tokens[i]);
               }
            Priority<Integer> m = new Priority<Integer>(intTokens);
            System.out.println(m.isminHeap());
            n--;
                }
                break;
            case "Double":
            while (n > 0) {
            String[] tokens = s.nextLine().split(",");
            Double[] idTokens = new Double[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                idTokens[i] = Double.parseDouble(tokens[i]);
            }
            Priority<Double> m = new Priority<Double>(idTokens);
            System.out.println(m.isminHeap());
            n--;
                }
        break;
        case "Float":
        while (n > 0) {
        String[] tokens = s.nextLine().split(",");
        if (tokens[0].equals("")) {
            System.out.println("false");
            break;
        } else {
        Float[] ftokens = new Float[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
                ftokens[i] = Float.parseFloat(tokens[i]);
            }
        Priority<Float> m = new Priority<Float>(ftokens);
        System.out.println(m.isminHeap());
        n--;
            }
        }
        break;
        default:
        break;
    }

    }
}
/**
 * Class for priority.
 *
 * @param      <E>   { parameter_description }
 */
class Priority<E extends Comparable<E>> {
    E[] array;
    int size;
    /**
     * Constructs the object.
     *
     * @param      a     { parameter_description }
     */
    Priority(final E[] a) {
        this.array = a;
    }
    /**
     * function_description.
     *
     * @return     { description_of_the_return_value }
     */
    public boolean isminHeap() {
        for(int i = 1; i < array.length; i++) {
            if (2 * i > array.length && greater(2 * i,i)) {
                return false;
            } if ((2 * i) + 1 < array.length && greater(2 * i+1,i)) {
                return false;
            }
        }
        return true;
    }
    /**
     * { function_description }
     *
     * @param      i     { parameter_description }
     * @param      j     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public boolean greater (int i, int j) {
        return array[i].compareTo(array[j]) < 0;
    }
}