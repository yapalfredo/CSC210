/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class19;

/**
 *
 * @author lakhan
 */
public class Class19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //This method is not an appropriate use of interface
        Area area = new Circle("Circle");
        area.calcArea();
        
        Perimeter perimeter =  new Circle("Circle");
        perimeter.calcPerimeter();
        
        //
        Circle circle = new Circle("Circle");
        circle.getShapeType();
        circle.calcArea();
        circle.calcPerimeter();
        circle.calcDiameter();
        
        
        
    }
}
