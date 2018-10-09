/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author lkhan
 */
public class Homework3A {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("C:\\Users\\lkhan\\Downloads\\MSFT.csv");
        //Example of checked exception handling
        try {
            FileReader filereader = new FileReader(file);
            BufferedReader buffread = new BufferedReader(filereader);
            buffread.readLine();//header and we are reading off so we don't have to deal with it.
            String line = "";
            String lineArray[];
            byte lookback = 15;
            double []sevenDayClosingPrices = new double[lookback];
            short counter=0;
            
            while ((line = buffread.readLine()) != null) {
                counter++;
                lineArray = line.split(",");                                
                String date = lineArray[0];//date
                //instantiate an array
                double dailyPrices[] = new double[5];                    
                int volume;                                
                //set the values here. 
                for (int i = 0; i < dailyPrices.length; i++) {
                    try {
                        dailyPrices[i] = Double.parseDouble(lineArray[i+1]);
                    } catch (NumberFormatException e) {
                        System.out.println(e.getLocalizedMessage());
                        dailyPrices[i] = 1;
                    }
                }                    
                try{
                    volume = Integer.parseInt(lineArray[6]);
                }catch(NumberFormatException nm){
                    System.out.println(nm.getLocalizedMessage());
                    volume = 1;
                }
                if(counter>lookback){
                    System.out.printf("Date:%s,Open:%f,High:%f,Low:%f,Close:%f,"
                        + "AdjClose:%f,Volume:%,d,Dollar Volume:%,f,"
                        + "Average Price:%f,Stdev of Daily Price: %f"
                        + "7DayMovingAverage:%f\n",
                        date,dailyPrices[0],dailyPrices[1],dailyPrices[2],dailyPrices[3],dailyPrices[4],
                        volume,volume*dailyPrices[3],Stats.averageOfElements(dailyPrices),
                        Stats.stdevOfElements(dailyPrices, "P"),
                        Stats.averageOfElements(sevenDayClosingPrices));
                    //for loop to move prices up
                    for (int i = 1; i < sevenDayClosingPrices.length; i++) {
                        sevenDayClosingPrices[i-1] = sevenDayClosingPrices[i];
                    }
                    sevenDayClosingPrices[lookback-1] = dailyPrices[3];
                }else{
                    sevenDayClosingPrices[counter-1]=dailyPrices[3];
                }
                    
                
                
            }
        } 
        catch (IOException io) {
            io.printStackTrace();
//            System.out.println(io.getLocalizedMessage());
        } finally {
            System.out.println("We read the file successfully");
        }
        
    }
}