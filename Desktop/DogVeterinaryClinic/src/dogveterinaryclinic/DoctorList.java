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
public class DoctorList {
    private ArrayList<Doctor> doctor = new ArrayList<>();
    private ArrayList<Patient> patient = new ArrayList<>();

    public DoctorList() {
    }
    
    public void addDoctor(Doctor d){
        doctor.add(d);
        
    }
}
