/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class22;

/**
 *
 * @author al
 */
public class Class22 {

    /**
     * @param args the command line arguments
     */
    
    final static long num = 1000000000;
    
    public static  Thread t1 = new  Thread(new Runnable() 
    {
        @Override
        public void run() {
            
            long myFirstGuess = Math.round(Math.random() * num);
            long result = 0;
           
            while(result != myFirstGuess)
            {
                System.out.println("(T1) This is my guess " + result);
                   result++;
            }
            System.out.print("It took you ");
            System.out.printf("%,d", result);
            System.out.println(" tries to guess it");
            

        }
    });
    
    public static Thread t2 = new Thread(new Runnable() {
        @Override
        public void run() {
            
            long mySecondtGuess = Math.round(Math.random() * num);
            long result = 0;
           
            while(result != mySecondtGuess)
            {
                System.out.println("(T2) This is my guess " + result);
                   result++;
            }
            System.out.print("It took you ");
            System.out.printf("%,d", result);
            System.out.println(" tries to guess it");   
        }
    });
    
    public static void main(String[] args) 
    {   
        t1.start();
        t2.start();
    }
    
}
