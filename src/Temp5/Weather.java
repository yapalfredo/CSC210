/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temp5;

/**
 *
 * @author al
 */
public class Weather implements Fahrenheit, Celsius{
    
    public Weather()
    {
        
    }

    @Override
    public void Fahrenheit2Celsius(double fahrenheit) {
        System.out.println(fahrenheit + " deg Fahrenheit to Celsius is: " + (fahrenheit - 32) * 5/9);
    }

    @Override
    public void Calsius2Fahrenheit(double celsius) {
        System.out.println(celsius + " deg Celsius to Fahrenheit is: " + (celsius * (9/5)) + 32);
    }
    
    public static void main(String[] args) {
      Weather w = new Weather();
      
      w.Calsius2Fahrenheit(30);
      w.Fahrenheit2Celsius(3.3);
    }
}
