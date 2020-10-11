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
public class bitwiseOps 
{
    public static void main(String[]args)
    {
        int n = 8;
        int fourthBitFromRight = (n & 0b1000) / 0b1000;
        System.out.println(fourthBitFromRight);
        
        System.out.println(~1); // "not" operation, ~1 = -2
        System.out.println(1 << 3); // left shift 3 step, 1 << 3 = 8, Means: 0001 <<3 = 1000
        fourthBitFromRight = (n & (1 << 3)) >> 3;
        System.out.println(fourthBitFromRight);
    }
}
