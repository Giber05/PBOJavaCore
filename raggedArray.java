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
public class raggedArray 
{
    public static void main(String[] args)
	{
            int[][] ragged = new int[5][];
            for(int i=0; i<5; i++)
            {
                ragged[i] = new int[i+1];        
            }

            for(int i=0; i<5; i++)
            {

                for(int j=0; j<ragged[i].length; j++)
                {
                    System.out.println(ragged[i].length);
                    ragged[i][j] = i+1;
                }
            }

            for(int[] row : ragged)
            {
                for(int number : row)
                {
                    System.out.print(number + " ");
                }
                System.out.println();
            }
	}
}
