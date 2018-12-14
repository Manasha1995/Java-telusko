/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package switchcase;
import java.util.Scanner;
/**
 *
 * @author manas
 */
public class SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Grading System
        System.out.println("Enter A , B ,C or W for the grading");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.nextLine();
        
        switch (grade){
            case "A":
                System.out.println("Excellent Pass");
                break;
            case "B":
                System.out.println("Very Good Pass");
                break;
            case "C":
                System.out.println("Good Pass");
                break;
            case "W":
                System.out.println("You Idiot");
                break;
            default:
                System.out.println("Invalid Grading input");
        }
       
    }
    
}
