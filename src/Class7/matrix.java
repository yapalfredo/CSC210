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
        
        threeByThree();
    }
    
    public static void tenByTen(){
        
       
        for (int row = 1; row <=10; row++) {
            for (int col = 1; col <=10; col++) {
              //  System.out.print((row * col) + " ");
                System.out.printf("%3 d ", (row*col));
            }
            System.out.println("");
        }
    }
    
    public static void threeByThree(){
        
        int f[][] = { {1,2,4}, {3,2,2}, {5,8,4}};
        
        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f[i].length; j++) {
                System.out.print(f[i][j] + " ");
            }
            System.out.println("");
        }
        
        
    }
    
}
