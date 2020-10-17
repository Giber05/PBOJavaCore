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
public class breakFlow 
{
    public static void main (String[]args)
    {
        int maksnumber = 50;
        for (int i = 0; i< 100; i++)
        {
            if (i == maksnumber)
            {
                System.out.println(i);
                break;
            }
            else 
            {
                if (i % 2 == 0) continue;
                
                System.out.println(i);
                     
            }
        }
    }
}
