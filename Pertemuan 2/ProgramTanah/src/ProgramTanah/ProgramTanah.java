/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramTanah;

import java.util.Scanner;

/**
 *
 * @author ASUS X441MA
 */
public class ProgramTanah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Tanah[] tArray = new Tanah[20];
        Tanah t1 = new Tanah();
        System.out.print("Masukkan Jumlah Tanah : ");
        t1.jumlah = sc.nextInt();

        for (int i = 0; i < t1.jumlah; i++) {
            tArray[i] = new Tanah();
            System.out.println("tanah " + (i + 1));
            System.out.print("Masukkan Panjang : ");
            tArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan Lebar : ");
            tArray[i].lebar = sc.nextInt();
        }
        for (int i = 0; i < t1.jumlah; i++) {
            System.out.println("Luas Tanah "+(i+1)+ " : " +tArray[i].hitungLuas());
        }
    }

}
