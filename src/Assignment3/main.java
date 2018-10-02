/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

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

        Stats openStats = new Stats();
        Stats highStats = new Stats();
        Stats lowStats = new Stats();
        Stats closeStats = new Stats();
        
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

                System.out.printf("Date: %-12s Open: $%-13f High: $%-13f Low: $%-13f Close: $%-13f Adjusted Close: $%-13f Volume: %,-14d DOLLAR VOLUME: $%,-20.2f AVERAGE PRICE: $%,-15f\n",
                        date, dailyPrices[0], dailyPrices[1], dailyPrices[2], dailyPrices[3], dailyPrices[4],
                        intVolume, (dailyPrices[3] * intVolume), (dailyPrices[0] + dailyPrices[1] + dailyPrices[2] + dailyPrices[3]) / 4);
                
               
               openStats.Sum(dailyPrices, 0);    openStats.Sum(dailyPricesIntCopy, 0);
               highStats.Sum(dailyPrices, 1);   highStats.Sum(dailyPricesIntCopy, 1);
               lowStats.Sum(dailyPrices, 2);    lowStats.Sum(dailyPricesIntCopy, 2);
               closeStats.Sum(dailyPrices, 3);  closeStats.Sum(dailyPricesIntCopy, 3);
               
               counter++;
            }
                openStats.Average(counter); openStats.Average((double)counter);
                highStats.Average(counter); highStats.Average((double)counter);
                lowStats.Average(counter);  lowStats.Average((double)counter);
                closeStats.Average(counter); closeStats.Average((double)counter);
               
                
            System.out.println("");
            System.out.println("");
            System.out.println("I N T   D A T A   T Y P E");
               System.out.printf("      The SUM of OPEN is: $%,-13d" , openStats.getIntSum());
               System.out.println("");
               System.out.printf("      The AVERAGE of OPEN is: $%,-13d" , openStats.getIntAvg());
               System.out.println("");
               System.out.printf("      The STANDARD DEVIATION of OPEN data type is: $%,-13d" , openStats.StandardDeviation(0));
               System.out.println("");
               System.out.println("");
               
               System.out.printf("      The SUM of HIGH is: $%,-13d" , highStats.getIntSum());
               System.out.println("");
               System.out.printf("      The AVERAGE of HIGH is: $%,-13d" , highStats.getIntAvg());
               System.out.println("");
               System.out.printf("      The STANDARD DEVIATION of HIGH is: $%,-13d" , highStats.StandardDeviation(0));
               System.out.println("");
               System.out.println("");
               
               System.out.printf("      The SUM of LOW is: $%,-13d" , lowStats.getIntSum());
               System.out.println("");
               System.out.printf("      The AVERAGE of LOW is: $%,-13d" , lowStats.getIntAvg());
               System.out.println("");
               System.out.printf("      The STANDARD DEVIATION of LOW is: $%,-13d" , lowStats.StandardDeviation(0));
               System.out.println("");
               System.out.println("");
               
               System.out.printf("      The SUM of CLOSE is: $%,-13d" , closeStats.getIntSum());
               System.out.println("");
               System.out.printf("      The AVERAGE of CLOSE is: $%,-13d" , closeStats.getIntAvg());
               System.out.println("");     
               System.out.printf("      The STANDARD DEVIATION of CLOSE is: $%,-13d" , closeStats.StandardDeviation(0));
               System.out.println("");  
               System.out.println("");
               System.out.println("");
               
               
              System.out.println("D O U B L E    D A T A   T Y P E");
                System.out.printf("      The SUM of OPEN is: $%,-13f" , openStats.getDblSum());
               System.out.println("");
               System.out.printf("      The AVERAGE of OPEN is: $%,-13f" , openStats.getDblAvg());
               System.out.println("");
               System.out.printf("      The STANDARD DEVIATION of OPEN data type is: $%,-13f" , openStats.StandardDeviation(0.0));
               System.out.println("");
               System.out.println("");
               
               System.out.printf("      The SUM of HIGH is: $%,-13f" , highStats.getDblSum());
               System.out.println("");
               System.out.printf("      The AVERAGE of HIGH is: $%,-13f" , highStats.getDblAvg());
               System.out.println("");
               System.out.printf("      The STANDARD DEVIATION of HIGH is: $%,-13f" , highStats.StandardDeviation(0.0));
               System.out.println("");
               System.out.println("");
               
               System.out.printf("      The SUM of LOW is: $%,-13f" , lowStats.getDblSum());
               System.out.println("");
               System.out.printf("      The AVERAGE of LOW is: $%,-13f" , lowStats.getDblAvg());
               System.out.println("");
               System.out.printf("      The STANDARD DEVIATION of LOW is: $%,-13f" , lowStats.StandardDeviation(0.0));
               System.out.println("");
               System.out.println("");
               
               System.out.printf("      The SUM of CLOSE is: $%,-13f" , closeStats.getDblSum());
               System.out.println("");
               System.out.printf("      The AVERAGE of CLOSE is: $%,-13f" , closeStats.getDblAvg());
               System.out.println("");     
               System.out.printf("      The STANDARD DEVIATION of CLOSE is: $%,-13f" , closeStats.StandardDeviation(0.0));
              
            
              System.out.println("");
              System.out.println("");
                    

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            System.out.println("We read the file successfully");
        }

    }
}
