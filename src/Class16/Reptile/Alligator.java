/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class16.Reptile;

/**
 *
 * @author al
 */
public class Alligator extends Reptile{
    
    public Alligator()
    {
        
    }
    
    @Override
    public void eat(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I'm a carnivorous");
        System.out.println("I choke slam my prey");
    }
}
