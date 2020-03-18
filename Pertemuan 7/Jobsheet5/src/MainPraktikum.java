
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
public class MainPraktikum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        DaftarMahasiswaBerprestasi data = new DaftarMahasiswaBerprestasi();
        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.print("Nama = ");
            String nama = s1.nextLine();
            System.out.print("Thn masuk = ");
            int thn = s.nextInt();
            System.out.print("Umur = ");
            int umur = s.nextInt();
            System.out.print("IPK = ");
            double ipk = s.nextDouble();
            System.out.println();

            Mahasiswa m = new Mahasiswa(nama, thn, umur, ipk);
            data.tambah(m);
        }
        System.out.println("Data Mahasiswa sebelum Sorting = ");
        data.tampil();
        System.out.println();
        
        System.out.println("Data Mahasiswa setelah sorting desc berdasarkan ipk");
        data.bubbleSort();
        data.tampil();
        System.out.println();
        
        System.out.println("Data Mahasiswa setelah sorting asc berdasarkan ipk");
        data.selectionSort();
        data.tampil();
        System.out.println();
        
        System.out.println("Data Setelah di Insertion Sort");
        data.insertionSort();
        data.tampil();
    }
}
