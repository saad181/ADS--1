
class Student implements Comparable<Student> {
    /**
     * student name variable.
     */
    private String studentName;
    /**
     * date variable.
     */
    private Date dob;
    /**
     * for marks1 variable.
     */
    private int marks1;
    /**
     * for marks2 variable.
     */
    private int marks2;
    /**
     * for mark3 variable.
     */
    private int marks3;
    /**
     * for total marks variable.
     */
    private int totalmarks;
    /**
     * for reservation variable.
     */
    private String reservationcategory;
    /**
     * Seats allocated variable.
     */
    private boolean alloted;
    /**
     * returns true, if the student is already alloted,
     * otherwise false.
     *
     * @return true if alloted, otherwise false.
     */
    public boolean getAlloted() {
        return alloted;
    }

    /**
     * Changes the alloted status to true once the allotment is done.
     *
     * @param      allotment  should be either true or false.
     */
    public void setAlloted(final boolean allotment) {
        this.alloted = allotment;
    }

    /**
     * Gets the data of birth.
     * @return date of birth.
     */
    public Date getDob() {
        return dob;
    }

    /**
     * sets the student's date of birth.
     *
     * @param      b     [description]
     */
    public void setDob(final Date dateOfBirth) {
        this.dob = dateOfBirth;
    }

    /**
     * gets the date of birth.
     *
     * @return     the student's date of birth.
     */
    public String getReservationcategory() {
        return reservationcategory;
    }

    /**
     * Sets the student's reservation category.
     *
     * @param      reserve    { parameter_description }
     */
    public void setReservationcategory(final String reserve) {
        this.reservationcategory = reserve;
    }

    /**
     * gets the total marks.
     * @return returns the total marks of the student.
     */
    public int getTotalmarks() {
        return totalmarks;
    }

    /**
     * sets the student's total marks.
     *
     * @param      m     { parameter_description }
     */
    public void setTotalmarks(final int m) {
        this.totalmarks = m;
    }

    /**
     * Constructs the object based on the parameters.
     *
     * @param      Name      Student Name
     * @param      dateOfBirth  Date of Birth
     * @param      m1          Marks in first subject.
     * @param      m2          Marks in second subject.
     * @param      m3          Marks in third subject.
     * @param      total        The total
     * @param      res          The resource
     */
    Student(final String stuName, final String dateOfBirth,
                   final int m1, final int m2, final int m3, final int total,
                   final String reserve) {
        this.studentName = stuName;

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            this.dob = sdf.parse(dateOfBirth);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
        this.totalmarks = total;
        this.reservationcategory = reserve;
        this.alloted = false;
    }

    /**
     * Gets the marks in subject 3.
     *
     * @return     marks3 Marks in subject 3.
     */
    public int getMarks3() {
        return marks3;
    }

    /**
     * Sets the marks3 to the 3rd subject.
     *
     * @param      m     { parameter_description }
     */
    public void setMarks3(final int m3) {
        this.marks3 = m3;
    }

    /**
     * Gets the marks in subject 2.
     *
     * @return     marks in subject 2.
     */
    public int getMarks2() {
        return marks2;
    }

    /**
     * Sets marks in subject 2.
     *
     * @param      m     { parameter_description }
     */
    public void setMarks2(final int m2) {
        this.marks2 = m2;
    }

    /**
     * Gets the marks in subject 1.
     * @return marks in subject 1.
     */
    public int getMarks1() {
        return marks1;
    }

    /**
     * Sets the marks to subject 1.
     *
     * @param      m     { parameter_description }
     */
    public void setMarks1(final int m1) {
        this.marks1 = m1;
    }

    /**
     * Gets the student name.
     * @return the student's name.
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * When required the student's name can be updated.
     *
     * @param      student  The student
     */
    public void setStudentName(final String student) {
        this.studentName = student;
    }

    /**
     * Compares two objects of types students.
     * @param  that second Student.
     * @return integer based on the requirements.
     */
    public int compareTo(final Student that) {
        if (this.getTotalmarks() > that.getTotalmarks()) {
            return -1;
        }
        if (this.getTotalmarks() < that.getTotalmarks()) {
            return 1;
        }
        if (this.getMarks3() > that.getMarks3()) {
            return -1;
        }
        if (this.getMarks3() < that.getMarks3()) {
            return 1;
        }
        if (this.getMarks2() > that.getMarks2()) {
            return -1;
        }
        if (this.getMarks2() < that.getMarks2()) {
            return 1;
        }
        if (this.getDob().compareTo(that.getDob()) < 0) {
            return 1;
        }
        if (this.getDob().compareTo(that.getDob()) > 0) {
            return -1;
        }
        return 0;
    }

    /**
     * Gets the String version of the Students.
     * @return String version of object.
     */
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(this.getStudentName() + ",");
        sb.append(this.getTotalmarks() + ",");
        sb.append(this.getReservationcategory());
        return sb.toString();
    }
}
