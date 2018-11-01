/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class16.Reptile;
import Class16.Animals;
/**
 *
 * @author al
 */
public class Reptile extends Animals {
    @Override
     public void makeNoise(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I hiss");
    }
     @Override
    public void theWayImove(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("It crawls and swims in water");
    }
    @Override
    public void eat(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I'm a carnivorous");
    }
    @Override
    public void reproduce(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I lay eggs");
    }
}
