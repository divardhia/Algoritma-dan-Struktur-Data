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
    String judul;
    int jumlahHalaman;
    double tinggiBuku;
    
    Pustakawan (String j, int jml, double tg){
        judul = j;
        jumlahHalaman = jml;
        tinggiBuku = tg;
    }
    void tampil(){
        System.out.println("judul = "+judul);
        System.out.println("Jumlah Halaman = "+jumlahHalaman);
        System.out.println("Tinggi Buku = "+tinggiBuku);
    }
}
