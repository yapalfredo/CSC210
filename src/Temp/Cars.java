/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temp;

/**
 *
 * @author al
 */
public class Cars 
{
    private String brand;
    private String model;
    private String year;
    private String driveTrain;
    private int price;
    
    public Cars()
    {
        System.out.println("This is the Cars class");
    }
    
    public void MovesFast()
    {
        System.out.println("Yes this moves fast");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setDriveTrain(String driveTrain) {
        this.driveTrain = driveTrain;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getDriveTrain() {
        return driveTrain;
    }

    public int getPrice() {
        return price;
    }
}
