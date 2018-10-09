/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class11;

import Class9.Stats;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import Class9.Stats;
/**
 *
 * @author lkhan
 */
public class Class11B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("C:\\Users\\al\\OneDrive - Borough of Manhattan Community College\\CS 210\\MSFT.csv");
        //Example of checked exception handling

        try {
            
            //Step1
            FileReader filereader = new FileReader(file);
            BufferedReader buffread = new BufferedReader(filereader);
            buffread.readLine();//header and we are reading off so we don't have to deal with it.
            String line = "";                        
            ArrayList<String[]> msft = new ArrayList();
         
            while((line=buffread.readLine())!=null){
               msft.add(line.trim().split(","));
            }
            
            System.out.println("We have stored our data from the file in to an array");
            //Step3 A for lop to do analytics
            float [] dailyPrices = new float[5];
            int volume;
            String date;
            int lookBack = 7;
            float shortMemory[] = new float[lookBack];
            for(int i = 0;i<msft.size();i++){
                
                String lineArray[] = msft.get(i);
                  
                  date = lineArray[0];
                  
                for(int j = 0;j<dailyPrices.length;j++){
                    dailyPrices[j] = Float.parseFloat(lineArray[j+1]);
                }
                
                volume = Integer.parseInt(lineArray[6]);
                if(i>(lookBack-1)){
                    for (int k = 0; k<shortMemory.length ; k++) {
                        shortMemory[k] = Float.parseFloat(msft.get(i-k-1)[4]);
                    }
                    System.out.printf("Date:%s,  Open:%f,  High:%f,  Low:%f,  Close:%f,"
                        + "  AdjClose:%f,  Volume:%,d,Dollar   Volume:%,f,  MA7:%f\n",
                        date,dailyPrices[0],dailyPrices[1],dailyPrices[2],dailyPrices[3],dailyPrices[4],
                        volume,volume*dailyPrices[3], Stats.averageOfElements(shortMemory));
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