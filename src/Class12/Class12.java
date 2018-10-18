/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class12;

import Class11.*;
import Class9.Stats;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import Class9.Stats;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Map;
/**
 *
 * @author lkhan
 */
public class Class12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("C:\\Users\\al\\OneDrive - Borough of Manhattan Community College\\CS 210\\MSFT.csv");
        //Example of checked exception handling
       
        
        HashMap<String,DailyPrices> msft = new HashMap<>();
        String key;
        DailyPrices values;
        try {
            
            //Step1
            FileReader filereader = new FileReader(file);
            BufferedReader buffread = new BufferedReader(filereader);
            buffread.readLine();//header and we are reading off so we don't have to deal with it.
            String line = "";      
            
            while((line=buffread.readLine())!=null){
                String[] lineArray = line.trim().split(",");
           
                key = lineArray[0];
                values = new DailyPrices(lineArray);
           
                msft.put(key, values);
            }
        } 
        catch (IOException io) {
            io.printStackTrace();
//            System.out.println(io.getLocalizedMessage());
        } finally {
            System.out.println("We read the file successfully");
        }
        
        
        
        Scanner kb = new Scanner(System.in);
        
        boolean found = false;
        
        do{
            System.out.print("Please enter a date: ");
            String input = kb.next();
         
            if(msft.containsKey(input))
            {
                 System.out.println("Exists");
                 found = true;
                
                System.out.printf("Date:%s,  Open:%f,  High:%f,  Low:%f,  Close:%f,"
                        + "  AdjClose:%f,  Volume:%,d,   Dollar Volume:%,f,"
                        + "   Average Price:%f,   Stdev of Daily Price: %f\n",  msft.get(input).getDate(),
                        msft.get(input).getOpen(), msft.get(input).getHigh(), msft.get(input).getLow(), 
                        msft.get(input).getClose(), msft.get(input).getAdjClose(), msft.get(input).getVolume(),  
                        msft.get(input).getDollarVolume(), msft.get(input).getDailyAverage(), 
                        msft.get(input).getStandardDeviation());
                 
                
            }
            else
            {
                System.out.println("Doesn't exist");
            }
        }while(!found);
       


//        /* Display content using Iterator*/
//      Set set = msft.entrySet();
//      Iterator iterator = set.iterator();
//      while(iterator.hasNext()) {
//         Map.Entry mentry = (Map.Entry)iterator.next();
//         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
//         System.out.println(mentry.getValue());
//      }
//       
        
        
    }
}