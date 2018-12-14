/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelse_condition;

/**
 *
 * @author BNS Holdings
 */
public class IfElse_Condition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int age = -12;
       if(age<0){
           System.out.println("Wrong age. Check again!!");
       }else if(age==0){
           System.out.println("Unborn");
       }else if(age<18){
           System.out.println("Kid");
       }else if(age==18){
           System.out.println("18");
       }else{
           System.out.println("Adult");
       }
    }
    
}
