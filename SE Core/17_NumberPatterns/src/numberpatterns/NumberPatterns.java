/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberpatterns;

/**
 *
 * @author manas
 */
public class NumberPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
        */
        for(int i = 1;i<=5;i++){
            for(int j =1;j<=5;j++){
                System.out.print(" "+j);
            }
            System.out.print("\n");
        }
        System.out.println("\n\n");
        
        
        /*
            1 2 3 4
            2 3 4 1
            3 4 1 2
            4 1 2 3
        */
        for(int x = 1;x<=4;x++){
            for(int y=1;y<=4;y++){
                if((x+y-1)>4)
                    System.out.print(" "+(x+y-1-4));
                else
                    System.out.print(" "+(x+y-1));
            }
            System.out.println("");
        }
        System.out.println("\n \n");
        
        /*
            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
        */
        for(int a = 1;a<=5;a++){
            for(int b = 1;b<=a;b++){
                System.out.print(" "+b);
            }
            System.out.println("");
        }
        System.out.println("\n \n");
        
        /*
        A
        A B 
        A B C
        A B C D
        */
        for (int m = 65; m<69; m++) {
            for(int n = 65;n<=m;n++){
                System.out.print(" "+(char)n);
            }
            System.out.println(" ");
        }
        System.out.println("\n \n");
        
        /*
        $ $ $ $
        $     $
        $     $
        $ $ $ $
        */
        
        for (int p = 1; p <=4; p++) {
            for (int q = 1; q <= 4; q++) {
                if(p==1||p==4){
                    System.out.print(" $");
                }else{
                    if(q==1||q==4){
                        System.out.print(" $");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println(" ");
        }
    }
    
}
