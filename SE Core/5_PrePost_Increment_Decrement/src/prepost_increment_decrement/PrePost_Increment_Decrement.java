/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepost_increment_decrement;

/**
 *
 * @author BNS Holdings
 */
public class PrePost_Increment_Decrement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pre Increament
        System.out.println("Pre Increament");
        int i = 5;
        int j = ++i;
        System.out.println("i = "+i+"\tj = "+j+"\n");
        
        //Post Increament
        System.out.println("Post Increament");
        i = 5;
        j = i++;
        System.out.println("i = "+i+"\tj = "+j+"\n");
        
        //i = i++;
        System.out.println("i = i++;");
        i = 5;
        i = i++;
        System.out.println("i = "+i+"\n");
        
        //i = ++i;
        System.out.println("i = ++i;");
        i = 5;
        i = ++i;
        System.out.println("i = "+i+"\n");
        
        
    }
    
}
