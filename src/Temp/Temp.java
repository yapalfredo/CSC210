/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Temp;
import java.util.Arrays;
/**
 *
 * @author al
 */
public class Temp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] values = new int[5];
        for (int count = 0; count < 5; count++)
        {
            values[count] = count + 1;
        }
        for (int count = 0; count < 5; count++)
        {
            System.out.println(values[count]);
        }

    }
    
}
