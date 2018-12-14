/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitwise_and_or;

/**
 *
 * @author BNS Holdings
 */
public class Bitwise_AND_OR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=================BITWISE AND==================");// AND
        int i = 5;          //  0   1   0   1
        int j = 10;         //  1   0   1   0
        int sum = i&j;      //  0   0   0   0     
        System.out.println("AND \t sum is "+sum);      //0
        
        i = 5;          //  0   1   0   1
        j = 11;         //  1   0   1   1
        sum = i&j;      //  0   0   0   1     
        System.out.println("AND \t sum is "+sum);      //1
        
        i = 7;          //  0   1   1   1
        j = 11;         //  1   0   1   1
        sum = i&j;      //  0   0   1   1     
        System.out.println("AND \t sum is "+sum);      //3
        
        System.out.println("=================BITWISE OR==================");// AND
        i = 5;          //  0   1   0   1
        j = 10;         //  1   0   1   0
        sum = i|j;      //  1   1   1   1     
        System.out.println("OR \t sum is "+sum);      //15
        
        i = 1;          //  0   0   0   1
        j = 9;         //   1   0   0   1
        sum = i|j;      //  1   0   0   1     
        System.out.println("OR \t sum is "+sum);      //9
        
        i = 3;          //  0   0   1   1
        j = 11;         //  1   0   1   1
        sum = i|j;      //  1   0   1   1     
        System.out.println("OR \t sum is "+sum);      //11
        
        
        
        
    }
    
}
