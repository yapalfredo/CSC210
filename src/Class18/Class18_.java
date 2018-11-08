/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class18;

/**
 *
 * @author al
 */
public class Class18_
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Shape_ rectangle = new Rectangle_("Rectangle"); //polymorphism
        
        rectangle.getShapeType();
        rectangle.calcArea();
        rectangle.calcPerimeter();
        rectangle.calcDiagonal();
        
        Shape_ square = new Square_("Square");
        square.getShapeType();
        square.calcArea();
        square.calcPerimeter();
        square.calcDiagonal();
        
        Shape_ circle = new Circle_("Circle");
        circle.getShapeType();
        circle.calcArea();
        circle.calcPerimeter();
        circle.calcDiagonal();
        
    }
}
