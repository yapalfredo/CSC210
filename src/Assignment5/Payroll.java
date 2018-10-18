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
public class Payroll {
    
    private int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
    private int[] hours = new int[employeeId.length];
    private double[] payRate = new double[employeeId.length];
    private double[] wages = new double[employeeId.length];

    public Payroll() 
    {
        // Default Constructor
    }
    
    public void setHours(int index, int val)
    {
        hours[index] = val;
    }
    
    public void setPayRate(int index, double val)
    {
        payRate[index] = val;
    }
    
    public void setWages(int index)
    {
        wages[index] = hours[index] * payRate[index];
    }
    
    public int getEmpID(int index)
    {
        return employeeId[index];
    }
    
    public double getWages(int index)
    {
        return wages[index];
    }
    
}
