/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator_classandobjcts;

/**
 *
 * @author manas
 */
class Calc{
    int num1;
    int num2;
    int result;
    
    public void perform(){
        result = num1 + num2;
    }
}
public class Calculator_ClassAndObjcts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.num1 = 2;
        obj.num2 = 3;
        obj.perform(); 
        System.out.println(obj.result);
    }
    
}
