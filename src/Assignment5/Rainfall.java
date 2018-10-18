/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

/**
 *
 * @author al
 */
public class Rainfall {

    
   final private String[] month = {"January" , "February", "March" , "April",
                              "May", "June", "July", "August", "September",
                              "October", "November", "December"};
   final private int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
   
   private double[] monthRainfall = new double[12];
   
   private int totalRainfall;
   
   public Rainfall()
   {
       setTotalRainfall();
   }
    public int getTotalRainfall() {
        return totalRainfall;
    }
    
    public void setTotalRainfall() {
        this.totalRainfall = 0;
    }

    public void setTotalRainfall(int totalRainfall) {
        this.totalRainfall += totalRainfall;
    }
   
    public String getMonth(int index) 
    {
        return month[index];
    }   

    public void setMonthRainfall(int index, int monthRainfall) {
        this.monthRainfall[index] = monthRainfall;
    }
    
    public int totalRainfall()
    {              
        for (int i = 0; i < monthRainfall.length; i++) {
            setTotalRainfall((int)monthRainfall[i]);
        }        
        return getTotalRainfall();
    }
    
    public double averageRainfallForTheYear()
    {
        return ((double)getTotalRainfall() / (double)12);   
    }
    
    public void monthMostLeastRains()
    {
        short max = 0;
        short mostMonth=0;
        
        short min = 32767;
        short leastMonth=0;
        
        for (int i = 0; i < monthRainfall.length; i++) {
            for (int j = 1; j < monthRainfall.length; j++) {
                
                if (monthRainfall[i] > monthRainfall[j] && monthRainfall[i] > max ) {
                    max = (short)monthRainfall[i];
                    mostMonth = (short)i;
                }                
                if (monthRainfall[i] < monthRainfall[j] && monthRainfall[i] < min ) {
                    min = (short)monthRainfall[i];
                    leastMonth = (short)i;
                }
            }
        }
        
        System.out.println("");
        System.out.println("The month with the most rain is: " + month[mostMonth]);
        System.out.println("Total rain for that month is: " + (int)monthRainfall[mostMonth]);
        System.out.printf("Average rain for that month is: %.2f" ,(monthRainfall[mostMonth]) / monthDays[mostMonth]);
        System.out.println("");
        
        System.out.println("");
        System.out.println("The month with the least rain is: " + month[leastMonth]);
        System.out.println("Total rain for that month is: " + (int)monthRainfall[leastMonth]);
        System.out.printf("Average rain for that month is: %.2f" ,(monthRainfall[leastMonth]) / monthDays[leastMonth]);
        System.out.println("");
    }

}
