/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

/**
 *
 * @author al
 */
public class AlgoWorkbench6 {
    
    public static void main(String[]args)
    {
        int[][] grades = new int[30][10];
        
        for (int i = 0; i < grades.length; i++) {
            
            for (int j = 0; j < grades[i].length; j++) {
                grades[i][j] = (int) Math.round(Math.random() * 100);     
                System.out.printf("%5d   ", grades[i][j]);
            }
            System.out.println("");
        }
    }
}
