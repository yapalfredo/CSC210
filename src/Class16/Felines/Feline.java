/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class16.Felines;
import Class16.Animals;
/**
 *
 * @author lkhan
 */
public class Feline extends Animals{
    
    @Override
    public void makeNoise(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I roar");
    } 
    @Override
    public void theWayImove(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I walk on "+this.getLegs()+" legs");
    }
    @Override
    public void eat(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I am a carnivous");
    }
    @Override
    public void reproduce(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I don't reproduce like all other mamals");
    }
    
}
