/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg25_prime_number;

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
        // TODO code application logic here
        
        int number;
        boolean isPrime = true;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        number = s.nextInt();
        for(int i = 2; i<=number/2;i++){
            if(number%i==0){
                isPrime = false;
            }
        }
        if(isPrime==true){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }
    }
    
}
