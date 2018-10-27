/**
 * student class which contains student details.
 */
class Student {
    /**
     * name of the student.
     */
    private String name;
    /**
     *marks obtained by student.
     */
    private Double  marks;
    /**
     * returns student name.
     * time complexity is O(1).
     * @return studentName[description]
     */
    public String getName() {
        return name;
    }
    /**
     * returns total marks.
     * time complexity is O(1).
     * @return students marks.
     */
    public Double getMarks() {
        return marks;
    }
   /**
    * Constructs the object.
    *
    * @param      studentName  The student name
    * @param      totalMarks   The total marks
    */
    Student(final String studentName, final Double totalMarks) {
        this.name = studentName;
        this.marks = totalMarks;
    }
}