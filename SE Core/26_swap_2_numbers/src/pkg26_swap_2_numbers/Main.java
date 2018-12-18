/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg26_swap_2_numbers;

/**
 *
 * @author manas
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //=======Swapping 2 Numbers - METHOD 1===============
        int num1,num2,temp;
        Scanner s  = new Scanner(System.in);
        /*
        System.out.println("//=======Swapping 2 Numbers - METHOD 1===============");
        System.out.println("Enter Number 1");
        num1 = s.nextInt();
        System.out.println("Enter Number 2");
        num2 = s.nextInt();
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Number 1 \t : \t"+num1);
        System.out.println("Number 2 \t : \t"+num2);*/
        
        //=======Swapping 2 Numbers - METHOD 2===============
        System.out.println("//=======Swapping 2 Numbers - METHOD 2 - NO TEMP===============");
        System.out.println("Enter Number 1");
        num1 = s.nextInt();
        System.out.println("Enter Number 2");
        num2 = s.nextInt();
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        
        System.out.println("Number 1 \t : \t"+num1);
        System.out.println("Number 2 \t : \t"+num2);
    }
    
}
