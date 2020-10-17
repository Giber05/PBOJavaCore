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
public class blockScope
{
    public static void main(String[]args)
    {
        int n;
        n = 0;
        {
            int k;
             // Error--can't redefine n in inner block
            for (k = 0; k<10;k++)
                n++;
        }
        int k = n;
        System.out.println(n);
        System.out.println(k);
    }
}
