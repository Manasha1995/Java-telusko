/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop_while;

/**
 *
 * @author manas
 */
public class Loop_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //White loop
        int i = 1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
        //INFINITE LOOP
        System.out.println("//Infinite Loop - while \n\n");
        i = 1;
        while(true){
             System.out.println(i);
             i++;
        }
        
        
        
    }
    
}
