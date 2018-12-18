/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starpatern1;

/**
 *
 * @author manas
 */
public class StarPatern1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
            * * * * *
            * * * * *
            * * * * *
            * * * * *
            * * * * *
        */
        for(int i = 1 ; i<=5 ; i++){
            for(int j= 1;j<=5;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println("\n\n");
        
        
        /*
            *
            * *
            * * *
            * * * *
            * * * * *
        */
        for(int a = 1;a<=5;a++){
            for(int b =1 ;b<=a;b++ ){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println("\n \n");
        
        
        /*
            * * * * *
            * * * *
            * * *
            * *
            *
        */
        for(int x=5;x>=1;x--){
            for(int y=1;y<=x;y++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    
}
