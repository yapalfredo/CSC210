/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3_2;


/**
 *
 * @author al
 */
public class Stats {

 
    
    
    public Stats() {
        // Constructor
        
    }
    
    public  int Sum(int[] arr)
    {               
        int result = 0;
        
        for (int i = 0; i < arr.length-1; i++) {
            result +=arr[i];
        }
        
        return result;
    }
    
    public  double Sum(double[] arr)
    {
       double result = 0.0;
       
        for (int i = 0; i < arr.length-1; i++) {
            result +=arr[i];
        }

        return result;
    }
    
    public int Average(int[] arr)
    {   
       return  (Sum(arr)/(arr.length-1));
    }
    
    public double Average(double[] arr)
    {
       return (Sum(arr)/(arr.length-1));
    }
    
    public  int StandardDeviation(int[] arr)
    {   
       
        
        int Summation = 0;
        
        for (int i = 0; i < arr.length-1; i++) {
            Summation += (int)Math.pow(arr[i] - Average(arr), 2);
        }
       
        return ((int)Math.sqrt(Summation * ((double) 1 / ((double)arr.length-1))));
    }
    
    public  double StandardDeviation(double[] arr)
    {
       
        
        double Summation = 0.0;
        
        for (int i = 0; i < arr.length-1; i++) {
            Summation += Math.pow(arr[i] - Average(arr), 2);
        }
       
        return (Math.sqrt(Summation* ((double) 1 / ((double)arr.length-1))));
    }
}
