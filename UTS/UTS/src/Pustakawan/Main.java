/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pustakawan;

import java.util.Scanner;

/**
 *
 * @author HP 14-BW005AU
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        Scanner s1 = new Scanner (System.in);
        
        int jumBuku = 4;
        DaftarBuku data = new DaftarBuku();
  
        for(int i=0; i<jumBuku; i++){
            System.out.print("Judul = ");
            String judul = s1.nextLine();
            System.out.print("Jumlah Halaman = ");
            int jum = s.nextInt();
            System.out.print("Tinggi Buku = ");
            double tinggi = s.nextDouble();
            System.out.println();
            
            Pustakawan b = new Pustakawan(judul, jum, tinggi);
            data.tambah(b);
        }
        System.out.println("Data Mahasiswa sebelum Sorting");
        data.tampil();
        System.out.println();
        
        System.out.println("Data Mahasiswa setelah sorting");
        data.bubbleSort();
        data.tampil();
        System.out.println();
        
        System.out.print("Masukkan tinggi yang dicari : ");
        int cari = s.nextInt();
       
        //System.out.println("Menggunakan binary search");
        //posisi = data.FindBinarySearch(cari, 0, jum.length - 1);
        //data.Tampilpoisisi(cari, posisi);
        
        
    }
}
