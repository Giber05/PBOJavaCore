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
public class increDecreOps 
{
    public static void main(String[]args)
    {
        int nilai = 1;
        while(nilai != 10)
        {
            System.out.println("Nilai = "+nilai);
            nilai++;
        }
        int m = 7;
        int n = 7;
        
        int a = 2 * ++m; // Means : 2*(7+1). now a is 16, m is 8
        int b = 2 * n++; // Means 2 * 7, then 7+1 . now b is 14, n is 8
        int c = 2* n;
        
        System.out.println("a = "+a+" \tm = "+m);
        System.out.println("b = "+b+" \tn = "+n);
        System.out.println(c);
            
    }
    
}
