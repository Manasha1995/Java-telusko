
package pkg23_perfect_number;

/**
 *
 * @author manas
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the number");
        int number = s.nextInt();
        
        for(int i = 1;i<=(number/2);i++){
            if(number%i == 0){
                sum = sum + i;
            }
        }
        
        if(sum == number){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not a Perfect Number");
        }
    }
    
}
