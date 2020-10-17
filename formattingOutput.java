/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasample;

import java.util.Date;

/**
 *
 * @author Asus
 */
public class formattingOutput 
{
    public static void main (String[]args)  
    {
        double x = 10000.0 / 3.0;
        System.out.print(x);
        System.out.printf("\n%8.2f \n",x);
        
        String name = "Giber";
        int age = 12;
        System.out.printf("Hello, %s. Next year, you'll be %d\n", name, age+1);
        
        System.out.printf("\n%.2f \n",x);
        
        String message = String.format("Hello, %s. Next year, you'll be %d", name, age+1);
        System.out.println(message);
        
        System.out.printf("%tc\n", new Date());
        System.out.printf("%1$s %2$tB %2$te, %2$tY \n", "Due date:", new Date());
        System.out.printf("%s %tB %<te, %<tY \n", "Due date:", new Date());
        
    }    
}
