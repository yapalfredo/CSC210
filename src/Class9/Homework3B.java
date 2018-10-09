/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class9;

/**
 *
 * @author lkhan
 */
public class Homework3B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = {3,4,5,6,7,1,3,2,8,15};
        int min = 0;
        int max = 0;
        
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                max = a[i];
            }
        }
        min = max;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<min){
                min = a[i];
            }
        }
        
    }
    
}