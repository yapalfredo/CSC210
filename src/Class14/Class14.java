/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class14;

/**
 *
 * @author lkhan
 */
public class Class14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Homework.Question3();
        Homework.Question4();
        Homework.Question6And7();
        
//        Rainfall rainfall = new Rainfall();
//        rainfall.setRainfalls();
//        rainfall.averageRainFall();
//        rainfall.leastRain();
//        rainfall.mostRain();
        
        Dog dog = new Dog();
        
        dog.makeNoise();
        dog.setNumberEars((byte)2);
        dog.setNumberOfEyes((byte)2);
        dog.setNumberOfLegs((byte)4);
        
        System.out.println("The following info is for dogs");
        System.out.println("Ears: "+dog.getNumberEars());
        System.out.println("Eyes: "+dog.getNumberOfEyes());
        System.out.println("Legs: "+dog.getNumberOfLegs());
        
        System.out.println("The following info is for a chicken");
        Chicken chicken = new Chicken();
        chicken.makeNoise();
        chicken.setNumberEars((byte)2);
        chicken.setNumberOfLegs((byte)3);
        chicken.setNumberOfEyes((byte)1);
        
        System.out.println("Ears: "+ chicken.getNumberEars());
        System.out.println("Eyes: "+chicken.getNumberOfEyes());
        System.out.println("Legs: "+chicken.getNumberOfLegs());
       
    }
    
}
