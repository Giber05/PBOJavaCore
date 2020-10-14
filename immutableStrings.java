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
public class immutableStrings 
{
    public static void main(String[]args)
    {
       String string1 = "Kasur";
 
        String string2 = "Kasur";
 
        System.out.println(string1 == string2);         
 
        string1 = string1 + "Baru";
 
        System.out.println(string1 == string2);  

        String string5 = new String("Kasur");
 
        System.out.println(string5);        
 
        System.out.println(string5); 
    }
}
