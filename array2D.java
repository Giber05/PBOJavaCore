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
public class array2D 
{
    public static void main(String[]args)
    {
        
    
    int[][] twoDArray = new int[3][3];
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            Scanner in = new Scanner(System.in);
            System.out.printf("Input element [%d][%d] = ",i,j);
            twoDArray[i][j] = in.nextInt();
            
        }
    }
    for(int[] row : twoDArray){
        for(int value : row)
        {
            System.out.print((value+1) + " ");
        }
            System.out.println();
    }
    System.out.println(Arrays.deepToString(twoDArray));

    }
}