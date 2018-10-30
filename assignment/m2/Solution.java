import java.util.Scanner;
/**.
 * Class for solution.
 */
public final class Solution {
    /**.
     * Constructor for the solution.
     */
    private Solution() {

    }
    /**
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList linked = new LinkedList();
        while (scan.hasNext()) {
            String[] line = scan.nextLine().split(" ");
            switch (line[0]) {
                case "size":
                System.out.println(linked.size());
                break;
                case "pushLeft":
                linked.pushLeft(Integer.parseInt(line[1]));
                System.out.println(linked);
                break;
                case "pushRight":
                linked.pushRight(Integer.parseInt(line[1]));
                System.out.println(linked);
                break;
                case "removeLeft":
                linked.removeLeft();
                System.out.println(linked);
                break;
                case "popLeft":
                linked.popLeft();
                System.out.println(linked);
                break;
                case "removeRight":
                linked.removeRight();
                System.out.println(linked);
                break;
                case "print" :
                linked.toString();
                System.out.println(linked);
                break;
                case "remove":
                linked.remove(Integer.parseInt(line[1]));
                System.out.println(linked);
                default:
                break;
            }
        }
    }
}