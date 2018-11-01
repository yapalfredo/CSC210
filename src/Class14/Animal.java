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
public class Animal {
    
    private byte numberOfLegs;
    private byte numberOfEyes;
    private byte numberEars;
    
    public Animal(){
        System.out.println("I am in the animal class");
    }
    public void makeNoise(){
        System.out.println("Make a generic noise");
    }

    public void setNumberOfLegs(byte numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void setNumberOfEyes(byte numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }

    public void setNumberEars(byte numberEars) {
        this.numberEars = numberEars;
    }

    public byte getNumberOfLegs() {
        return numberOfLegs;
    }

    public byte getNumberOfEyes() {
        return numberOfEyes;
    }

    public byte getNumberEars() {
        return numberEars;
    }
    
    
}
