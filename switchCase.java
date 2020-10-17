/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasample;

import java.util.*;

/**
 *
 * @author Asus
 */
public class switchCase 
{
    public static void main(String[]args)
    {
        
        for(;;)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("\n1.Name\n2.Age\n3.Address\n4.Departement\nSelect an option (1, 2, 3, 4) ");
            int choice = in.nextInt();
       
            switch (choice)
            {
                case 1:
                    System.out.println("Name: Giber");
                
                    break;
                case 2:
                    System.out.println("Age: 10");
                    break;
                case 3:
                    System.out.println("Address: Subang");
               
                    break;
                case 4:
                    System.out.println("Department: JTK");
                break;
                default:
                    System.exit(0);
               
                break;
            }
        }
    }
}
