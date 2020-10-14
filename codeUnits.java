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
public class codeUnits 
{
    public static void main(String[]args)
    {
        String greeting = "Hello";
        int n = greeting.length(); // is 5.
        System.out.println(n);
        
        int cpCount = greeting.codePointCount(0, greeting.length());
        System.out.println(cpCount);
        
        char  first = greeting.charAt(0); // first is 'H'
        System.out.println(first);
        char last = greeting.charAt(4); // last is 'o'
        System.out.println(last);
        
        int index = greeting.offsetByCodePoints(0, 4);
        int cp = greeting.codePointAt(index);
        System.out.println(index);
        System.out.println(cp);
        
        
        int[] codePoints = greeting.codePoints().toArray();
        for(int i=0; i<codePoints.length; i++)
		{
			System.out.print(codePoints[i] + " ");
		}	
        String str = new String(codePoints, 0, codePoints.length);
        System.out.println("\n" + str);

    }
}
