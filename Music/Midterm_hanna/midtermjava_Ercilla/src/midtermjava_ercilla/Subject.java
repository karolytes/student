/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermjava_ercilla;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 *
 * @author student
 */
    public class Subject {
     private HashMap<Integer, Student> student = new HashMap<Integer, Student>();
     private ArrayList<Student> stud = new ArrayList<>();
    private   LinkedList<Student> linkedstud = new LinkedList<>();
     LinkedHashSet<Student> linkhashstud = new LinkedHashSet<>();

    public Subject() {
    }

    public HashMap<Integer, Student> getStudent() {
        return student;
    }

    public void setStudent(HashMap<Integer, Student> student) {
        this.student = student;
    }

    public ArrayList<Student> getStud() {
        return stud;
    }

    public void setStud(ArrayList<Student> stud) {
        this.stud = stud;
    }

    public LinkedList<Student> getLinkedstud() {
        return linkedstud;
    }

    public void setLinkedstud(LinkedList<Student> linkedstud) {
        this.linkedstud = linkedstud;
    }

       
     
     public void addStudent(HashMap<Integer,Student> s1){
//         itr = linkhashstud.iterator();
//        System.out.println("=====Class Linked Redcord====");
//        int index = 0;
//        while(itr.hasNext()){
//            Student temp = (Student)itr.next();
//            if(linkedstud.isEmpty()){
//                linkedstud.add(temp);
//                
//            }
//            else{
                 linkedstud.sort((Student a, Student b) -> a.getSurname().compareTo(b.getSurname()));
             this.addStudent(s1);
        }
     
        }
       
