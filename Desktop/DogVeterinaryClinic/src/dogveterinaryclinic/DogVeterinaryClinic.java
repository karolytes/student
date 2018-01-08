/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogveterinaryclinic;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class DogVeterinaryClinic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Doctor doctor = new Doctor(16200071, "Dr. Vicky", "Belo", "11/2/1940", "Married", "Female");
        Doctor doctor1 = new Doctor(16200072, "Dr. Hyden", "Kho", "11/26/1970", "Married", "male");
       Doctor doctor2 = new Doctor(16200073, "Dr. Enrique", "Gil", "11/26/1995", "Single and Highly available", "male");
        PatientList p = new PatientList();
        DoctorList d = new DoctorList();
        d.addDoctor(doctor);
        d.addDoctor(doctor1);
        d.addDoctor(doctor2);

        Animal dog = new Dog("Dog", "Jumbo", "Poodle");
        Person person = new Person("Hanna Grace", "Ercilla", "November 26, 1998", "In a relationship", "Female");
        Patient patient = new Patient("Bernard", dog, person);
      

        p.addPatient(patient);
        
        
        
        //doctor.toString();

        Animal animal1 = new Cat("Cat", "Maniki", "Dragon Li");
        Person person1 = new Person("Lee Min", "Hoo", "February 14, 1995", "Married to me", "Male");
        Patient patient1 = new Patient("maniki", animal1, person1);

        p.addPatient(patient1);
       

        Animal animal2 = new Dog("Dog", "Gracia", "Parrot");
        Person person2 = new Person("Hae Joon", "Jae", "February 30, 1995", "In a relationship with Hanna Grace", "Male");
        Patient patient2 = new Patient("Gracia", animal2, person2);

        p.addPatient(patient2);

       // p.displayListOf("Dog");
        //  System.out.println(p);
        PatientRecordList recordList = new PatientRecordList();

        recordList.addRecord(new PatientRecord(p.getPatient().get(0), new Date(), doctor, "brokenhearted"));
        recordList.addRecord(new PatientRecord(p.getPatient().get(1), new Date(), doctor1, "Kigwahon"));
          recordList.addRecord(new PatientRecord(p.getPatient().get(2), new Date(), doctor2, "Kagiron"));
          
       // System.out.println(recordList);
    
    Scanner input = new Scanner(System.in);
   
            switch(input.nextInt()){
            
            case 1: System.out.println(d.getClass());;break;
            case 2:System.out.println(patient);break;
            case 3: System.out.println(recordList);break; 
            default: System.out.println("Nothing to display");break;
        
        }


        }


    }
