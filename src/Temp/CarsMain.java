/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temp;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author al
 */
public class CarsMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Honda h1 = new Honda();
        h1.MovesFast();
        
        h1.setDriveTrain("Four Wheel Drive");
        h1.setModel("CRV");
        h1.setYear("2019");
        h1.setPrice(25000);
        
        System.out.println("Brand: " + h1.getBrand());
        System.out.println("Model: " + h1.getModel());
        System.out.println("Year: "+h1.getYear());
        System.out.println("Price: "+h1.getPrice());
        
        System.out.println("");
        
        Toyota t1 = new Toyota();
        t1.MovesFast();
        
        t1.setDriveTrain("Front Real Drive");
        t1.setModel("Supra");
        t1.setYear("2019");
        t1.setPrice(40000);
        
        System.out.println("Brand: " + t1.getBrand());
        System.out.println("Model: " + t1.getModel());
        System.out.println("Year: "+t1.getYear());
        System.out.println("Price: "+t1.getPrice());
        
    }
    
}
