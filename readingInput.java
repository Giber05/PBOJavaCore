/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasample;


import java.util.Scanner;


/**
 *
 * @author Asus
 */
public class readingInput 
{
    public static void main (String[]args)  
    {
        Scanner in = new Scanner(System.in);
        
        //first input
        System.out.print("What is your name? \n");
        String name = in.nextLine();
        
        System.out.println("How old are you? \n");
        int age = in.nextInt();
 
        System.out.print("My name is "+name+"\nI'm "+age+" years old!\n");
       

    }
}
