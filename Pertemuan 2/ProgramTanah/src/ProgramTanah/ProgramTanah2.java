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
public class ProgramTanah2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tanah t1 = new Tanah();
        t1.x = 0;
        
        System.out.print("Masukkan Jumlah Tanah : ");
        t1.jumlah = sc.nextInt();
        
        Tanah[] tArray = new Tanah[t1.jumlah];

        for (int i = 0; i < tArray.length; i++) {
            tArray[i] = new Tanah();
            
            System.out.println("tanah " + (i + 1));
            System.out.print("Masukkan Panjang : ");
            tArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan Lebar : ");
            tArray[i].lebar = sc.nextInt();
        }
        for (int i = 0; i < tArray.length; i++) {
            System.out.println("Luas Tanah " + (i + 1) + " : " + (t1.hitungLuas(tArray[i].panjang , tArray[i].lebar)));
            
        }
        t1.max = t1.hitungLuas(tArray[0].panjang , tArray[0].lebar);

		
 		for (int i = 0; i < tArray.length ; i++) {
 			if (t1.hitungLuas(tArray[i].panjang , tArray[i].lebar) > t1.max) {
 				t1.max = t1.hitungLuas(tArray[i].panjang , tArray[i].lebar);
 				t1.x = i;
 			}
 		}

 		System.out.println("Tanah terluas adalah tanah ke-" + (t1.x+1)+ " yaitu " +t1.max);
    }
}
