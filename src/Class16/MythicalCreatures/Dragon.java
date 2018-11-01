/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class16.MythicalCreatures;

/**
 *
 * @author lkhan
 */
public class Dragon extends MythicalCreatures{
   private String size;
   public Dragon(String size){
       this.size = size;
   }
   @Override
    public void makeNoise(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I roar");
    } 
    
   @Override
   public void reproduce(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I lay eggs");
    }
   @Override
    public void eat(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I am a carnivous");
    }
}
