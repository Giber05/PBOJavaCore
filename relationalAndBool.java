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
public class relationalAndBool 
{
    public static void main (String[]args)
    {
        int nilai1 = 0;
        int nilai2 = 10;
        int nilai3 = 20;
        
        if( nilai1 == nilai2)
        {
            System.out.println("nilainya sama!");
        }
        else
        {
            System.out.println("nilainya beda!");
        }
        
        if(nilai3 > nilai1 && nilai3 > nilai2)
        {
             System.out.println("nilainya terbesar adalah "+nilai3);
        }
        
        String s = (nilai3<10)?"life" : (nilai3>20)?"die" : "gone";
        System.out.println(s);
    }
    
}
