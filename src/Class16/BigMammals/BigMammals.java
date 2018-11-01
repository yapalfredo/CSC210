/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class16.BigMammals;
import Class16.Animals;
/**
 *
 * @author al
 */
public class BigMammals extends Animals{
    
    public BigMammals()
    {
        
    }
    
    @Override
    public void makeNoise(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I don't make any noise");
    }
    @Override
    public void theWayImove(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I don't move at all");
    }
    @Override
    public void eat(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I don't eat");
    }
    @Override
    public void reproduce(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I don't reproduce");
    }
}
