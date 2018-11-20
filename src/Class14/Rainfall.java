/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class14;
import java.util.ArrayList;
import java.util.Scanner;
import Class9.Stats;
/**
 *
 * @author lkhan
 */
public class Rainfall {
    private ArrayList<Double> rainfalls;
    private String[] months;
    private Scanner kb;
    
    public Rainfall(){
        this.kb = new Scanner(System.in);
        this.rainfalls = new ArrayList<>();
        this.months = new String[]{"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    }
    
    public void setRainfalls(){
        for (int i = 0; i < this.months.length; i++) {
            System.out.println("Please enter the rainfall for "+this.months[i]);
            this.rainfalls.add(kb.nextDouble());
        }
    }
    public void totalRainFall(){
        double sum = 0;
        for(double rainfall : rainfalls){
            sum+=rainfall;
        }
        System.out.println("The total rainfall for the year :"+sum);
    }
    public void averageRainFall(){
        double temp[] = new double[this.rainfalls.size()];
        for (int i = 0; i < this.rainfalls.size(); i++) {
            temp[i] = this.rainfalls.get(i);
        }
        System.out.println("Average rainfall: "+Stats.averageOfElements(temp));
    }
    public void leastRain(){
        double least = this.rainfalls.get(0);
        String month = this.months[0];
        
        for(int i = 0;i<this.rainfalls.size();i++){
            if(this.rainfalls.get(i) < least){
                least = this.rainfalls.get(i);
                month = this.months[i];
            }
        }
        System.out.println(month + " had the least rainfall @ "+least);
    }
    public void mostRain(){
        double most = this.rainfalls.get(0);
        String month = this.months[0];
        
        for(int i = 0;i<this.rainfalls.size();i++){
            if(this.rainfalls.get(i) > most){
                most = this.rainfalls.get(i);
                month = this.months[i];
            }
        }
        System.out.println(month + " had the most rainfall @ "+most);
    }
    
}
