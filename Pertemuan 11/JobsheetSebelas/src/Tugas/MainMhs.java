/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author diva ardhia
 */
public class MainMhs {

    public static void Menu() {
        System.out.println();
        System.out.println(" MENU ");
        System.out.println("1. Tambah");
        System.out.println("2. Cari");
        System.out.println("3. Hapus");
        System.out.println("4. Keluar");

        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListMhs mhs = new LinkedListMhs();
        Scanner sc = new Scanner(System.in);
        int pilih;
        do {
            Menu();
            System.out.print("Masukkan Pilihan Anda : ");
            pilih = sc.nextInt();
            try {
                switch (pilih) {
                    case 1:
                        System.out.println("Masukkan Data Mahasiswa");
                        System.out.print("NIM : ");
                        String nim = sc.nextLine();
                        System.out.print("Nama : ");
                        String nama = sc.next();
                        System.out.print("alamat : ");
                        String alamat = sc.next();
                        mhs.add(nim, nama, alamat);
                        break;
                    case 2:
                        System.out.print("Masukkan Index NIM yang dicari : ");
                        int cari = sc.nextInt();
                        mhs.cariIndex(cari);
                        break;
                    case 3:
                        System.out.println("Data Mahasiswa : ");
                        mhs.print();
                        System.out.print("Masukkan NIM : ");
                        String hapus = sc.next();
                        mhs.removeByValue(hapus);
                        mhs.print();
                        break;
                    case 4:
                        mhs.clear();
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}
