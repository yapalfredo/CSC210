/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;
import java.util.HashMap;

/**
 *
 * @author al
 */
public class AlgoWorkbench4 {
    
    public static void main(String []args)
    {
        //PARALLEL ARRAYS
        String[] arrCountry = {"China", "India", "United States",
                                "Indonesia", "Brazil", "Pakistan",
                                "Nigeria"};
        
        int[] arrCountryPopulation = {	1384688986 , 1296834042, 329256465,
                                        262787403, 208846892, 207862518,
                                        203452505};
        
        System.out.println("P A R A L L E L    A R R A Y S");
        for (int i = 0; i < arrCountry.length; i++) {
            System.out.print(arrCountry[i] + "'s population is ");
            System.out.printf("%,d", arrCountryPopulation[i]);
            System.out.println("");
        }
        
        
        System.out.println("");
        System.out.println("");
        
        //PARALLEL HASHMAPS
       HashMap <String,String> hashCountry = new HashMap<>();
       HashMap <String,Integer> hashCountryPopulation = new HashMap<>();
       
       String key;
        System.out.println("P A R A L L E L    H A S H M A P S");
        for (int i = 0; i < arrCountry.length; i++) {
            key = "country" + i;
            hashCountry.put(key, arrCountry[i]);           
            hashCountryPopulation.put(key, arrCountryPopulation[i]);
            
            System.out.print(hashCountry.get(key) +"'s population is: ");
            System.out.printf("%,d", hashCountryPopulation.get(key));
            System.out.println("");
        }
        
        
    }
    
}
