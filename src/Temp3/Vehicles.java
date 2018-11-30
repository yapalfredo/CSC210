/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temp3;

import Temp2.*;

/**
 *
 * @author al
 */
public abstract class Vehicles 
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
    
    protected abstract void MovesFast();   
    protected abstract void ConsumesFuel();
    protected abstract void MadeInWhere();

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
