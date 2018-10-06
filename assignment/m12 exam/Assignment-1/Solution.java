
class Info {
	String Name;
	String date;
	String day;
	String month;
	String year;
	int subject1;
	int subject2;
	int subject3;
	int total;
	String category;
	Info(String name,  int sub1, int sub2, int sub3, int tot, String cat,
		String day1, String month1, String year1, String date) {
		this.Name = name;
		this.date = date;
		this.subject1 = sub1;
		this.subject2 = sub2;
		this.subject3 = sub3;
		this.total =  tot;
		this.category = cat;


	}
	 String getDate() {
	   String[] d = this.date.split("-");
		this.day = Integer.parseInt(d[0]);
		this.month = Integer.parseInt(d[1]);
		this.year = Integer.parseInt(d[2]);
		return this.date;
	}

	String getName() {
		return this.name;

	}
	
	int getSubject1() {
		return this.subject1;
	}
	int getSubject2() {
		return this.subject2;
	}
	int getSubject3() {
		return this.subject3;
	}
	int getTotal() {
		total = (subject1+subject2+subject3)/3;
		return this.total;
	}
	String getCategory(String gen, String bc, String sc, String st ){
           
		return this.category;
	}
	boolean less(Info that) {
		if (this.total < that.total) {
			return true;
		}
		if (this.total > that.total) {
			return false;
		} else {
             
		}

	}
	class Allotment {
		
	}
	class Solution {
		Solution() {

		}
	public static void main(String[] args) {
        Allotment studentobj = new Allotment();
        Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
            data = scan.nextLine().split(",");
            studentobj.addStudents(new Info((data[0]), (data[1]),
                (data[2]), (data[3]), (data[4]), (data[5]), (data[6])));
        }
	}
}



     
