/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class14;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import Class9.Stats;
/**
 *
 * @author lkhan
 */
public class Homework {

    /**
     * @param args the command line arguments
     */
    
    public static void Question3(){
        String[] inventors = {"Einstein","Newton","Copernicus","Kepler"};
        short numberOfCharcters=0;
        for(String str : inventors){
            System.out.println(str);
            numberOfCharcters+=str.length();
        }
        System.out.println("The number of characters in inventors array "+numberOfCharcters);
        
        System.out.println("Another way is two for loops");
        numberOfCharcters=0;
        for (int i = 0; i < inventors.length; i++) {
            for (int j = 0; j < inventors[i].length(); j++) {
                System.out.println(inventors[i].charAt(j));
                numberOfCharcters++;
            }
        }
        System.out.println("The number of characters in inventors array "+numberOfCharcters);
    }
    
    public static void Question4(){
        String[] countries = {"Jamaica","China","US","Cuba","Haiti","Canada","PR"};
        int[] population = {8000000,1400000000,360000000,10000000,8000000,30000000,12000000};
        for (int i = 0; i < countries.length; i++) {
            System.out.print(countries[i]+" : ");
            System.out.print(population[i] + "\n");                        
        }
        HashMap<String, Integer> census = new HashMap<>();
            census.put("Jamaica", 8000000);
            census.put("China", 1400000000);
            census.put("US", 360000000);
            census.put("Cuba", 10000000);
            census.put("Haiti", 8000000);
            census.put("Canada", 30000000);
            census.put("PR", 12000000);
        //print just the keys
        for(String str : census.keySet()){
            System.out.println(str);
        }
        //print just the values
        for(int value:census.values()){
            System.out.println(value);
        }
        //print key and value
        for(String str : census.keySet()){
            System.out.println(str + ":" +census.get(str));
        }
        //another way to print key and value using a Map.Entry
        for(Map.Entry<String,Integer> item : census.entrySet()){
            System.out.println(item.getKey()+" : "+item.getValue());
        }
    }
    
    public static void Question6And7(){
        //Question6
        int[][]grades = new int [30][10];
        
        for (int i = 0; i < grades.length; i++) {
        
            //fill
            for (int j = 0; j < grades[i].length; j++) {
                grades[i][j] = (int)Math.round(Math.random()*100);
                
            }
            //print
            System.out.println(Arrays.toString(grades[i])+ ":"+Stats.averageOfElements(grades[i]));
        }
    }
}
