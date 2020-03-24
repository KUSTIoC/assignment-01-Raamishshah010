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
public class Paper
{
    private Student student;
    private String paperTitle;
    private String paperId;
    private Course course;
    private DateTime dateTime;
    private String examType;
    private Faculty invigilator;
    private String location;
    private int noStudentsPaper;
    private boolean isCollected;

    public Paper(String paperTitle, String paperId, Student student,Course course, DateTime dateTime, String examType, Faculty invigilator, String location, int noStudentsPaper) {
        this.paperTitle = paperTitle;
        this.student = student;
        this.paperId = paperId;
        this.course = course;
        this.dateTime = dateTime;
        this.examType = examType;
        this.invigilator = invigilator;
        this.location = location;
        this.noStudentsPaper = noStudentsPaper;
        this.isCollected =false;
    }

    public void setPaperTitle(String paperTitle) {
        this.paperTitle = paperTitle;
    }

    public void setPaperId(String paperId) {
        this.paperId = paperId;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public void setInvigilator(Faculty invigilator) {
        this.invigilator = invigilator;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNoStudentsPaper(int noStudentsPaper) {
        this.noStudentsPaper = noStudentsPaper;
    }

    public void setIsCollected(boolean isCollected) {
        this.isCollected = isCollected;
    }

    public String getPaperTitle() {
        return paperTitle;
    }

    public String getPaperId() {
        return paperId;
    }

    public Course getCourse() {
        return course;
    }

    public DateTime getDateTime() {
        return dateTime;
    }

    public String getExamType() {
        return examType;
    }

    public Faculty getInvigilator() {
        return invigilator;
    }

    public String getLocation() {
        return location;
    }

    public int getNoStudentsPaper() {
        return noStudentsPaper;
    }

    public boolean isIsCollected() {
        return isCollected;
    }

  
    @Override
    public String toString() {
        return String.format("Paper title : %s %n Paper Id : %s%n Student :%s%n Course : %s%n Date and Time : %s%n Exam type : %s%n Invigilator : %s%n Location :%s%n No of Students :%d%n is collected : %b", this.paperTitle,this.paperId,this.student,this.course,this.dateTime,this.examType,this.invigilator,this.location,this.noStudentsPaper,this.isCollected);
    }
    
    
    
}
