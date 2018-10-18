import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
class Student implements Comparable<Student> {
    /**
     * student name variable.
     **/
    private String studentName;
    /**
     * date variable.
     **/
    private Date dob;
    /**
     * for marks1 variable.
     **/
    private int marks1;
    /**
     * for marks2 variable.
     **/
    private int marks2;
    /**
     * for mark3 variable.
     **/
    private int marks3;
    /**
     * for total marks variable.
     **/
    private int totalmarks;
    /**
     * for reservation variable.
     **/
    private String reservationcategory;
    /**
     * Seats allocated variable.
     **/
    private boolean alloted;
    /**
     * retursc true, if the student is already alloted,
     * otherwise false.
     *
     * @return true if alloted, otherwise false.
     **/
    public boolean getAlloted() {
        return alloted;
    }

    /**
     * Changes the alloted status to true once the allotment is done.
     *
     * @param      allotment  should be either true or false.
     **/
    public void setAlloted(final boolean allotment) {
        this.alloted = allotment;
    }

    /**
     * Gets the data of birth.
     * @return date of birth.
     **/
    public Date getDob() {
        return dob;
    }

    /**
     * sets the student's date of birth.
     *
     * @param      dateOfBirth   date of birth.
     **/
    public void setDob(final Date dateOfBirth) {
        this.dob = dateOfBirth;
    }

    /**
     * gets the date of birth.
     *
     * @return     the student's date of birth.
     **/
    public String getReservationcategory() {
        return reservationcategory;
    }

    /**
     * Sets the student's reservation category.
     *
     * @param      reserve    reservation.
     **/
    public void setReservationcategory(final String reserve) {
        this.reservationcategory = reserve;
    }

    /**
     * gets the total marks.
     * @return returns the total marks of the student.
     **/
    public int getTotalmarks() {
        return totalmarks;
    }

    /**
     * sets the student's total marks.
     *
     * @param      m     totalmarks.
     **/
    public void setTotalmarks(final int m) {
        this.totalmarks = m;
    }

    /**
     * Constructs the object based on the parameters.
     *
     * @param      Name      Student Name.
     * @param      dateOfBirth  Date of Birth.
     * @param      m1          Marks in first subject.
     * @param      m2          Marks in second subject.
     * @param      m3          Marks in third subject.
     * @param      total        The total.
     * @param      res          The resource.
     **/
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
     * @param      m3    mark3.
     **/
    public void setMarks3(final int m3) {
        this.marks3 = m3;
    }

    /**
     * Gets the marks in subject 2.
     *
     * @return     marks in subject 2.
     **/
    public int getMarks2() {
        return marks2;
    }

    /**
     * Sets marks in subject 2.
     *
     * @param      m2     set marks2.
     **/
    public void setMarks2(final int m2) {
        this.marks2 = m2;
    }

    /**
     * Gets the marks in subject 1.
     * @return marks in subject 1.
     **/
    public int getMarks1() {
        return marks1;
    }
    /**
     * Sets the marks to subject 1.
     *
     * @param      m1  marks1.
     **/
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
     * @param      student  The student.
     */
    public void setStudentName(final String student) {
        this.studentName = student;
    }

    /**
     * Compares two objects of types stud.
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
     * Gets the String version of the stud.
     * @return String version of object.
     */
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(this.getStudentName() + ",");
        buffer.append(this.getTotalmarks() + ",");
        buffer.append(this.getReservationcategory());
        return buffer.toString();
    }
}

/**
 * This is a solution class.
 */
public final class Solution {
    /**
     * this is a default constructor.
     */
    private Solution() {

    }

    /**
     * Client program.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int vacancies = Integer.parseInt(scan.nextLine());
        int noCategory = Integer.parseInt(scan.nextLine());
        int noOfBC = Integer.parseInt(scan.nextLine());
        int noOfSC = Integer.parseInt(scan.nextLine());
        int noOfST = Integer.parseInt(scan.nextLine());

        Student[] stud = new Student[n];
        final int three = 3;
        final int four = 4;
        final int five = 5;
        final int six = 6;
        for (int k = 0; k < n; k++) {
            String[] tokens = scan.nextLine().split(",");
            stud[k] = new Student(
                tokens[0], tokens[1], Integer.parseInt(tokens[2]),
                Integer.parseInt(tokens[three]),
                Integer.parseInt(tokens[four]),
                Integer.parseInt(tokens[five]),
                tokens[six]);
        }

        Heap.sort(stud);
        print(stud);

        allotment(stud, vacancies, noCategory, noOfBC,
                  noOfSC, noOfST);
    }

    /**
     * prints the student details to the console.
     *
     * @param      stud  list.
     */
    public static void print(final Student[] stud) {
        for (Student student : stud) {
            System.out.println(student);
        }
        System.out.println();
    }

    /**
     * Alloting the seats to the stud based on merit.
     * @param stud  list of stud.
     * @param vacancies number of vacancies.
     * @param noCategory Un-reserved category.
     * @param noBC      Number of BC seats.
     * @param noSC      Number of SC seats.
     * @param noST      Number of ST seats.
     **/
    public static void allotment(final Student[] stud,
                                final int vacancies,
                                final int noCategory,
                                final int noBC,
                                final int noSC,
                                final int noST) {
        int v = vacancies;
        int category = noCategory;
        int bc = noBC;
        int sc = noSC;
        int st = noST;
        int i = 0;
        int k = 0;
        int n = stud.length;
        Student[] alloted = new Student[v];

        for (i = 0; i < n; i++) {
            if (v == 0) {
                break;
            }

            if (category > 0) {
                category--;
                stud[i].setAlloted(true);
                alloted[k++] = stud[i];
                v--;
            }

            if (bc > 0) {
                if (stud[i].getReservationcategory().equals("BC")
                    && !stud[i].getAlloted()) {
                    bc--;
                    stud[i].setAlloted(true);
                    alloted[k++] = stud[i];
                    v--;
                }
            }

            if (sc > 0) {
                if (stud[i].getReservationcategory().equals("SC")
                    && !stud[i].getAlloted()) {
                    sc--;
                    stud[i].setAlloted(true);
                    alloted[k++] = stud[i];
                    v--;
                }
            }

            if (st > 0) {
                if (stud[i].getReservationcategory().equals("ST")
                    && !stud[i].getAlloted()) {
                    st--;
                    stud[i].setAlloted(true);
                    alloted[k++] = stud[i];
                    v--;
                }
            }
        }

        for (i = 0; i < n; i++) {
            if (v > 0 && stud[i].getReservationcategory().equals("Open")
                && !stud[i].getAlloted()) {
                stud[i].setAlloted(true);
                alloted[k++] = stud[i];
                v--;
            }
        }

        Heap.sort(alloted);
        print(alloted);
    }
}

