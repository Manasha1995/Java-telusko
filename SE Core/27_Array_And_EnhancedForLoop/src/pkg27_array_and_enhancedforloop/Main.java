/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg27_array_and_enhancedforloop;
import java.util.Scanner;
/**
 *
 * @author manas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Creating Array of integers
        int arr[]= new int[5];
        
        //entering values to the array
        System.out.println("Enter 5 numbers to he Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        
        //Displaying Array using typical for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        //Displaying Array using Enhanced for loop
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    
}
