import java.util.*;
class Solution {
	Solution() {

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		BinaryST<Student, Double> bstobj = new BinaryST();
		for (int i = 0; i < n; i++) {
			String[] inp = sc.nextLine().split(",");
			bstobj.put(new Student(inp[1], Double.parseDouble(inp[2]),
                Integer.parseInt(inp[0])),
                Double.parseDouble(inp[2]));
		}
		int queries = Integer.parseInt(sc.nextLine());
		Iterable<Student> keys = bstobj.keys();
		for (int i = 0; i < queries; i++) {
			double inp = Double.parseDouble(sc.nextLine());
			boolean check  = false;
			for (Student s: keys) {
			
			if (bstobj.get(s) == inp) {
				check = true;
				System.out.println(s);
			}			
		}
		if(!check){
			System.out.println("this marks are not awarded to student");
		 }
		}
	}
	}
