/**
 * student class which contains student details.
 */
class Student {
    /**
     * name of the student.
     */
    
    private String name;
    // String rollNumber;
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
     * @param studentName name of student.
     * @param total total marks.
     */
    Student( final String studentName, final Double totalMarks) {
        this.name = studentName;
        
        this.marks = totalMarks;
    }

}