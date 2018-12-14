/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shorhandoperator;

/**
 *
 * @author BNS Holdings
 */
public class ShorHandOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Incrementing Operator +=
        int i = 5;
        i+=2;
        System.out.println("// Incrementing Operator += \t i is "+ i);
        
        // Decrementing Operator -=
        i = 5;
        i-=2;
        System.out.println("// Decrementing Operator -= \t i is "+ i);
        
        // Multiplying Operator *=
        i = 5;
        i*=2;
        System.out.println("// Multiplying Operator *= \t i is "+ i);
        
        // Dividing Operator /=
        i = 6;
        i/=2;
        System.out.println("// Dividing Operator /= \t i is "+ i);
        
        // Moduling Operator /=
        i = 5;
        i%=2;
        System.out.println("// Moduling Operator %= \t i is "+ i);
    }
    
}
