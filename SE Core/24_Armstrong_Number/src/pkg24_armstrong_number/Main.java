/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg24_armstrong_number;

/**
 *
 * @author manas
 */

import java.util.Scanner;

public class Main {
    /**
     * @param args the command line arguments
     */
    public static int cube(int n){
        return n*n*n;
    }
    public static void main(String[] args) {
        // Armstrong Number
        int number , copy,sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        number = s.nextInt();
        copy = number;
        
        while(copy!=0){
            sum = sum + (cube(copy%10));
            copy/=10;
        }
        
        if(number == sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
        
    }
    
}
