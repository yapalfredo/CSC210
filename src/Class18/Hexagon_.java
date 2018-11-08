/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class18;

/**
 *
 * @author al
 */
public class Hexagon_ extends Shape_ 
{
    
    private short a;
    public Hexagon_ (String shapeType)
    {
        super(shapeType);
    }

    @Override
    protected void calcArea() 
    {
        if (this.a > 0)
        {
            System.out.println("The area of the " + this.shapeType +": " + computeArea(a));
        }
        else
        {
            System.out.println("Please enter side 'a' of the "+this.shapeType);
            this.a = kb.nextShort();
            System.out.println("The area of the " + this.shapeType +": " + computeArea(a));
        }
    }

    @Override
    protected void calcPerimeter() 
    {
        if (this.a > 0)
        {
            System.out.println("The perimter of the " + this.shapeType + ": " + (6*this.a));
        }
        else
        {
            System.out.println("Please enter side 'a' of the " + this.shapeType);
            this.a = kb.nextShort();
            System.out.println("The perimiter of the " + this.shapeType + ": " + (6*this.a));
        }
    }

    @Override
    protected void calcDiagonal() 
    {
        System.out.println("A diagonal is not available for the" + this.shapeType);
    }
    
    private double computeArea(short a)
    {
        return 3*Math.sqrt(3) * Math.pow(a, 2) / 2;
        
    }
    
}
