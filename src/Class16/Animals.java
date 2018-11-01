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
public class Animals {
    protected int eyes,nose,mouth,legs,hands,ears,tail;
    protected String size;

    public Animals() {
    }
    public Animals(String size) {
        this.size = size;
    }
    
    public void makeNoise(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I don't make any noise");
    }
    public void theWayImove(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I don't move at all");
    }
    public void eat(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I don't eat");
    }
    public void reproduce(){
        System.out.println("I am in the "+this.getClass().getSimpleName()+" class");
        System.out.println("I don't reproduce");
    }
    
    
    public int getEyes() {
        return eyes;
    }

    public int getNose() {
        return nose;
    }

    public int getMouth() {
        return mouth;
    }

    public int getLegs() {
        return legs;
    }

    public int getHands() {
        return hands;
    }

    public int getEars() {
        return ears;
    }

    public int getTail() {
        return tail;
    }

    public String getSize() {
        return size;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public void setNose(int nose) {
        this.nose = nose;
    }

    public void setMouth(int mouth) {
        this.mouth = mouth;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setHands(int hands) {
        this.hands = hands;
    }

    public void setEars(int ears) {
        this.ears = ears;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    
}