import java.util.*;
class Solution {
	Solution() {

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		HashMap<Student, Double> data = new HashMap<Student, Double>();
		for (int i = 0; i < n; i++) {
			String[] inp = sc.nextLine().split(",");
			data.put(new Student(inp[1], Double.parseDouble(inp[2]),
                Integer.parseInt(inp[0])),
                Double.parseDouble(inp[2]));
		}
		int q = Integer.parseInt(sc.nextLine());
		//ArrayList<Student> obj = new ArrayList<Student>();
		
		for (int i = 0; i < q; i++) {
			Iterator it = data.entrySet().iterator();
			double inp = Double.parseDouble(sc.nextLine());
			int c = 0;
    while (it.hasNext()) {
    	
    	        Map.Entry pair = (Map.Entry)it.next();
        if (pair.getValue().equals(inp)) {
        	System.out.println(pair.getKey());
        	
        	c++;
        }
         
    }

    if (c==0) {
    	System.out.println("This marks are not awarded to any student");
    }
    }
		
}
   }

    