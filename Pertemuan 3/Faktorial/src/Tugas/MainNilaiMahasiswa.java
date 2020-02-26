/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author ASUS X441MA
 */
public class MainNilaiMahasiswa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        NilaiMahasiswa[] mhs = new NilaiMahasiswa[50];
        NilaiMahasiswa m1 = new NilaiMahasiswa();

        System.out.print("Masukkan jumlah Mahasiswa : ");
        m1.jumlah = sc.nextInt();
        for (int i = 0; i < m1.jumlah; i++) {
            mhs[i] = new NilaiMahasiswa();
            
            System.out.println();
            System.out.print("Masukkan Nama Mahasiswa : ");
            mhs[i].namaMhs = sc.next();
            System.out.print("Masukkan Nilai Tugas : ");
            mhs[i].nilaiTugas = sc.nextInt();
            System.out.print("Masukkan Nilai Kuis : ");
            mhs[i].nilaiKuis = sc.nextInt();
            System.out.print("Masukkan Nilai UTS : ");
            mhs[i].nilaiUAS = sc.nextInt();
            System.out.print("Masukkan Nilai UAS :");
            mhs[i].nilaiUAS = sc.nextInt();
            System.out.println("Total Nilai Mahasiswa = " + mhs[i].hitungTotalNilai());
            
            m1.total +=mhs[i].hitungTotalNilai();
        }
         double total = m1.total / m1.jumlah;
         System.out.println();
         System.out.println("Rata - Rata nilai Total Mahasiswa Adalah "+total);
    }
}
