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
public class stringAPI 
{
    public static void main (String[]args)
    {
        String word ="Nightmare";
        String word2 = "Oversleep";
        String word3 = "Oversleeps";
        
        System.out.println(word.offsetByCodePoints(0, 5));
        System.out.println(word.compareTo(word2));
        System.out.println(word3.compareTo(word));
        System.out.println(word.startsWith("N"));
        System.out.println(word3.startsWith(word2));
        System.out.println(word.endsWith("N"));
        
        System.out.println("Index of 't' in Nightmare is " +word.indexOf("t"));
        System.out.println("Index of 'r' in word after 15th char:" + word.indexOf('r', 15));
        System.out.println(word.lastIndexOf("r"));
        
        System.out.println("GIBER".toLowerCase());
        System.out.println("giber".toUpperCase());
        
      
    }
}
