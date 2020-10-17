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
public class arrayCopying 
{
    public static void main(String[]args)
    {
        int [] smallPrime = new int[] { 17, 19, 23, 29, 31, 37 };
        System.out.println("Before: smallPrime =  "+ Arrays.toString(smallPrime));
        
        int[] luckyNumbers = smallPrime;
        luckyNumbers[5] = 12; // now smallPrimes[5] is also 12
        System.out.println("luckyNumbers =  "+ Arrays.toString(luckyNumbers));
        System.out.println("After: smallPrime =  "+ Arrays.toString(smallPrime));
        
        int[] copiedLuckyNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length);
        System.out.println("\nBefore: copiedLuckyNumbers = "+ Arrays.toString(copiedLuckyNumbers));
        
        copiedLuckyNumbers[5] = 5;
        copiedLuckyNumbers[0] = 0;
        System.out.println("After: copiedLuckyNumbers  = "+ Arrays.toString(copiedLuckyNumbers));
        System.out.println("\nluckyNumbers =  "+ Arrays.toString(luckyNumbers));
        
    }
}
