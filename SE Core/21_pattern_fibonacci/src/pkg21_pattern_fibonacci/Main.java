/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21_pattern_fibonacci;

/**
 *
 * @author manas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Fibonacci Pattern
        // 1,1,2,3,5,8,13,21,....n
        
        int i=1,j=1,k=0;
        System.out.print("1 1 ");
        while(k<100){
            k = i+j;
            System.out.print(" "+k);
            i = j;
            j = k;
            k++;
        }}
    
}
