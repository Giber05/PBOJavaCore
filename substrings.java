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
public class substrings 
{
    public static void main(String[]args)
    {
        String sentence = "To Infinity and Beyond";
        String word = sentence.substring(0,11);
        
        System.out.println(sentence);
        System.out.println(word);
        
        
        String a="Hello";
        String w = a.substring(0, 3);
        System.out.println(a);
        w = w +"p!";
        System.out.println(w);
        
        String s="Hello";
        System.out.println(s);
        s = s.substring(0, 3) +"p!";
        System.out.println(s);
    }
    
}
