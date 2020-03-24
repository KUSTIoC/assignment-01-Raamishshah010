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
public class Student extends Person
{
    private String regNo;
    private String sem;

    public Student(String regNo, String sem, String name, String cnic, String address) {
        super(name, cnic, address);
        this.regNo = regNo;
        this.sem = sem;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public void setSem(String sem) {
        this.sem = sem;
    }

    public String getRegNo() {
        return regNo;
    }

    public String getSem() {
        return sem;
    }

    @Override
    public String toString() {
        return String.format("%sRegistration No : %s%nSemester : %s ",super.toString(),this.getRegNo(),this.getSem());
    }
    
}
