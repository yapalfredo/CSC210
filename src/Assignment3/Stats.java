/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import java.util.ArrayList;
import java.util.List;
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
    private ArrayList<Integer> intArrList = new ArrayList<Integer>();
    private ArrayList<Double> dblArrList = new ArrayList<Double>();
    
    //THESE TWO WILL BE USED BY STANDARD DEV
    private double dblSummation; 
    private int intSummation;
    //////////////////////////////////////////

    
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
    
    public ArrayList<Integer> getIntArrList() {
        return intArrList;
    }

    public ArrayList<Double> getDblArrList() {
        return dblArrList;
    }
    
    public double getDblSummation() {
        return dblSummation;
    }

    public int getIntSummation() {
        return intSummation;
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
    
    
    public void setIntArrList(int val) {
        this.intArrList.add(val);
    }

    public void setDblArrList(double val) {
        this.dblArrList.add(val);
    }

    public void setDblSummation(double dblSummation) {
        this.dblSummation += dblSummation;
    }

    public void setIntSummation(int intSummation) {
        this.intSummation += intSummation;
    }
    
    
//////////////////////////////////////////////////////////////////
    
    
    public Stats() 
    {
        // Constructor
        dblSummation = 0;
        intSummation = 0;
        
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
        setIntArrList(arr[index]);
        
        return getIntSum();
    }
    
    public  double Sum(double[] arr, int index)
    {
        setDblSum((double)arr[index]);
        setDblArrList((double)arr[index]);

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
    
    public  int StandardDeviation(int intSTD)
    {
        for (int i = 0; i < intArrList.size(); i++) {
          setIntSummation((int)Math.pow(intArrList.get(i) - getIntAvg(), 2));
        }
        
        setIntStdDev((int)Math.sqrt(getIntSummation() * ((double) 1 / (double)intArrList.size())));
       
        return getIntStdDev();
    }
    
    public  double StandardDeviation(double dblSTD)
    {
        for (int i = 0; i < dblArrList.size(); i++) { 
            setDblSummation(Math.pow(dblArrList.get(i) - getDblAvg(), 2));
        }
        
        setDblStdDev(Math.sqrt(getDblSummation() * ((double) 1 / (double) dblArrList.size())));
        
        return getDblStdDev();
    }
}
