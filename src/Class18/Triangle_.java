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
public class Triangle_ extends Shape_ {
    private short base;
    private short height;
    private short a;
    private short c;
    
    public Triangle_(String shapeType)
    {
        super(shapeType);
    }

    @Override
    protected void calcArea() {
        
    }

    @Override
    protected void calcPerimeter() {
       
    }

    @Override
    protected void calcDiagonal() {
        System.out.println("A diagonal is not available for a triangle.");
    }
    
  
    
}
