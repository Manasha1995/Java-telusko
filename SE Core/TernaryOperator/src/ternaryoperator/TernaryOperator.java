/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ternaryoperator;

/**
 *
 * @author manas
 */
public class TernaryOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //IF - ELSE
        int i = 1;
        int j = 10;
        
        if(i==1){
            j=11;
        }else{
            j = 9;
        }
        System.out.println(j);
        
        
        //TERNARY OPERATOR
        int a = 1;
        int b = 10;
        
        b = ((a==2)?b+=1:b+-1);
        System.out.println(b);
    }
    
}
