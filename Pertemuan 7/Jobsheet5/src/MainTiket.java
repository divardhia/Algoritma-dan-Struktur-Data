
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS X441MA
 */
public class MainTiket {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        Scanner s1 = new Scanner (System.in);
        DaftarHargaTiket data = new DaftarHargaTiket();
        int jumMaskapai = 3;
        
        for (int i=0; i<jumMaskapai; i++){
            System.out.print("Nama Maskapai : ");
            String nama = s1.nextLine();
            System.out.print("Harga : ");
            float har = s.nextFloat();
            System.out.print("Jumlah Transit : ");
            int transit = s.nextInt();
            System.out.print("Waktu Keberangkatan : ");
            int waktu = s.nextInt();
            System.out.println();
            
            Tiket m = new Tiket(nama, har, transit, waktu);
            data.tambah(m);
        }
        
        System.out.println("Data Pesawat sebelum Sorting = ");
        data.tampil();
        System.out.println();
        
        System.out.println("Data Pesawat setelah Bubble sort berdasarkan harga");
        data.bubbleSort();
        data.tampil();
        System.out.println();
        
        System.out.println("Data Pesawat setelah selection sort berdasarkan harga");
        data.selectionSort();
        data.tampil();
        System.out.println();
    }
}
