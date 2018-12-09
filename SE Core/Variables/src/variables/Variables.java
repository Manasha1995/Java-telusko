/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author BNS Holdings
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 10;
        float f = 10;
        double d = 10;
        
        //int 12 = 5.5;
        float f2 = 5.5f;
        double d2 = 5.5;
        
        /*---------------- ADDING 2 INTEGER NUMBERS----------------*/
        int i3 = 10 ; 
        int i4 = 12;
        System.out.println("/*---------------- ADDING 2 INTEGER NUMBERS----------------*/");
        System.out.println("Sum of "+i3+" and "+i4+" is "+(i3+i4));
        System.out.printf("Sum of %d and %d is %d \n\n",i3,i4,(i3+i4));
        
        
        /*---------------- ADDING 2 FLOAT NUMBERS----------------*/
        float f3 = 5.5f;
        float f4 = 10.5f;
        System.out.println("/*---------------- ADDING 2 FLOAT NUMBERS----------------*/");
        System.out.println("Sum of "+f3+" and "+f4+" is "+(f3+f4));
        System.out.printf("Sum of %f and %f is %f \n",f3,f4,(f3+f4));
        System.out.printf("Sum of %.2f and %.2f is %.2f \n\n",f3,f4,(f3+f4));
        
        /*---------------- ADDING 2 DOUBLE NUMBERS----------------*/
        double d3 = 10.5;
        double d4 = 15.6;
        System.out.println("/*---------------- ADDING 2 DOUBLE NUMBERS----------------*/");
        System.out.println("Sum of "+d3+" and "+d4+" is "+(d3+d4));
        System.out.printf("Sum of %f and %f is %f\n",d3,d4,(d3+d4));
        System.out.printf("Sum of %.2f and %.2f is %.2f\n\n",d3,d4,(d3+d4));
        
        /*---------------- ADDING INT AND FLOAT NUMBERS----------------*/
        int i5 = 10;
        float f5 = 10;
        System.out.println("/*---------------- ADDING INT AND FLOAT NUMBERS----------------*/");
        System.out.println("Sum of "+i5+" and "+f5+" is "+(i5+f5));
        System.out.printf("Sum of %d and %.0f is %.0f\n",i5,f5,((float)i5+f5));
        System.out.printf("Sum of %d and %d is %d\n\n",i5,(int)f5,(int)(i5+f5));
        
        
        /*---------------- ADDING INT AND DOUBLE NUMBERS----------------*/
        int i6 = 10;
        double d6 = 10.6;
        System.out.println("/*---------------- ADDING INT AND DOUBLE NUMBERS----------------*/");
        System.out.printf("Sum of %d and %f is %f\n",i6,d6,(i6+d6));
        System.out.printf("Sum of %d and %.2f is %.2f\n",i6,d6,(i6+d6));
        System.out.printf("Sum of %d and %d is %d\n\n",i6,(int)d6,(int)(i6+d6));
        
        /*---------------- ADDING DOUBLE AND FLOAT NUMBERS----------------*/
        double d7 = 10.5;
        float f7 = 10.25f;
        System.out.println("/*---------------- ADDING DOUBLE AND FLOAT NUMBERS----------------*/");
        System.out.println("Sum of "+d7+" and "+f7+" is "+(d7+f7));
        System.out.printf("Sum of %f and %f is %f\n\n",d7,f7,(d7+f7));

    }
    
}
