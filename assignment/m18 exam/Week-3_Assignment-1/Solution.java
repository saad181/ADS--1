import java.util.Scanner;

class Stockdata {
    /**
     *  the variable for stocknames.
     */
    private String stockname;
    /**
     * the variable for stock percentage change.
     */
    private Float stockchange;
     /**
     *the object to access of minheap.
     */
    private MinPQ<Double> minObj;
    /**
     *the object to access of maxheap.
     */
    private MaxPQ<Double> maxObj;
    /**
     * Constructs the object.
     *
     * @param      stock   The stock
     * @param      change  The change
     */
    Stockdata(final String stock, final Float change) {
        this.stockname = stock;
        this.stockchange = change;
    }
    /**
     * get method.
     *
     * @return     { description_of_the_return_value }
     */
    public String getName() {
        return this.stockname;
    }
    /**
     * Gets the change.
     *
     * @return     The change.
     */
    public Float getChange() {
        return this.stockchange;
    }
    /**
     * compare to method.
     *
     * @param      that  The that
     *
     * @return     { description_of_the_return_value }
     */
    public int compareTo(final Stockdata that) {
        if (this.getName().compareTo(that.getName()) > 0) {
            return 1;
        } 
        else if (this.getName().compareTo(that.getName()) < 0) {
            return -1;
        } else if (this.getChange().compareTo(that.getChange()) < 0) {
            return -1;
        } else if (this.getChange().compareTo(that.getChange()) > 0) {
            return 0;
        } else {
            return 0;
        }
    }
}
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() { }
    /**
     * main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        try {
            final int six = 6;
            Scanner sc = new Scanner(System.in);
        BST<String, Integer> bst = new BST<String, Integer>();
        int n = sc.nextInt();
        for (int i = 1; i <= (six * n); i++) {
            String s = sc.nextLine();
            String[] tokens = s.split(",");
            Stockdata stock = new Stockdata(tokens[0],
                Float.parseFloat(tokens[1]));
        }
        int n1 = sc.nextInt();
        if (n1 != 0) {
            for (int j = 1; j <= n1; j++) {
                String str1 = sc.nextLine();
                String[] tokens1 = str1.split(",");
                switch (tokens1[0]) {
                    case "get":
                    switch (tokens1[1]) {
                        case "minST":
                        bst.minST(tokens1[2]);
                        break;
                        case "maxST":
                        bst.maxST(tokens1[2]);
                        break;
                        default:
                        break;
                    }
                    break;
                    case "intersection":
                    System.out.println(bst.intersection());
                    break;
                    default:
                    break;
                }
            }
        }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("");
        }
    }
}