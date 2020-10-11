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
public class concatenation 
{
    public static void main(String[]args)
    {
        String expletive = "Expletive";
        String PG13 = "deleted";
        String message = expletive + PG13;
        System.out.println(message);
        
        int age = 13;
        String rating = "PG"+age;
        System.out.println("The rating is "+rating);
        
        String all = String.join(" / ", "S", "M", "L", "XL");
 // all is the string "S / M / L / XL"
        System.out.println(all);
    }
}
