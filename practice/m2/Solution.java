import java.util.*;

public class Solution {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        Linkedlist ll = new Linkedlist();
        while(scan.hasNext()) {
            String[] line = scan.nextLine().split(" ");
            switch(line[0]) {
                case "size":
                System.out.println(ll.size());
                break;
                case "pushLeft":
                ll.pushLeft(Integer.parseInt(line[1]));
                System.out.println(ll);
                break;
                case "pushRight":
                ll.pushRight(Integer.parseInt(line[1]));
                System.out.println(ll);
                break;
                case "removeLeft":
                ll.removeLeft();
                System.out.println(ll);
                break;
                case "removeRight":
                ll.removeRight();
                System.out.println(ll);
                break;
                default:
                break;
            }
        }
    }
}