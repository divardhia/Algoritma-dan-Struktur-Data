/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramBarang;

import java.util.Scanner;

/**
 *
 * @author ASUS X441MA
 */
public class ProgramBarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        Barang b1 = new Barang();
        b1.nama = "Corsair 2 GB";
        b1.hargaSatuan = 250000;
        System.out.println("Nama Barang : "+b1.nama);
        System.out.println("Masukkan Jumlah : "+b1.jumlah);
        b1.jumlah=sc.nextInt();
        System.out.print("Harga Satuan : "+b1.hargaSatuan);
        System.out.println();
        System.out.println("Total yang Pembayaran "+b1.hitungHargaTotal());
        System.out.println("Total Diskon : " +b1.hitungDiskon());
        System.out.println("Total yang harus di bayarkan setelah diskon Adalah "+b1.hitungHargaBayar());
    }
    
}
