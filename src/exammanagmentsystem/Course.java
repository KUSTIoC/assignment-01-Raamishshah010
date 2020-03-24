/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exammanagmentsystem;

/**
 *
 * @author Ramish
 */
public class Course
{
    private final String   courseName;
    private String courseCode;
    private String programName;
    private String semester;
    private String semOfferedIn;
    private Faculty incharge;

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public void setIncharge(Faculty incharge) {
        this.incharge = incharge;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setSemOfferedIn(String semOfferedIn) {
        this.semOfferedIn = semOfferedIn;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getProgramName() {
        return programName;
    }

    public String getSemester() {
        return semester;
    }

    public String getSemOfferedIn() {
        return semOfferedIn;
    }

    public Faculty getIncharge() {
        return incharge;
    }

    @Override
    public String toString() {
        return "Course{" + "courseName=" + courseName + ", courseCode=" + courseCode + ", programName=" + programName + ", semester=" + semester + ", semOfferedIn=" + semOfferedIn + ", incharge=" + incharge + '}';
    }

    
    
}
