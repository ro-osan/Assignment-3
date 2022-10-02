package task2;

import java.util.Comparator;

public class Student implements Comparator<Student> {

    /**
     * @Author :
     * @Date : 27 Aug 2022
     *
     * """
     * This is Student model class,
     * this class stores all the data related to student.
     * """
     *
     */
    private String UnitName;
    private String StudentId;
    private String lastName;
    private String firstName;
    private Double a1;
    private Double a2;
    private Double a3;

    private Double totalMarks;

    public String getUnitName() {
        return UnitName;
    }

    public void setUnitName(String unitName) {
        UnitName = unitName;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Double getA1() {
        return a1;
    }

    public void setA1(Double a1) {
        this.a1 = a1;
    }

    public Double getA2() {
        return a2;
    }

    public void setA2(Double a2) {
        this.a2 = a2;
    }

    public Double getA3() {
        return a3;
    }

    public void setA3(Double a3) {
        this.a3 = a3;
    }

    public Double getTotalMarks() {
        return totalMarks;
    }


    public Student(String unitName, String studentId, String lastName, String firstName, Double a1, Double a2, Double a3) {
        UnitName = unitName;
        StudentId = studentId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.totalMarks = a1 + a2 + a3;
    }

    public Student() {

    }


    @Override
    public int compare(Student o1, Student o2) {
        if ((o1.totalMarks - o2.totalMarks) < 0) {
            return -1;
        } else if (o1.totalMarks == o2.totalMarks) {
            return 0;
        } else {
            return 1;
        }
    }


}
