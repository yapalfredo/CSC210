/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import java.util.Arrays;

public class Number3 {
    public static void main(String [] args)
    {
        int max=0;
        int min=2147483647;
        
        int a[] = {3, 4, 5, 6, 7, 1, 3 , 2, 8, 15};
        
        for (int i = 0; i < a.length; i++) {
            if (i < a.length-1) {
                if (a[i] > a[i+1]) {
                    if (a[i]>max) {
                        max = a[i];
                    }
                    if (a[i+1]<min) {
                        min = a[i+1];
                    }                   
                }
                else if(a[i]<a[i+1]){
                    if (a[i+1]>max) {
                        max = a[i+1];
                    }
                    if (a[i]<min) {
                        min = a[i];
                    }
                }
            }
        }
        
        System.out.println("The elements in the array are "+Arrays.toString(a));
        System.out.println("");
        System.out.println("Largest number is: " + max);
        System.out.println("");
        System.out.println("Smallest number is: " + min);
        System.out.println("");
    }
}
