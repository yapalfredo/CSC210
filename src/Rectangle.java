/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class18;

/**
 *
 * @author lakhan
 */
public class Rectangle extends Shape{
    private short length;
    private short width;
    
    public Rectangle(String shapeType){
      super(shapeType);
    }
    @Override
    protected void calcArea(){
        if(this.length > 0 && this.width > 0){
            System.out.println("The area of the rectanle is "+ this.length*this.width);
        }else{
            System.out.println("Please enter the length of the rectangle");
            this.length = kb.nextShort();
            System.out.println("Please enter the width of the rectangle");
            this.width = kb.nextShort();
            
            System.out.println("The area of the rectanle is "+ this.length*this.width);
        }
    }
    
    @Override
    protected void calcPerimeter(){
        if(this.length > 0 && this.width > 0){
            System.out.println("The perimeter of the rectanle is "+ 2*(this.length+this.width));
        }else{
            System.out.println("Please enter the length of the rectangle");
            this.length = kb.nextShort();
            System.out.println("Please enter the width of the rectangle");
            this.width = kb.nextShort();
            
            System.out.println("The perimeter of the rectangle is "+ 2*(this.length+this.width));
        }
    }
    @Override
    protected void calcDiagonal(){
        if(this.length > 0 && this.width > 0){
            System.out.println("The diagonal of the rectanle is "+ Math.sqrt(Math.pow(this.length, 2)+Math.pow(this.width, 2)));
        }else{
            System.out.println("Please enter the length of the rectangle");
            this.length = kb.nextShort();
            System.out.println("Please enter the width of the rectangle");
            this.width = kb.nextShort();
            
            System.out.println("The diagonal of the rectanle is "+ Math.sqrt(Math.pow(this.length, 2)+Math.pow(this.width, 2)));
        }
    }
    
}
