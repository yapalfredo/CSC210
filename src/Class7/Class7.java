/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class7;

/**
 *
 * @author al
 */
public class Class7 {

    public static void main(String[] args) {

        init();

    }

    public static void init() {
        final int SIZE = 3;
        int a[] = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            a[i] = i + 1;
        }

        System.out.println("The values in the array are: ");

        System.out.println("");

        for (int i = 0; i < SIZE; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("");
        System.out.println("The sum of the elements is: " + sumOfElements(a, SIZE));
        System.out.println("");
        System.out.println("The average of the elements is: " + averageOfElements(a, SIZE));
        System.out.println("");
        System.out.println("The standard deviation is: " + standardDeviation(a, SIZE));
        System.out.println("");

    }

    public static int sumOfElements(int[] a, int SIZE) {
        int result = 0;

        for (int i = 0; i < SIZE; i++) {
            result += a[i];
        }

        return result;

    }

    public static double averageOfElements(int[] a, int SIZE) {

        return (double) sumOfElements(a, SIZE) / (double) SIZE;
    }

    public static double standardDeviation(int[] a, int SIZE) {

        double summation = 0;
        double stdDev = 0;

        for (int i = 0; i < SIZE; i++) {
            summation += Math.pow(a[i] - averageOfElements(a, SIZE), 2);
        }
        stdDev = Math.sqrt(summation * ((double) 1 / (double) SIZE));

        return stdDev;
    }
}
