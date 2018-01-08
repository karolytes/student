/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogveterinaryclinic;

import java.util.ArrayList;

/**
 *
 * @author student
 */
public class Doctor extends Person {
   
    private int prcNumber;
    

    public Doctor() {
    }

    public Doctor(int prcNumber, String firstName, String lastName, String birthDate, String Status, String gender) {
        super(firstName, lastName, birthDate, Status, gender);
        this.prcNumber = prcNumber;
    }

    public int getPrcNumber() {
        return prcNumber;
    }

    public void setPrcNumber(int prcNumber) {
        this.prcNumber = prcNumber;
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        return sb.toString();
    }


    
    
}
