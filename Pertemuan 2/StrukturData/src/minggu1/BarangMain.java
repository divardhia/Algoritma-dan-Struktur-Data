/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu1;

import minggu2.Barang;

/**
 *
 * @author ASUS X441MA
 */
public class BarangMain {
    public static void main(String[] args) {
        Barang b1 = new Barang();
        b1.namaBarang = "Corsair 2 GB";
        b1.jenisBarang = "DDR";
        b1.stok = 10;
        b1.hargaSatuan = 250000;
        b1.tambahstok(1);
        b1.kurangstok(3);
        b1.tampilBarang();
        int hargaTotal=b1.hitunganhargaTotal(4);
        System.out.println("Harga 4 buah = " +hargaTotal);
        
        Barang b2 = new Barang ("Logitech", "Wireless Mouse", 25, 150000);
        b2.tampilBarang();
        
        Barang b3 = new Barang ("Canon", "Kamera DSLR", 1, 20000000);
        b3.tampilBarang();
        
    }
}
