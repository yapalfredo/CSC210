/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class7;

/**
 *
 * @author al
 */
public class matrix {
    
    public static void main(String [] args){
        
        
        int a[][] = new int[10][10];
        
        for (int row = 1; row <=10; row++) {
            for (int col = 1; col <=10; col++) {
                System.out.print((row * col) + " ");
            }
            System.out.println("");
        }
    }
    
}
