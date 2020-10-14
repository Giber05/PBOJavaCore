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
public class equalStrings 
{
    public static void main(String[]args)
    {
        String greeting = "Sampurasun!";
        String hello = "Hello";
        
        System.out.println(greeting.equals(hello));
        System.out.println("Sampurasun!".equals(greeting));
        
        System.out.println("hello".equalsIgnoreCase(hello));
        
        
        if (greeting == "Sampurasun!")  // probably true
        {
            System.out.println("yes");
        }
        if (greeting.substring(0, 3) == "Sam")  // probably false
        {
             System.out.println("no");
        } 
        if (greeting.compareTo("Sampurasun!") == 0)
        {
            System.out.println("SAMA");
        }
    }
}
