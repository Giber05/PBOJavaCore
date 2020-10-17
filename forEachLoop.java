/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasample;

import java.util.Arrays;

/**
 *
 * @author Asus
 */
public class forEachLoop 
{
    public static void main(String[]args)
    {
        int[] a = new int[20];
        for (int i = 0; i < 20; i++)
             a[i] = i; // fills the array with numbers 0 to 99
        
        for(int element : a)
        {
            System.out.println(element);
        }
        
        System.out.println();
        System.out.println(Arrays.toString(a));
    }
}
