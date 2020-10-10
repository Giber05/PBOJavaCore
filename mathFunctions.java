/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasample;

/**
 *
 * @author Asus
 */
public class mathFunctions 
{
    public static void main(String[]args)
    {
        double x = 4.0;
        double y = Math.sqrt(x);
        System.out.println("root of "+x+"= "+y);
        System.out.println("pow of "+x+"= "+ Math.pow(x, 2.0));
        
        double sudut;
        sudut = 0.523599;   //sudut = 30 derajat

        double degrees= Math.toDegrees(0.523599);
        System.out.printf("nilai dari 0.523599 rad = %.0f\n",degrees);
       
        System.out.println("Sin 30 = " +Math.sin(sudut));
        System.out.println("Cos 30 = "+ Math.cos(sudut));
        System.out.println("Tan 30 = " + Math.tan(sudut));
        
        
        double z = Math.toRadians(60.0);
        System.out.printf("Nilai dari Cos 60 = %.10f\n", Math.cos(z));       
        System.out.printf("Nilai dari Sin 60 = %.10f\n", Math.sin(z)); 
        System.out.printf("Nilai dari Tan 60 = %.10f\n", Math.tan(z));     

       
       
        System.out.println("Nilai PI = " + Math.PI);
        System.out.println("Exp 100 = " + Math.exp(100));    
    
        System.out.println("Log 20= " + Math.log(20));    
        System.out.println("Log10 1000= " + Math.log10(1000));       
        
        System.out.println("floorMod(5, 2) = " + Math.floorMod(5, 2));
        System.out.println("(5 % 2) = " + 5 % 2);
        System.out.println("floorMod(+5, -2) = " + Math.floorMod(+5, -2));
        System.out.println("(+5 % -2) = " + +5 % -2);

    }
    
}
