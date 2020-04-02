/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pustakawan;

/**
 *
 * @author diva ardhia
 */
public class Pustakawan {

    String judul, ukuran;
    int jumlahHalaman;
    double tinggiBuku;

    Pustakawan(String j, int jml, String u, double tg) {
        judul = j;
        jumlahHalaman = jml;
        ukuran = u;
        tinggiBuku = tg;
    }

    void tampil() {
        System.out.println("Judul = " + judul);
        System.out.println("Jumlah Halaman = " + jumlahHalaman);
        System.out.println("Ukuran Buku = " + ukuran);
        System.out.println("Tinggi Buku = " + tinggiBuku + " cm");
    }
}
