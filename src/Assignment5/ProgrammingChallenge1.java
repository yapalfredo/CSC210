/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;
import java.util.Scanner;

/**
 *
 * @author al
 */

public class ProgrammingChallenge1 {
    
    public static Rainfall rf = new Rainfall();
    public static Scanner kb = new Scanner(System.in);
    
    public static void main(String [] args)
    {
        Validation();
        TotalRainFall();
        AverageMonthlyRainFall();
        rf.monthMostLeastRains();
        
    }
 
    public static void Validation()
    {
        for (int i = 0; i < 12; i++) {
            int input;
            do{
                
                 System.out.print("Please enter the rainfall for the month of " + rf.getMonth(i) + " ");
                 input = kb.nextInt();
                 if (input<0) 
                 {
                     System.out.println("Please enter only positive numbers");
                 }
                 else
                 {
                     //System.out.println("good");
                     rf.setMonthRainfall(i, input);
                 }
            }while (input<0);
        }
    }
    
    public static void TotalRainFall()
    {
        System.out.println("");
        System.out.println("The total rainfall for the year is: " + rf.totalRainfall());
    }
    
    public static void AverageMonthlyRainFall()
    {        
        System.out.printf("The average rainfall for the year is: %.2f", rf.averageRainfallForTheYear());
        System.out.println("");
    }
    
}
 

