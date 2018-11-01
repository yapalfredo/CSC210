/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class16;

/**
 *
 * @author lkhan
 */
public class Human extends Animals{
    
    private String size;
    
    public Human(String size){
        this.size = size;
    }
    @Override
    public void makeNoise(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I talk or shout or cry");
    }
    public void theWayImove(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I walk with my feet");
    }
    public void eat(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I eat with my mouth");
    }
    public void reproduce(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I reproduce the usual way");
    }
}
