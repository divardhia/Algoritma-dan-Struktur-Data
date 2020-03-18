/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS X441MA
 */
public class Tiket {
    String namaMaskapai;
    float harga;
    int transitCount;
    int flightTime;
    
    Tiket(String n, float h, int t, int f){
        namaMaskapai = n;
        harga = h;
        transitCount = t;
        flightTime = f;
    }
    
    void tampil(){
        System.out.println("Nama Maskapai : "+namaMaskapai);
        System.out.println("Harga : "+harga);
        System.out.println("Jumlah Transit : "+transitCount);
        System.out.println("Waktu Keberangkatan : "+flightTime);
    }
}
