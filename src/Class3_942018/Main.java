/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class3_942018;

import java.util.HashSet;

/**
 *
 * @author al
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Profile student1 = new Profile("Alfredo", "Yap",  "AYap", "Sophomore", "CSC", 13);
        
        
        Profile student2 = new Profile("Gabriel", "Chimbo", "gchimbo", "Fall2018", "CSC", 12);
        student2.setClassRank("Sophomore");
        student2.setCreditsThisSemester(5);
        
        Profile student3 = new Profile();
        student3.setfName("Brianna");
        student3.setlName("Neura");
        student3.setUserName("BNeura");
        student3.setSemester("Fall2018");
        student3.setMajor("MAT");
        student3.setClassRank("Sophomore");
        student3.setCreditsThisSemester(12);
        student3.setNumberOfCourses(4);
        
        System.out.println("Student 1's first name is: " + student1.getfName());
        System.out.println("Student 1's last name is: "+student1.getlName());
        System.out.println("Student 1's Username is: "+student1.getUserName());
        System.out.println("Student 1's Classrank is: "+student1.getClassRank());
        System.out.println("Student 1's Major is: "+ student1.getMajor());
        System.out.println("Student 1's Credits is: "+student1.getCreditsThisSemester());
        
        System.out.println("");
        
        System.out.println("Student 2's first name is: " + student2.getfName());
        System.out.println("Student 2's last name is: "+student2.getlName());
        System.out.println("Student 2's Username is: "+student2.getUserName());
        System.out.println("Student 2's Classrank is: "+student2.getClassRank());
        System.out.println("Student 2's Major is: "+ student2.getMajor());
        System.out.println("Student 2's Credits is: "+student2.getCreditsThisSemester());
        
        System.out.println("");
        
        System.out.println("Student 3's first name is: " + student3.getfName());
        System.out.println("Student 3's last name is: "+student3.getlName());
        System.out.println("Student 3's Username is: "+student3.getUserName());
        System.out.println("Student 3's Classrank is: "+student3.getClassRank());
        System.out.println("Student 3's Major is: "+ student3.getMajor());
        System.out.println("Student 3's Credits is: "+student3.getCreditsThisSemester());
        
        
    }
    
}
