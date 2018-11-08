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
public class Pentagon_ extends Shape_
{
    private short a;
    private short c;
    private short base;
    
    public Pentagon_ (String shapeType)
    {
        super(shapeType);
    }

    @Override
    protected void calcArea() {
       if (this.a > 0)
       {
           System.out.println("The area of the " + this.shapeType + ": "+ computeArea(a));
       }
       else
       {
           System.out.println("Please enter side of 'a' of this " + this.shapeType);
           this.a = kb.nextShort();
           if (this.base <= 0)
           {
               System.out.println("Please enter the base of the" + this.shapeType);
               this.base = kb.nextShort();
           }
           System.out.println("Please enter side of 'c' of the " + this.shapeType);
           this.c = kb.nextShort();
          System.out.println("The area of the " + this.shapeType + ": " + computeArea(a));
       }
    }

    @Override
    protected void calcPerimeter() 
    {
      if (this.a > 0)
        {
            System.out.println("The perimter of the " + this.shapeType + ": " + (5*this.a));
        }
        else
        {
            System.out.println("Please enter side 'a' of the " + this.shapeType);
            this.a = kb.nextShort();
            System.out.println("The perimiter of the " + this.shapeType + ": " + (5*this.a));
        }   
    }

    @Override
    protected void calcDiagonal() {
        
    }
    
    private double computeArea(short a )
    {
        return Math.sqrt(5 * (5 + 2*Math.sqrt(5))) * Math.pow(a, 2) * 0.25;
    }
    
}
