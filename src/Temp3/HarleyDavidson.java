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
public class HarleyDavidson extends Vehicles{
    
    protected HarleyDavidson()
    {
        this.setBrand("Harley Davidson");
    }
    
    @Override
    protected void MovesFast()
    {
        System.out.println("This is in the " + this.getClass().getSimpleName() + " class");
        System.out.println("Yes this moves alright");
    }
    @Override
    protected void ConsumesFuel()
    {
        System.out.println("It's just okay. Not too much.");
    }

    @Override
    protected void MadeInWhere() {
        System.out.println("Made in USA.");
    }
    
}
