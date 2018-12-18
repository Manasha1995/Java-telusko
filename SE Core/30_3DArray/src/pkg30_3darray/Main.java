/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg30_3darray;
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
        // TODO code application logic here
        Random r = new Random();
        int arr1[][][] = new int[4][4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    arr1[i][j][k] = r.nextInt(10);
                }
            }
        }
        
        for(int a[][] : arr1){
            for(int b[] : a){
                for(int c : b){
                    System.out.print(c+" ");
                }
            }
        }
    }
    
}
