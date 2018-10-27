/**
 * student class that
 * contains student details.
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
     * @param studentName [description]
     * @param total [description]
     */
    Student(final String studentName, final Double total) {
        this.name = studentName;
        this.marks = total;
    }

}