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
public class enumeratedType {
    
    public static void main(String[] args)
    {
        enum Size { SMALL, MEDIUM, LARGE, EXTRA_LARGE };
        
        Size s = Size.MEDIUM;
        Size m = Size.MEDIUM;
        Size l = Size.LARGE;
        Size xl = Size.EXTRA_LARGE;
        
        
        System.out.println(s);
        System.out.println(m);
        System.out.println(l);
        System.out.println(xl);
    }


    
}
