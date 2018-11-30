/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temp4;


/**
 *
 * @author al
 */
public class Lamborghini extends Vehicles implements MovesFast, ConsumesFuel, MadeInWhere{
    
    public Lamborghini(String vehicleType)
    {
        super(vehicleType);
        this.setBrand("Lamborgini");
    }
    
    @Override
    public void MovesFast()
    {
        System.out.println("This is in the " + this.getClass().getSimpleName() + " class");
        System.out.println("Yes this moves really fast");
    }
    @Override
    public void ConsumesFuel()
    {
        System.out.println("Oh Yeah this consumes a lot of fuel");
    }
    @Override
    public void MadeInWhere()
    {
        System.out.println("This is made in Italy");
    }
    
}
