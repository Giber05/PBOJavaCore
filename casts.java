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
public class casts {
    public static void main(String[]args)
    {
        double x = 9.997;
        int integer = (int) x;
        System.out.println(integer);
        
        integer = (int) Math.round(x);
        System.out.println(integer);
        
        integer = 200;
        byte intToByte = (byte) integer;
        System.out.println(intToByte);
        
        
    }
    
}
