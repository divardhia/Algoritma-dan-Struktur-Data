/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasdua;

/**
 *
 * @author ASUS X441MA
 */
public class bungabank {
    public static void main(String[] args) {
        double bunga=0.02;
        double hasil;
        int i=0;
        for (int saldo = 1000000; saldo<=1500000; saldo+=hasil){
            hasil = saldo*bunga;
            i++;
        }
        System.out.println("Saldo anda bulan ini adalah Rp 1.000.000,00");
        System.out.println();
        System.out.println("Anda mendapat bunga 2% setiap bulannya");
        System.out.println();
        System.out.println("Maka pada bulan ke- "+i+" saldo nasabah tersebut mencapai Rp 1.500.000,00");
        System.out.println();
    }
}
