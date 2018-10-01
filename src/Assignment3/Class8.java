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
public class Class8 {

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
            String[] lineArray;
            bf.readLine();
            while ((line = bf.readLine()) != null) {

                lineArray = line.split(",");

                String date = lineArray[0];

                double[] dailyPrices = new double[5];
                int intVolume;
                try {

                    for (int i = 0; i < 5; i++) {
                        dailyPrices[i] = Double.parseDouble(lineArray[i + 1]);
                    }
                 
                    
                    intVolume = Integer.parseInt(lineArray[6]);
                } catch (NumberFormatException e) {
                    // System.out.println(e.getLocalizedMessage());
                    e.printStackTrace();
                    dailyPrices[0] = 1;
                    dailyPrices[1] = 1;
                    dailyPrices[2] = 1;
                    dailyPrices[3] = 1;
                    dailyPrices[4] = 1;
                    intVolume = 1;
                }

                System.out.printf("Date: %-12s Open: $%-13f High: $%-13f Low: $%-13f Close: $%-13f Adjusted Close: $%-13f Volume: %,-14d DOLLAR VOLUME: $%,-20.2f AVERAGE PRICE: $%,-15f\n",
                        date, dailyPrices[0], dailyPrices[1], dailyPrices[2], dailyPrices[3], dailyPrices[4],
                        intVolume, (dailyPrices[3] * intVolume), (dailyPrices[0] + dailyPrices[1] + dailyPrices[2] + dailyPrices[3]) / 4);
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
