/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg22_pattern_palindrom_or_not;
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
        Scanner scan = new Scanner(System.in);
        System.out.println("Entern a numner");
        int original =scan.nextInt();
        //System.out.println(original);
        int copy = original;
        int rem = 0;
        
        while(copy!=0){
            rem = rem*10;
            rem = rem+ (copy%10);
            //System.out.println("Rem: "+rem);
            copy/=10;
            //System.out.println("Copy: "+copy+"\n");
        }
        
        System.out.println("Rem: "+rem+" and original "+ original);
        if(rem == original){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not a Palindrom");
        }
    }
    
}
