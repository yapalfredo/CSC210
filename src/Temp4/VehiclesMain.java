/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temp4;

import Temp3.*;
import Temp2.*;

/**
 *
 * @author al
 */
public class VehiclesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Lamborghini l1 = new Lamborghini("Car");
        l1.setModel("Murcielago");
        l1.setPrice(250000);
        l1.setYear("2010");
        l1.setVehicleType("Car");
        System.out.println("Vehicle Type: " + l1.getVehicleType());
        
        l1.MovesFast();
        l1.ConsumesFuel();
        l1.MadeInWhere();
        System.out.println("Brand: " + l1.getBrand());
        System.out.println("Model: " + l1.getModel());
        System.out.println("Year: " + l1.getYear());
        System.out.println("Price: " + l1.getPrice());
        
        System.out.println("");
        
        HarleyDavidson hd1 = new HarleyDavidson("Motorcycle");
        hd1.setModel("Street 500");
        hd1.setPrice(7000);
        hd1.setYear("2018");
        hd1.setVehicleType("Motorcycle");
        
        System.out.println("Vehicle Type: " + hd1.getVehicleType());
        hd1.MovesFast();
        hd1.ConsumesFuel();
        hd1.MadeInWhere();
        System.out.println("Brand: " + hd1.getBrand());
        System.out.println("Model: " + hd1.getModel());
        System.out.println("Year: " + hd1.getYear());
        System.out.println("Price: " + hd1.getPrice());
        
        
        
    }
    
}
