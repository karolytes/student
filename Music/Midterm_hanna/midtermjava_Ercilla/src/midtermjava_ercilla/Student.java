/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermjava_ercilla;

/**
 *
 * @author student
 */
public class Student {
    private int ID;
    private String name;
    private String surname;

    public Student() {
    }

    public Student(int ID, String name, String surname) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    

    @Override
    public String toString() {
        return "Student:" + " " + this.ID + "\nName:" + this.name + "\nSurname:" + this.surname + "\n***********************************************" + "\n\n";
    }
    
    
}
