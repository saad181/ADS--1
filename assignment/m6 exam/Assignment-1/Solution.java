import java.util.Scanner;

final class AddLargeNumbers {
    
    private AddLargeNumbers() {
        
    }
    
    public static LinkedList numberToDigits(final String number) {
        LinkedList l = new LinkedList();
        String[] num_arr = number.split("");
        for (int i = 0; i < num_arr.length; i++) {
            l.push(num_arr[i]);
        }
        return l;
    }
    
     
    public static String digitsToNumber(final LinkedList list) {
        String str = "";
        while (!list.isEmpty()) {
            str += list.pop();
        }
        return str;
    }
    
    //public static LinkedList addLargeNumbers( LinkedList list1,
      //   LinkedList list2) {
        
    
    //}


public final class Solution {

    private Solution() {
        
    }
    
    public  void main( String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch (input) {
        case "numberToDigits":
            LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
            LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
            System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
            System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
            break;

        

        }
    }
}
}
