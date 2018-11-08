/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temp;

/**
 *
 * @author al
 */
public class Temp2 {
    
    public static void main(String[] args)
    {
        String[] arr = {"zkasjhdkaskhZasdasdzxzasdasz","z123wqwdaZZz"};
        System.out.println(returnCount(arr, 'z'));
        
    }
    
    public static int returnCount(String [] arrString, char z)
    {
        int counter = 0;
        
        for (int i = 0; i < arrString.length; i++) {
            for (int j = 0; j < arrString[i].length(); j++) {
                
                if (arrString[i].charAt(j)==z) {
                    counter ++;
                }
            }
        }
        return counter;
    }
    
}
