/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class18;

/**
 *
 * @author lakhan
 */
public class Pentagon_ extends Shape_{
    private short a;
    public Pentagon_(String shapeType){
        super(shapeType);
    }
    @Override
    protected void calcArea(){
        if(this.a > 0){
            System.out.println("The area of the "+ this.shapeType+": " + computeArea(a));
        }else{            
            System.out.println("Please enter side 'a' of the "+this.shapeType);
            this.a = kb.nextShort();
            System.out.println("The area of the "+ this.shapeType+": " + computeArea(a));
        }
    }
    
    @Override
    protected void calcPerimeter(){        
        if(this.a > 0 ){
            System.out.println("The perimeter of the "+ this.shapeType+": " + (5*this.a));
        }else{
            System.out.println("Please enter side 'a' of the "+this.shapeType);
            this.a = kb.nextShort();            
            System.out.println("The perimeter of the "+ this.shapeType+": " + (5*this.a));
        }
    }
    @Override
    protected void calcDiagonal(){
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
