/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package continue_break_statements;

/**
 *
 * @author manas
 */
public class Continue_Break_statements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Continue
        for (int i = 0; i < 10; i++) {
            if(i==4){
                continue;
            }
            System.out.println("Number is "+i);
        }
        System.out.println("\n\n\n");
        //Break
        for (int i = 0; i < 10; i++) {
            if(i==4){
                break;
            }
            System.out.println("Number is "+i);
        }
        
    }
    
}
