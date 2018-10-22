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
     * { function_description }.
     * the time complexity for the main method is O(n).
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        BST<Book, String> bst = new BST<Book, String>();
        while (scan.hasNext()) {
            String[] tokens = scan.nextLine().split(",");
            switch (tokens[0]) {
            case "put":
                bst.put(new Book(tokens[1], tokens[2], tokens[2 + 1]),
                    tokens[2 + 2]);
                break;
            case "get":
                System.out.println(
                    bst.get(new Book(tokens[1], tokens[2], tokens[2 + 1])));
                break;
            case "max":
                System.out.println(bst.max().toString());
                break;
            case "min":
                System.out.println(bst.min().toString());
                break;
            case "select":
                System.out.println(bst.select(
                    Integer.parseInt(tokens[1])).toString());
                break;
            case "floor":
                System.out.println(bst.floor(
                    new Book(tokens[1], tokens[2], tokens[2 + 1])).toString());
                break;
            case "ceiling":
                System.out.println(bst.ceiling(
                    new Book(tokens[1], tokens[2], tokens[2 + 1])).toString());
                break;
            default:
                System.out.println("default call");
            }
        }
    }
}

/**
 * Class for book.
 */
class Book implements Comparable<Book> {
    /**
     * { var_description.
     */
    private String name;
    /**
     * { var_description.
     */
    private String author;
    /**
     * var_description.
     */
    private Double price;
    /**
     * Constructs the object.
     */
    private Book() { }
    /**
     * Constructs the object.
     *
     * @param      bookname    The bname
     * @param      bookauthor  The bauthor
     * @param      bookprice   The bprice
     */
    Book(final String bookname, final String bookauthor,
        final String bookprice) {
        this.name = bookname;
        this.author = bookauthor;
        this.price = Double.parseDouble(bookprice);
    }
    /**
     * function_description.
     *
     * @return     { description_of_the_return_value }
     */
     public String getname() {
        return this.name;
    }
    /**
     * function_description.
     *
     * @return     { description_of_the_return_value }
     */
    public String getauthor() {
        return this.author;
    }
    /**
     * function_description.
     *
     * @return     { description_of_the_return_value }
     */
    public Double getprice() {
        return this.price;
    }
    /**
     * function_description.
     *
     * @param      that  The that
     *
     * @return     { description_of_the_return_value }
     */
    public int compareTo(final Book that) {
        if (this.getname().compareTo(that.getname()) > 0) {
            return 1;
        } else if (this.getname().compareTo(that.getname()) < 0) {
            return -1;
        } else if (this.getauthor().compareTo(that.getauthor()) < 0) {
            return -1;
        } else if (this.getauthor().compareTo(that.getauthor()) > 0) {
            return 1;
        }  else if (this.getprice() > that.getprice()) {
            return 1;
        } else if (this.getprice() < that.getprice()) {
            return -1;
        } else {
            return 0;
        }
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String m = "";
        m += this.getname() + ", " + this.getauthor() + ", " + this.getprice();
        return m;
    }
}
