/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramPeminjaman;

import java.util.Scanner;

/**
 *
 * @author ASUS X441MA
 */
public class ProgramPeminjaman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Peminjaman p1 = new Peminjaman();
        
        System.out.print("Masukkan ID : ");
        p1.id = sc.next();
        System.out.print("Masukkan Nama Peminjam : ");
        p1.member = sc.next();
        System.out.print("Masukkan Nama Game yang di sewa : ");
        p1.game = sc.next();
        System.out.print("Masukkan Harga Game yang di sewa : ");
        p1.harga = sc.nextInt();
        System.out.print("Masukkan Lama Peminjaman (hari) : ");
        p1.hari = sc.nextInt();
        
        System.out.println("Harga yang Harus "+p1.member+ " Bayar Adalah "+p1.totalPembayaran());
    }
    
}
