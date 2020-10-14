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
public class nullString 
{
    public static void main(String[]args)
    {
        String word = "";
        if (word.length() == 0 && word.equals(""))
        {
            System.out.println("Empty");
        }
        
        word = "Available";
        if (word != null && word.length() != 0)
        {
            System.out.println("Exist");
        }

    }
}
