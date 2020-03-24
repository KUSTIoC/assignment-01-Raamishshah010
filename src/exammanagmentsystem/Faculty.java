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
public class Faculty extends Person
{

    public Faculty(String name, String cnic, String address) {
        super(name, cnic, address);
    }
    @Override
    public String toString() {
        return String.format("%s",super.toString());
    }
    
    
}
