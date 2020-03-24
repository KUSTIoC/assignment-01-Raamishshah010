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
public class Person
{
    private String name;
    private String cnic;
    private String address;

    public Person(String name, String cnic, String address) {
        this.name = name;
        this.cnic = cnic;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getCnic() {
        return cnic;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", cnic=" + cnic + ", address=" + address + '}';
    }
    
}
