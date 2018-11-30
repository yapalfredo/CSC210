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
public class HarleyDavidson extends Vehicles{
    
    public HarleyDavidson()
    {
        this.setBrand("Harley Davidson");
    }
    
    @Override
    public void MovesFast()
    {
        System.out.println("This is in the " + this.getClass().getSimpleName() + " class");
        System.out.println("Yes this moves alright");
    }
    @Override
    public void ConsumesFuel()
    {
        System.out.println("It's just okay. Not too much.");
    }
    
}
