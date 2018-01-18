/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermjava_ercilla;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author student
 */
public class Midtermjava_Ercilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      HashMap<Integer, Student> student = new HashMap<Integer, Student>();
      ArrayList<Student> stud = new ArrayList<>();
       LinkedList<Student> linkedstud = new LinkedList<>();
       LinkedHashSet<Student> linkhashstud = new LinkedHashSet<>();
      
      Student s1 = new Student(1620073, "Hanna Grace", "Ercilla");
      Student s2 = new Student(1620074, "Bryan", "Tecson");
      Student s3 = new Student(1620075, "Mico", "Legaspi");
      Student s4 = new Student(1620076, "Jay R", "Smith");
      Student s6 = new Student(1620077, "James", "Reid");
      Student s7 = new Student(1620078,"Randolf","Lapiña");
      
      stud.add(s1);
      stud.add(s2);
      stud.add(s3);
      stud.add(s4);
      stud.add(s6);
      
        student.put(1, s1);
     student.put(2, s2);
       student.put(3,s3 );
     student.put(4, s4);
     student.put(5,s6);
    
     
       Iterator itr = stud.iterator();
        System.out.println("***List of Students*****");
        while(itr.hasNext()){
            
            linkhashstud.add((Student)itr.next());
             linkedstud.sort((Student a, Student b) -> a.getSurname().compareTo(b.getSurname()));
        }
        
               
       for (Object sl:student.entrySet()){
       Map.Entry map = (Map.Entry)sl;
           System.out.println("Key :"+map.getKey()+"\nStudent's ID:"+map.getValue());
           linkedstud.sort((Student a, Student b) -> a.getSurname().compareTo(b.getSurname()));
       }
        }
    }

   
    

