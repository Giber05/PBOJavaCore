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
public class operatorPrecedence 
{
    public static void main (String[]args)
    {
        boolean a,b,c;
        a = true;
        b = false;
        c = false;
        
        if (a && b || c)
        {
            System.out.println("it's True");
        }
        else
        {
            System.out.println("it's False");
        }
        int x,y,z;
        x = 2;
        y = 3;
        z = 4;
        System.out.println(x += y += z); // means x += (y += z)
    }
    
}
