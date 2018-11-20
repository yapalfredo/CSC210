/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class19;
import java.util.Scanner;
/**
 *
 * @author lkhan
 */
public class Shape {
    protected String shapeType;
    protected Scanner kb;
    
    public Shape(String shapeType){
        this.shapeType = shapeType;
        this.kb = new Scanner(System.in);
    }
}
