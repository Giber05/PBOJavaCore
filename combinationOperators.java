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
public class combinationOperators {
    public static void main(String[]args)
    {
        int x = 0;
        int y = 1;
        for(int i = 1; i<=10; i++)
        {
            x += 2;
            y *= x;
            System.out.println("Nilai dari x"+i+" = "+x);  
            System.out.println("Nilai dari y"+i+" = "+y);
            System.out.printf("\n");
        }
        
    }
    
}
