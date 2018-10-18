/*
    c. Write code that displays the total length of all the strings in the array.
    “Einstein”, “Newton”, “Copernicus”, and “Kepler”.

 */
package Assignment5;




/**
 *
 * @author al
 */
public class AlgoWorkbench3C {
    
    public static void main(String []args)
    {
        String[] arr = { "Einstein", "Newton", "Copernicus", "Kepler"};
        
        int total = 0;
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
            total += arr[i].length();
        }
        System.out.println("");
        System.out.println("The total length of all strings is: " + total);
    }
    
}
