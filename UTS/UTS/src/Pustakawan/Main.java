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
        DaftarBuku data = new DaftarBuku();
        Pustakawan[] b = new Pustakawan[4];
        
        b[0] = new Pustakawan("Introduction to Algorithms", 1292, "B5", 25);
        b[1] = new Pustakawan("Essentials of Computer Architecture", 400, "A4", 29.7);
        b[2] = new Pustakawan("A Life out of Sequence â€” A Data Driven History of Bioinformatics ", 294, "B3", 50);
        b[3] = new Pustakawan("Engineering a Compiler 2nd Ed", 824, "B5", 25);
        
        for (int i = 0; i < 4; i++) {
            data.tambah(b[i]);
        }
        System.out.println("Data Buku sebelum Sorting");
        System.out.println("---------------------------------------------------------------------------");
        data.tampil();
        System.out.println();
        
        System.out.println("Data Buku setelah sorting");
        System.out.println("---------------------------------------------------------------------------");
        data.bubbleSort();
        data.tampil();
        
        System.out.print("Masukkan tinggi buku yang dicari : ");
        double cari = s.nextDouble();
        data.dataSama(cari);
        int posisi = data.FindBinarySearch(cari, 0, 3);
        data.Tampilposisi(cari, posisi);
    }
}
