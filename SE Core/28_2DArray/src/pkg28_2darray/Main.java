/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg28_2darray;
import java.util.Random;

/**
 *
 * @author manas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        //METHOD 1//
        
        /*
          5,6,7,8
          6,7,8,9
          9,8,7,6
        */
        //int arr1[][] = new int[4][3];
        int arr1[][] = {{5,6,7,8},{6,7,8,9},{9,8,7,6}};
        int arr2[][] = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr2[i][j]=r.nextInt(50);
            }
        }
        for(int a[] : arr2){
            for(int b : a){
                System.out.print(b+" ");
            }
        }
    }
    
}
