/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charandstring;

/**
 *
 * @author BNS Holdings
 */
public class CharAndString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Printing simple alphabet
        System.out.println("Printing simple alphabet");
        for(int i=65;i<=90;i++){
            System.out.print((char)i+" ");
        }
        
        System.out.print("\n\n");
        
        // Printing capital alphabet
        System.out.println("Printing capital alphabet");
        for(int i=97;i<=122;i++){
            System.out.print((char)i+" ");
        }
        
        System.out.print("\n\n");
        
        // Printing Symbols
        System.out.println("Printing Symbols");
        for(int i=32;i<=47;i++){
            System.out.print((char)i+" ");
        }
        for(int i=58;i<=64;i++){
            System.out.print((char)i+" ");
        }
        for(int i=91;i<=96;i++){
            System.out.print((char)i+" ");
        }
        for(int i=123;i<=127;i++){
            System.out.print((char)i+" ");
        }
        
        System.out.print("\n\n");
        
        // Printing Numbers
        System.out.println("Printing Numbers");
        for(int i=48;i<=57;i++){
            System.out.print((char)i+" ");
        }
        
        System.out.print("\n\n");
    }
    
}
