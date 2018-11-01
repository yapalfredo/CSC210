/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class16;

import java.util.HashSet;
import java.util.Set;
import Class16.MythicalCreatures.*;
import Class16.Felines.*;
/**
 *
 * @author lkhan
 */
public class Class16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Human human = new Human("large");        
        human.makeNoise();
        human.theWayImove();
        human.reproduce();
        human.eat();
        human.setEars(2);
        human.setEyes(2);
        human.setHands(2);
        human.setLegs(2);
        human.setNose(1);
        human.setMouth(1);
        human.setTail(0);
        
        Cat cat  = new Cat("small");
        cat.setEars(2);
        cat.setEyes(2);
        cat.setHands(0);
        cat.setLegs(4);
        cat.setNose(1);
        cat.setMouth(1);
        cat.setTail(0);     
        
        cat.makeNoise();
        cat.theWayImove();
        cat.eat();
        cat.reproduce();
        
        Tiger tiger = new Tiger("large");
        tiger.setEars(2);
        tiger.setEyes(2);
        tiger.setHands(0);
        tiger.setLegs(4);
        tiger.setNose(1);
        tiger.setMouth(1);
        tiger.setTail(0);     
        
        tiger.makeNoise();
        tiger.theWayImove();
        tiger.eat();
        tiger.reproduce();
        
        Dragon dragon = new Dragon("large");
        dragon.setEars(2);
        dragon.setEyes(2);
        dragon.setHands(2);
        dragon.setLegs(2);
        dragon.setNose(1);
        dragon.setMouth(1);
        dragon.setTail(1);  
        
        dragon.makeNoise();
        dragon.eat();
        dragon.reproduce();
        dragon.theWayImove();
        
        
    }
    
}
