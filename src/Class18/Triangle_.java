/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class18;

/**
 *
 * @author lakhan
 */
public class Triangle_ extends Shape_{
    private short base;
    private short height;
    private short a;
    private short c;
    
    public Triangle_(String shapeType){
        super(shapeType);
    }
    @Override
    protected void calcArea(){
        if(this.base > 0 && this.height > 0 ){
            System.out.println("The area of the "+ this.shapeType+": " + (this.base*this.height)*0.5);
        }else{
            if(this.base <= 0){
                System.out.println("Please enter the base of the "+this.shapeType);
                this.base = kb.nextShort();
            }
            System.out.println("Please enter the height of the "+this.shapeType);
            this.height = kb.nextShort();
            System.out.println("The area of the "+ this.shapeType+": " + (this.base*this.height)*0.5);
        }
    }
    
    @Override
    protected void calcPerimeter(){
        if(this.base > 0 && this.a >0 && this.c >0){
            System.out.println("The perimeter of the "+ this.shapeType+": " + (this.a+this.base+this.c));
        }else{
            System.out.println("Please enter side 'a' of the "+this.shapeType);
            this.a = kb.nextShort();
            if(this.base <= 0){
                System.out.println("Please enter the base of the "+this.shapeType);
                this.base = kb.nextShort();
            }
            System.out.println("Please enter side 'c' of the "+this.shapeType);
            this.c = kb.nextShort();
            System.out.println("The perimeter of the "+ this.shapeType+": " + (this.a+this.base+this.c));
        }
    }
    @Override
    protected void calcDiagonal(){
        System.out.println("A diagonal is not available for a "+this.shapeType);
    }
}
