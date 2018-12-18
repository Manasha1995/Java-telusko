/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg29_jagged_array;

/**
 *
 * @author manas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        5,6,7,8
        6,7
        9,8,7,6
        */
        int arr[][] = new int[3][];
        arr[0] = new int[4];
        arr[1] = new int[2];
        arr[2] = new int[3];
        
        int arr2[][] = {{5,6,7,8},{6,7},{9,8,7,6}};
        for(int a[] : arr2){
            for(int b : a){
                System.out.print(b+" ");
            }
        }
    }
    
}
