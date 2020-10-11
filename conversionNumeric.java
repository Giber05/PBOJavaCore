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
public class conversionNumeric 
{
    public static void main (String[]args)
    {
        int integer = 123456789;
        float intToFloat = integer; // f is 1.23456792E8
        double intToDb = integer;
        long intToLong = integer;
        double longToDb = intToLong;
            
        System.out.println("Nilai integer = "+integer);
        System.out.println("Nilai konversi int to float = "+intToFloat);
        System.out.println("integer+float = "+(intToFloat+integer));
        System.out.printf("nilai f = %f\n",intToFloat);
        System.out.printf("nilai f+n = %f\n",intToFloat+integer);
        System.out.println("Nilai konversi int double = "+intToDb);
        System.out.println("Nilai konversi int to long = "+intToLong);
        System.out.println("Nilai konversi long to Double = "+longToDb);
    
    }
}
