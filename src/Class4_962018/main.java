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
                int intVolume;
                try{                   
                     dblOpen = Double.parseDouble(open);
                     dblHigh = Double.parseDouble(high);
                     dblLow = Double.parseDouble(low);
                     dblClose = Double.parseDouble(close);
                     dblAdjClose = Double.parseDouble(adjustedClose);
                     intVolume = Integer.parseInt(volume);
                }catch (NumberFormatException e){
                    System.out.println(e.getLocalizedMessage());
                    dblOpen = 0;
                    dblHigh = 0;
                    dblLow = 0;
                    dblClose = 0;
                    dblAdjClose = 0;
                    intVolume=0;
                }
               System.out.println(date + " " + dblOpen + " " + dblHigh + " " + dblLow + " " + dblClose + " "+ dblAdjClose + " "+ intVolume);
               
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
