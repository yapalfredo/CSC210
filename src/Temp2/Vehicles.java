/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temp2;

/**
 *
 * @author al
 */
public class Vehicles 
{
    protected String brand, model, year;
    protected int price;
    protected String vehicleType;
    
    public Vehicles()
    {
        
    }

    public Vehicles(String vehicleType) 
    {
        this.vehicleType = vehicleType;
    }
    
    public void MovesFast()
    {
        System.out.println("This is in the " + this.getClass().getSimpleName() + " class");
        System.out.println("Yes this moves fast");
    }
    
    public void ConsumesFuel()
    {
        System.out.println("This is in the " + this.getClass().getSimpleName() + " class");
        System.out.println("Yes this consumes a lot fuel");
    }
    
    public void MadeInWhere()
    {
        System.out.println("This is in the " + this.getClass().getSimpleName() + " class");
        System.out.println("This is made in USA");
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

    public void setPrice(int price) {
        this.price = price;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
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

    public int getPrice() {
        return price;
    }

    public String getVehicleType() {
        return vehicleType;
    }
    
    
}
