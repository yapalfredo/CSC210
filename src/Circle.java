/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class18;

/**
 *
 * @author lakhan
 */
public class Circle extends Shape{
    private short radius;
    
    public Circle(String shapeType){
      super(shapeType);
    }
    
    @Override
    protected void calcArea(){
        if(this.radius > 0){
            System.out.println("The area of the "+ this.shapeType+": " + Math.PI*this.radius*this.radius);
        }else{
            System.out.println("Please enter the radius of the "+this.shapeType);
            this.radius = kb.nextShort();
            System.out.println("The area of the "+ this.shapeType+": " + Math.PI*this.radius*this.radius);
        }
    }
    
    @Override
    protected void calcPerimeter(){
        if(this.radius > 0){
            System.out.println("The perimeter of the "+ this.shapeType+": " + 2*Math.PI*this.radius);
        }else{
            System.out.println("Please enter the radius of the "+this.shapeType);
            this.radius = kb.nextShort();
            System.out.println("The perimeter of the "+ this.shapeType+": " + 2*Math.PI*this.radius);
        }
    }
    @Override
    protected void calcDiagonal(){
        if(this.radius > 0){
            System.out.println("The diagonal of the "+ this.shapeType+": " + 2*this.radius);
        }else{
            System.out.println("Please enter the radius of the "+this.shapeType);
            this.radius = kb.nextShort();
            
            
            System.out.println("The diameter of the "+ this.shapeType+": " + 2*this.radius);
        }
    }
}
