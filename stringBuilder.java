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
public class stringBuilder 
{
    public static void main (String[]args)
    {
        String string = "Hallo";
        StringBuilder builder = new StringBuilder();
        builder.append(string); // appends a string
        builder.append("!");
        builder.appendCodePoint(200);
        builder.insert(1, "aaa");
        builder.delete(5, 10);
        
        
        String completedString = builder.toString();
        System.out.println(completedString);
    }
}
