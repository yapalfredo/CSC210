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
        
        
        
        
    }
    
}
