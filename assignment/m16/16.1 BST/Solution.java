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
        Scanner sc = new Scanner(System.in);
        BST<String, Integer> bs = new BST<String, Integer>();
        while (sc.hasNextLine()) {
            String st = sc.nextLine();
            String[] tokens = st.split(",");
            Book b = new Book(tokens[1], tokens[2],
                Float.parseFloat(tokens[2 + 1]));
            switch (tokens[0]) {
                case "put":
                bs.put(b, Integer.parseInt(tokens[2 + 2]));
                break;
                case "get":
                System.out.println(bs.get(b));
                break;
                default:
                break;
            }
        }
    }
}

/**
 * Class for book.
 */
class Book {
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
    private Float price;
    /**
     * Constructs the object.
     */
    private Book() { }
    /**
     * Constructs the object.
     *
     * @param      bookname    The bookname
     * @param      bookauthor  The bookauthor
     * @param      bookprice   The bookprice
     */
    Book(final String bookname, final String bookauthor,
        final Float bookprice) {
        this.name = bookname;
        this.author = bookauthor;
        this.price = bookprice;
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
    public Float getprice() {
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
        } else if(this.getname().compareTo(that.getname()) > 0) {
            return -1;
        } else if(this.getauthor().compareTo(that.getauthor()) > 0) {
            return -1;
        } else if (this.getauthor().compareTo(that.getauthor()) > 0) {
            return 0;
        } else if (this.getprice() > that.getprice()) {
            return 1;
        } else if (this.getprice() < that.getprice()) {
            return -1;
        } else {
            return 0;
        }
    }
}