/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class16.MythicalCreatures;

import Class16.Animals;

/**
 *
 * @author lkhan
 */
public class MythicalCreatures extends Animals{
 
    
    @Override
    public void theWayImove(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I fly and/or walk");
    }    
    
}
