/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogveterinaryclinic;

/**
 *
 * @author student
 */
public class Person {
    private String firstName;
    private String lastName;
    private String birthDate;
    private String Status;
    private String gender;
    
    public Person(){
        
    }

    public Person(String firstName, String lastName, String birthDate, String Status, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.Status = Status;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();

      return "\nOwner            :" +this.firstName + " "+this.lastName 
             + "\nGender        :" + this.gender
             + "\nBirthdate     :" + this.birthDate 
             + "\nStatus        :" + this.Status;
    }
}