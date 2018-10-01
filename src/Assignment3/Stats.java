/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import java.util.Set;

/**
 *
 * @author al
 */
public class Stats {

    private  int intSum;
    private  double dblSum;
    private  int intAvg;
    private  double dblAvg;
    private  int intStdDev;
    private  double dblStdDev;

    
    
    // Getters (Accessors)
    public  int getIntSum() {
        return intSum;
    }

    public  double getDblSum() {
        return dblSum;
    }

    public  int getIntAvg() {
        return intAvg;
    }

    public  double getDblAvg() {
        return dblAvg;
    }

    public  int getIntStdDev() {
        return intStdDev;
    }

    public  double getDblStdDev() {
        return dblStdDev;
    }
///////////////////////////////////////////////////////////////

    // Setters (Mutators)
    public  void setIntSum(int intSum) {
        this.intSum += intSum;
    }

    public  void setDblSum(double dblSum) {
        this.dblSum += dblSum;
    }

    public  void setIntAvg(int intAvg) {
        this.intAvg = intAvg;
    }

    public  void setDblAvg(double dblAvg) {
        this.dblAvg = dblAvg;
    }

    public  void setIntStdDev(int intStdDev) {
        this.intStdDev = intStdDev;
    }

    public  void setDblStdDev(double dblStdDev) {
        this.dblStdDev = dblStdDev;
    }
    
//////////////////////////////////////////////////////////////////
    
    
    public Stats() 
    {
        // Constructor
        
        intAvg = 0;
        dblAvg = 0;
        
        intSum = 0;
        dblSum = 0;
        
        intStdDev = 0;
        dblStdDev = 0;
    }
    
    public  int Sum(int[] arr, int index)
    {               
        setIntSum(arr[index]);
        
        return getIntSum();
    }
    
    public  double Sum(double[] arr, int index)
    {
        setDblSum(arr[index]);

        return getDblSum();
    }
    
    public int Average(int SIZE)
    {   
        setIntAvg(getIntSum()/SIZE);
       
        return getIntAvg();
    }
    
    public double Average(double SIZE)
    {
        setDblAvg(getDblSum() / SIZE);
        
        return getDblAvg();
    }
    
    public  int StandardDeviation(int[] arr, int SIZE)
    {
        return 0;
    }
    
    public  double StandardDeviation(double[] arr, int SIZE)
    {
        return 0;
    }
}
