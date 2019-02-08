class Student implements Comparable<Student> {
	Student() {

	}
	private String name;
	private int roll;
	private double marks;
	public Student(final String name, final double marks, final int roll) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return this.name;
	}
	public int getRoll() {
		return this.roll;
	}
	public double getMarks() {
		return this.marks;
	}
	public String toString() {
		return this.roll + "," + this.name + "," + this.marks;	
	}
	public int compareTo(Student other) {
		// if (this.name.compareTo(other.name) < 0) {
		// 		return 1;
		// }
		// if (this.name.compareTo(other.name) > 0) {
		// 		return 0;
		// }
		if (this.marks > other.marks) {
			return 1;
		} else if (this.marks < other.marks) {
			return -1;			
			}
			else if (this.marks == other.marks) {
				if (this.name.compareTo(other.name) > 0) {
					return 1;
				}
				if (this.name.compareTo(other.name) < 0) {
					return -1;
				}
				if(this.name.compareTo(other.name) == 0)
				{if (this.roll > other.roll) {
 					return 1;
 				} else if (this.roll < other.roll) {
 					return -1;
 				}} 
			}
		
		return 0;
       }
}