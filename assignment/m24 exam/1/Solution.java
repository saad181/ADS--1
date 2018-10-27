/**
 * for scanner function.
 */
import java.util.Scanner;
/**
 * solution class.
 */
final class Solution{
  /**
   * default constructor.
   */
  private Solution() {
    //unused.
  }
  /**
   * @param args description.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    LinearProbingHashST<String, Student> hash = new LinearProbingHashST<String, Student>();
    int n = Integer.parseInt(scan.nextLine());
    while (n>0){
      String[] record = scan.nextLine().split(",");
      hash.put(record[0],new Student(record[1],
        Double.parseDouble(record[2])));
      n = n - 1 ;
    }
    /**
     *  code for performing queries.
     */
    int get = Integer.parseInt(scan.nextLine());
          while (get > 0) {
              String[] line = scan.nextLine().split(" ");
              if (line[2].equals("2")) {
                //used in check key contains in hash table or not.
                  if (hash.contains(line[1])) {
                      System.out.println(hash.get(line[1]).getMarks());
                  }
                  else {
                      System.out.println("Student doesn't exists...");
                  }
              } else if (line[2].equals("1")) {
                  if (hash.contains(line[1])) {
                      System.out.println(hash.get(line[1]).getName());
                  } else {
                      System.out.println("Student doesn't exists...");
                  }
              }
              get--;
          }
  }
}