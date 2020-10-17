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
public class conditionalStatement 
{
    public static void main(String[]args)
    {
        int yourSales = 3;
        String performance;
        int bonus;
        int target = 3;
        if (yourSales >= 2 * target)
        {
            performance = "Excellent";
            bonus = 1000;
            System.out.println("Great job!!!");
        }
        else if (yourSales >= 1.5 * target)
        {
            performance = "Fine";
            bonus = 500;
            System.out.println("Good job!!!");
        }
        else if (yourSales >= target)
        {
            performance = "Satisfactory";
            bonus = 100;
            System.out.println("Keep it up!!!");
        }
        else
        {
            System.out.println("You're fired");
        }
    }
}
