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
public class Constanst2 
{
   
    public static void main(String[] args)
    {
        double jari,tinggi;
        jari = 7.0;
        tinggi = 7.0;
        lingkaran luasalas = new lingkaran(jari);
        double volume = lingkaran.luas*tinggi;
        System.out.println("Volume tabung = "+ volume);
        System.out.println("Nilai PI = "+ lingkaran.PI);
       
       
    }
        
}
    class lingkaran
    {
        public static final double PI = 3.14;
        public static double luas;
        lingkaran(double jari)
        {
            luas = PI*jari*jari;
//        System.out.println("Luas Lingkaran = "+luas);
        }
    }