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
public class PatientList {

    private ArrayList<Patient> patient = new ArrayList<>();
    private ArrayList<String> animalKind = new ArrayList();

    public PatientList() {
    }

    public ArrayList<Patient> getPatient() {
        return patient;
    }

    
    public void addPatient(Patient a){
        animalKind.add(a.getType().getAnimalType());
        patient.add(a);
    }
    public void displayPatient() {
        for (int i = 0; i < patient.size(); i++ ) {
            System.out.println(patient.get(i).toString());
        }
    }
    
    public void displayListOf(String kind){
        for(int i = 0; i < animalKind.size(); i++){
            if(kind.equals(animalKind.get(i))){
                System.out.println(patient.get(i));
            }
        }
    }

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
         for (int i = 0; i < patient.size(); i++ ) {
            sb.append(patient.get(i).toString());
        }
         
         return sb.toString();
    }
    
    
}
