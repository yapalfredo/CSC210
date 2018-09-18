/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class5_;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author lkhan
 */
public class Class5_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("C:\\Users\\al\\OneDrive - Borough of Manhattan Community College\\CS 210\\MSFT.csv");
        //Example of checked exception handling
        try {
            FileReader filereader = new FileReader(file);
            BufferedReader buffread = new BufferedReader(filereader);
            String line = "";

            while ((line = buffread.readLine()) != null) {
//                System.out.println(line); 
//                System.out.println(line.substring(11, 19));
                int locationOfFirstComma = line.indexOf(",");
                int locationOfSecondComma = line.indexOf(",", locationOfFirstComma + 1);
                int locationOfThirdComma = line.indexOf(",", locationOfSecondComma + 1);
                int locationOfFourthComma = line.indexOf(",", locationOfThirdComma + 1);
                int locationOfFifthComma = line.indexOf(",", locationOfFourthComma + 1);
                int locationOfSixthComma = line.indexOf(",", locationOfFifthComma + 1);                
                
                String date = line.substring(0, locationOfFirstComma);                
                //instantiate an array
              //  double close, adjClose;
                double dailyPrices[] = new double[6];                              
                int volume;                
                try {
                    //set the values here. 
                    //open
                    dailyPrices[0] = Double.parseDouble(line.substring(locationOfFirstComma + 1, locationOfSecondComma));
                    //high
                    dailyPrices[1] = Double.parseDouble(line.substring(locationOfSecondComma + 1, locationOfThirdComma));                    
                    //low
                    dailyPrices[2] = Double.parseDouble(line.substring(locationOfThirdComma + 1, locationOfFourthComma));
                    //close
                    dailyPrices[3] = Double.parseDouble(line.substring(locationOfFourthComma + 1, locationOfFifthComma));
                    //adjClose
                    dailyPrices[4] = Double.parseDouble(line.substring(locationOfFifthComma + 1, locationOfSixthComma));
                    //volume
                    volume = Integer.parseInt(line.substring(locationOfSixthComma+1));
                } catch (NumberFormatException nb) {
//                    nb.printStackTrace();
                    System.out.println(nb.getLocalizedMessage());
                    dailyPrices[0]=1;                    
                    dailyPrices[1]=1;
                    dailyPrices[2]=1;
                    dailyPrices[3]=1;
                    dailyPrices[4]=1;
                    volume=1;                   
                }
                double avgPrice = (dailyPrices[0]+dailyPrices[3]+dailyPrices[1]+dailyPrices[2])/4;
                System.out.printf("Date:%s,Open:%f,High:%f,Low:%f,Close:%f,AdjClose:%f,Volume:%,d,Dollar Volume:%,f,Average Price:%f\n",
                        date,dailyPrices[0],dailyPrices[1],dailyPrices[2],dailyPrices[3],dailyPrices[4],volume,volume*dailyPrices[3],avgPrice);
            }

        } //       catch(FileNotFoundException fn){
        ////           fn.printStackTrace();
        //            System.out.println(fn.getLocalizedMessage());
        //            
        //        }
        catch (IOException io) {
            io.printStackTrace();
//            System.out.println(io.getLocalizedMessage());
        } finally {
            System.out.println("We read the file successfully");
        }
        
    }
    
}