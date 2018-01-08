/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogveterinaryclinic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class PatientRecordList {
    
    ArrayList<PatientRecord> patientList = new ArrayList();
    
    
    public PatientRecordList() {
    }

    public ArrayList<PatientRecord> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<PatientRecord> patientList) {
        this.patientList = patientList;
    }
    
    public void addRecord(PatientRecord newRecord){
        patientList.add(newRecord);
    }

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < patientList.size(); i++) {
            sb.append(patientList.get(i));
        }
        
        return sb.toString();
    }
    
       
    }
    
