/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogveterinaryclinic;

import java.util.Date;

/**
 *
 * @author student
 */
public class Patient {
    private String name;
    private Animal type;
    private Person owner;
    private Date admitDate = new Date();
    private Patienttype patienttype;

    public Patient() {
    }

    public Patient(String name, Animal type, Person owner) {
        this.name = name;
        this.type = type;
        this.owner = owner;
       
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal getType() {
        return type;
    }

    public void setType(Animal type) {
        this.type = type;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Date getAdmitDate() {
        return admitDate;
    }

    public void setAdmitDate(Date admitDate) {
        this.admitDate = admitDate;
    }

    public Patienttype getPatienttype() {
        return patienttype;
    }

    public void setPatienttype(Patienttype patienttype) {
        this.patienttype = patienttype;
    }
   
    
  

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

       sb.append(String.format("%20s\n\nPet Name: %-20s  \nDate Admitted:%-20s \n Pet Type:%20s \n",this.owner, this.name,this.admitDate,this.type));
 
                       
       return sb.toString();
    }
}