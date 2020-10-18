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
public class arraySorting 
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw? ");
        int k = in.nextInt();

        System.out.print("What is the highest number you can draw? ");
        int n = in.nextInt();
         // fill an array with numbers 1 2 3 . . . n
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++)
         numbers[i] = i + 1;

        // draw k numbers and put them into a second array
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++)
        {
            // make a random index between 0 and n - 1
            int r = (int) (Math.random() * n);
            System.out.printf("r =%d\t",r);
        
            // pick the element at the random location
            result[i] = numbers[r];

            // move the last element into the random location
            numbers[r] = numbers[n - 1];
            n--;
        }
        System.out.println("Before Sorted:");
        for (int r : result)
        System.out.println(r);
        // print the sorted array
        Arrays.sort(result);
        System.out.println("After Sorted:");
        System.out.println(Arrays.toString(result));
     }
        
            
}
