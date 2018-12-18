/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labled_unlabled_break;

/**
 *
 * @author manas
 */
public class Labled_unlabled_break {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //UnLabled Break
        System.out.println("====================Unlabled break===============");
        for (int i = 1; i <=5; i++) {
            for(int j = 1;j<=5;j++){
                if(i==3){
                    break;
                }
                System.out.print(" *");
            }
            System.out.print("\n");
        }
        
        //UnLabled Break
        System.out.println("====================Labled break===============");
        LabledLoop:
        for (int a = 1; a <=5; a++) {
            for(int b = 1;b<=5;b++){
                if(a==3){
                    break LabledLoop;
                }
                System.out.print(" *");
            }
            System.out.print("\n");
        }
    }
    
}
