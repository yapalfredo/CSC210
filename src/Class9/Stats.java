/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class9;

/**
 *
 * @author lkhan
 */
public class Stats {
    
    public static double sumOfElements(int a[]){
        double sum = 0;
        for(int i=0;i<a.length;i++){            
            sum+=a[i];
        }
        return sum;
    }
    public static double sumOfElements(double a[]){
        double sum = 0;
        for(int i=0;i<a.length;i++){            
            sum+=a[i];
        }
        return sum;
    }
     public static float sumOfElements(float a[]){
        float sum = 0;
        for(int i=0;i<a.length;i++){            
            sum+=a[i];
        }
        return sum;
    }
    
   
    
    public static double averageOfElements(int a[]){        
        //the above code is the same in sumOfElements method so we can call that here.
        double sum = sumOfElements(a);
        return sum/a.length;
    }
    public static double averageOfElements(double a[]){        
        //the above code is the same in sumOfElements method so we can call that here.
        double sum = sumOfElements(a);
        return sum/a.length;
    }
     public static double averageOfElements(float a[]){        
        //the above code is the same in sumOfElements method so we can call that here.
        float sum = sumOfElements(a);
        return sum/a.length;
    }
    
    public static double stdevOfElements(int a[],String type){
        double sum = 0;
        double average = averageOfElements(a);
        for (int i = 0; i < a.length; i++) {
            sum = sum + Math.pow((a[i]-average), 2);
        }
        double variance = 0;
        if(type.equalsIgnoreCase("s")){
            variance = sum/(a.length-1);
        }else{
            variance = sum/a.length;
        }
        
        return Math.sqrt(variance);
    }
    public static double stdevOfElements(double a[],String type){
        double sum = 0;
        double average = averageOfElements(a);
        for (int i = 0; i < a.length; i++) {
            sum = sum + Math.pow((a[i]-average), 2);
        }
        double variance = 0;
        if(type.equalsIgnoreCase("s")){
            variance = sum/(a.length-1);
        }else{
            variance = sum/a.length;
        }
        
        return Math.sqrt(variance);
    }
}
