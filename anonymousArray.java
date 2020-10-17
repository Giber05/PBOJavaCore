/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasample;

import java.util.Arrays;

/**
 *
 * @author Asus
 */
public class anonymousArray
{
    public static void main(String[]args)
    {
        int [] smallPrime;
        smallPrime = new int[] { 17, 19, 23, 29, 31, 37 }; //Small prime is filled with anonym array
        
        System.out.println(Arrays.toString(smallPrime));
        
        int[] arrayInt = {0,1,3};
        System.out.println(Arrays.toString(arrayInt));
        
        arrayInt = smallPrime;
        System.out.println(Arrays.toString(arrayInt));
    }
}
