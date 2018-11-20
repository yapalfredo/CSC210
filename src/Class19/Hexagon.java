/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class19;

/**
 *
 * @author lkhan
 */
public class Hexagon extends Shape implements Area,Perimeter{
    private short a;
    public Hexagon(String shapeType){
        super(shapeType);
    }
    @Override
    public void calcArea(){
        if(this.a > 0){
            System.out.println("The area of the "+ this.shapeType+": " + computeArea(a));
        }else{            
            System.out.println("Please enter side 'a' of the "+this.shapeType);
            this.a = kb.nextShort();
            System.out.println("The area of the "+ this.shapeType+": " + computeArea(a));
        }
    }
    
    @Override
    public void calcPerimeter(){        
        if(this.a > 0 ){
            System.out.println("The perimeter of the "+ this.shapeType+": " + (6*this.a));
        }else{
            System.out.println("Please enter side 'a' of the "+this.shapeType);
            this.a = kb.nextShort();            
            System.out.println("The perimeter of the "+ this.shapeType+": " + (6*this.a));
        }
    }
    
    
    private double computeArea(short a){
        return 3*Math.sqrt(3)*Math.pow(a, 2) / 2;
    }
}
