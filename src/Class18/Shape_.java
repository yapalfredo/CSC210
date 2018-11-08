/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class18;
import java.util.Scanner;
/**
 *
 * @author al
 */
public abstract class Shape_ 
{
    
    protected String shapeType;
    protected Scanner kb;
    public Shape_(String shapeType)
    {
        this.shapeType = shapeType;
        this.kb = new Scanner(System.in);
    }
    
    protected abstract void calcArea();
    protected abstract void calcPerimeter();
    protected abstract void calcDiagonal();
    
    protected void getShapeType()
    {
        System.out.println("The type of shape: "+this.shapeType);
    }
    
}
