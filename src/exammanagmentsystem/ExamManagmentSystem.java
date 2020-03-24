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
public class ExamManagmentSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
       DateTime dateTime = new DateTime("24/3/2020","10:59am");
       Faculty faculty= new Faculty("Sir Ali zeb", "140323213", "Kohat");
       Student student = new Student("CS120192071", "2nd", "Syed Raamish Shah", "1430188881169", "Kohat");
       Course  course = new Course("java","cs102");
       Paper paper = new Paper("java", "2",student, course, dateTime, "annual", faculty , "room 2", 10);
       
        System.out.println(paper);
       
       
    }
    
}
