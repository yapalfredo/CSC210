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
public class Pentagon extends Shape implements Area,Perimeter,Diagonal{    
    private short a;
    public Pentagon(String shapeType){
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
            System.out.println("The perimeter of the "+ this.shapeType+": " + (5*this.a));
        }else{
            System.out.println("Please enter side 'a' of the "+this.shapeType);
            this.a = kb.nextShort();            
            System.out.println("The perimeter of the "+ this.shapeType+": " + (5*this.a));
        }
    }
    @Override
    public void calcDiagonal(){
        if(this.a > 0 ){
            System.out.println("The diagonal of the "+ this.shapeType+": " + ((Math.sqrt(5)+1)*0.5*this.a));
        }else{
            System.out.println("Please enter side 'a' of the "+this.shapeType);
            this.a = kb.nextShort();            
            System.out.println("The diagonal of the "+ this.shapeType+": " + ((Math.sqrt(5)+1)*0.5*this.a));
        }
    }
    
    private double computeArea(short a){
        return Math.sqrt(5*(5+2*Math.sqrt(5))) * Math.pow(a, 2) * 0.25;
    }
}
