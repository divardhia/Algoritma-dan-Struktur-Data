/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu2;

/**
 *
 * @author ASUS X441MA
 */
public class Barang {
    public String namaBarang, jenisBarang;
    public int stok, hargaSatuan;
    
    public Barang (String nm, String jn, int st, int hs){
        namaBarang = nm;
        jenisBarang = jn;
        stok = st;
        hargaSatuan = hs;
    }

    public Barang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void tampilBarang(){
        System.out.println("Nama = " +namaBarang);
        System.out.println("Jenis = " +jenisBarang);
        System.out.println("Stok = " +stok);
        System.out.println("Harga Satuan = " +hargaSatuan);
    }
    public void tampilBarang(String n, String j, int s, int h){
        n = namaBarang;
        j = jenisBarang;
        s = stok;
        h = hargaSatuan;
    }
    public void tambahstok (int n){
        if (stok>0){
        stok = stok + n;
        }
    }
    public void kurangstok (int n){
        if (stok>0){
        stok = stok - n;
        }
    }
    public int hitunganhargaTotal (int jumlah){
        return jumlah*hargaSatuan;
    }
}
