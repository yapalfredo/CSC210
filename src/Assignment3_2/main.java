/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3_2;

import Assignment3.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

/**
 *
 * @author al
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Stats Statistics = new Stats();
        
        final int SIZE = 5;
        String[] lineArray;
        double[] dailyPrices = new double[SIZE];
        int[] dailyPricesIntCopy = new int[SIZE];
        int intVolume;
        int counter = 0;    //will count releveant lines in the array 
        try {
            File file = new File("C:\\Users\\al\\OneDrive - Borough of Manhattan Community College\\CS 210\\MSFT.csv");
            FileReader filereader = new FileReader(file);
            BufferedReader bf = new BufferedReader(filereader);
            
            String line = "";
            
            bf.readLine();
          
            while ((line = bf.readLine()) != null) {

                lineArray = line.split(",");
                String date = lineArray[0];         //Date Column

                 for (int i = 0; i < SIZE; i++) 
                        {
                            try {
                            dailyPrices[i] = Double.parseDouble(lineArray[i + 1]);
                            dailyPricesIntCopy[i] = (int)dailyPrices[i];            //makes an int copy
                            } catch (Exception e) {
                                e.printStackTrace();
                                 dailyPrices[i] = 1;
                            }
                        }     
                try {
                       
                 intVolume = Integer.parseInt(lineArray[6]);     // Volume Column
                } catch (NumberFormatException e) {                  
                    e.printStackTrace();    
                    intVolume = 1;
                }

                System.out.printf("Date: %-12s Open: $%-13f High: $%-13f Low: $%-13f Close: $%-13f Adjusted Close: $%-13f Volume: %,-14d DOLLAR VOLUME: $%,-20.2f "
                        + "SUM: $%,10f     AVERAGE PRICE: $%,10f     STANDARD DEVIATION: $%,10f\n",
                        date, dailyPrices[0], dailyPrices[1], dailyPrices[2], dailyPrices[3], dailyPrices[4],
                        intVolume, (dailyPrices[3] * intVolume), Statistics.Sum(dailyPrices), Statistics.Average(dailyPrices), Statistics.StandardDeviation(dailyPrices));
                               
               counter++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            System.out.println("We read the file successfully");
        }

    }
}
