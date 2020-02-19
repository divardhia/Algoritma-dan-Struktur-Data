/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramBarang;

/**
 *
 * @author ASUS X441MA
 */
public class Barang {

    String nama;
    int hargaSatuan, jumlah;

    public int hitungHargaTotal() {
        return hargaSatuan * jumlah;
    }

    public int hitungDiskon() {
        if (hitungHargaTotal()>100000) {
            return hitungHargaTotal() - (10/100 * hitungHargaTotal());
        }
        else if (hitungHargaTotal()>=50000 || hitungHargaTotal()<=100000){
            return hitungHargaTotal() - (5/100 * hitungHargaTotal());
        }
        else {
            System.out.println("Maaf Anda tidak Mendapatkan diskon apapun");
        }
        return 0;
    }

    public int hitungHargaBayar() {
        return hitungHargaTotal() - hitungDiskon();
    }
}
