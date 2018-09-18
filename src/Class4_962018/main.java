/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class4_962018;

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

        try {
            File file = new File("C:\\Users\\al\\OneDrive - Borough of Manhattan Community College\\CS 210\\MSFT.csv");
            FileReader filereader = new FileReader(file);
            BufferedReader bf = new BufferedReader(filereader);

            String line = "";
            bf.readLine();
            while ((line = bf.readLine()) != null) {
               
                
                int locationOfFirstComma = line.indexOf(",");
                int locationOfSecondComma = line.indexOf(",", locationOfFirstComma + 1);
                int locationOfThirdComma = line.indexOf(",", locationOfSecondComma + 1);
                int locationOfFourthComma = line.indexOf(",", locationOfThirdComma + 1);
                int locationOfFifthComma = line.indexOf(",", locationOfFourthComma + 1);
                int locationOfSixthComma = line.indexOf(",", locationOfFifthComma + 1);

                String date = line.substring(0,locationOfFirstComma);
                String open = line.substring(locationOfFirstComma + 1, locationOfSecondComma);
                String high = line.substring(locationOfSecondComma + 1, locationOfThirdComma);
                String low = line.substring(locationOfThirdComma + 1, locationOfFourthComma);
                String close = line.substring(locationOfFourthComma + 1, locationOfFifthComma);
                String adjustedClose = line.substring(locationOfFifthComma+1, locationOfSixthComma);
                String volume = line.substring(locationOfSixthComma+1);
                

                double dblOpen, dblHigh, dblLow, dblClose,dblAdjClose;
                double [] stockPerformance= new double[5];
                int intVolume;
                try{                   
                     stockPerformance[0] = Double.parseDouble(open);                 //open
                     stockPerformance[1] = Double.parseDouble(high);                 //high
                     stockPerformance[2] = Double.parseDouble(low);                  //low
                     stockPerformance[3] = Double.parseDouble(close);                //close
                     stockPerformance[4] = Double.parseDouble(adjustedClose);        //adjClose
                     intVolume = Integer.parseInt(volume);                           //volume
                }catch (NumberFormatException e){
                   // System.out.println(e.getLocalizedMessage());
                   e.printStackTrace();
                    stockPerformance[0] = 1;
                    stockPerformance[1] = 1;
                    stockPerformance[2] = 1;
                    stockPerformance[3] = 1;
                    stockPerformance[4] = 1;
                    intVolume = 1;
                }
         
                System.out.printf("Date: %-12s Open: $%-13f High: $%-13f Low: $%-13f Close: $%-13f Adjusted Close: $%-13f Volume: %,-14d DOLLAR VOLUME: $%,-20.2f AVERAGE PRICE: $%,-15f\n", 
                        date,stockPerformance[0],stockPerformance[1],stockPerformance[2],stockPerformance[3],stockPerformance[4], 
                        intVolume, (stockPerformance[3]*intVolume), (stockPerformance[0]+stockPerformance[1]+stockPerformance[2]+stockPerformance[3])/4);
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
