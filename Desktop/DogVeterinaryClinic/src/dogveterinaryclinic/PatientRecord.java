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
public class PatientRecord {

    private Patient patient;
    private Date dateReleased;
    private Doctor doctor;
    private String disease;

    public PatientRecord() {
    }

    public PatientRecord(Patient patient, Date dateReleased, Doctor doctor, String disease) {
        this.patient = patient;
        this.dateReleased = dateReleased;
        this.doctor = doctor;
        this.disease = disease;
    }

    public Date getDateReleased() {
        return dateReleased;
    }

    public void setDateReleased(Date dateReleased) {
        this.dateReleased = dateReleased;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    
   
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(patient.toString()+"\n");
        sb.append("Illness : " + disease+"\n");
        sb.append("Doctor :" + doctor.getFirstName() + " " + doctor.getLastName()+"\n");
        sb.append("Date Released :" + dateReleased+"\n");
        return sb.toString();
    }

}
