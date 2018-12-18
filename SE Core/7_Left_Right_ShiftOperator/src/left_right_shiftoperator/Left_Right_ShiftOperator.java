/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package left_right_shiftoperator;

/**
 *
 * @author BNS Holdings
 */
public class Left_Right_ShiftOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //LEFT SHIFT
        System.out.print("Left Shift \t\t");
        int i = 8;      //  1   0   0   0           =  8
        int j = i<<2;   //  1   0   0   0   0   0   = 32
        System.out.println(j);
        
        
        //RIGHT SHIFT
        System.out.print("Left Shift \t\t");
        i = 8;      //  1   0   0   0           =  8
        j = i>>2;   //  1   0                   = 32
        System.out.println(j);
    }
    
}
