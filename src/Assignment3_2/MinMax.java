/*
 Using a for loop find the max and the min. 
 Max is easy because we know the lower boundary which is 0. 
 Then use the same logic to find the min meaning which boundary do we have to find first?
 This is one algorithm to find min or max. 
 */
package Assignment3_2;

import Assignment3.*;
import java.util.Arrays;

public class MinMax {
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
