/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class16.BigMammals;

/**
 *
 * @author al
 */
public class Whale extends BigMammals {
    public Whale()
    {
        
    }
    @Override
    public void makeNoise(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I make a waaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }
    @Override
    public void theWayImove(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I swim");
    }
    @Override
    public void eat(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I eat other fishes");
    }
}
