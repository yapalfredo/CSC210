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
public class ProgrammingChallenge2 {
    public static Scanner kb = new Scanner(System.in);
    public static Payroll pr = new Payroll();
    
    public static void main(String[]args)
    {
        Validation();
        DisplayWages();
    }
    
    
    public static void Validation()
    {
         for (int i = 0; i < 7; i++) {
            int hours;
            double payrate;
            do{
                
                 System.out.print((i+1) + ". " + "Please enter the number of hours for employeeID " + pr.getEmpID(i) + ": ");
                 hours = kb.nextInt();
                 if (hours<0) 
                 {
                     System.out.println("Please enter only positive numbers");
                 }
                 else
                 {
                     pr.setHours(i, hours);
                     
                     do
                     {
                         System.out.print("     Please enter the pay rate for this employee: " );
                         payrate = kb.nextDouble();
                         if (payrate < 6) 
                         {
                              System.out.println("     Please enter pay rate greater than or equal to 6");
                         }
                         else
                         {
                             pr.setPayRate(i, payrate);
                             pr.setWages(i);
                         }
                     }while (payrate < 6);
                 }
            }while (hours<0);
        }
    }
    
    public static void DisplayWages()
    {
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < 7; i++) {
            System.out.println("EmployeeID " + pr.getEmpID(i) + "'s wage is: $ " + pr.getWages(i));
            
        }
    }
}
