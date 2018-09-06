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
        
        try{
        File file = new File("C:\\Users\\al\\OneDrive - Borough of Manhattan Community College\\CS 210\\MSFT.csv");
        FileReader filereader = new FileReader(file);
        
    }catch (FileNotFoundException e){
        e.printStackTrace();
    }catch(IOException io){
        io.printStackTrace();
    }finally {
            System.out.println("We read the file successfully");
        }
    
 }
}
