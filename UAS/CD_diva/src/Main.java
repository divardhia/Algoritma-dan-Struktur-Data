
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP 14-BW005AU
 */
public class Main {

    public static void menu() {
        System.out.println("\nMENU CD");
        System.out.println("==============================");
        System.out.println("memilih menu : ");
        System.out.println("1.) CD Masuk");
        System.out.println("2.) CD Keluar");
        System.out.println("3.) CD Rusak");
        System.out.println("4.) Tampilkan Semua Data");
        System.out.println("5.) Cari");
        System.out.println("6.) Exit");
        System.out.println("7.) Tampilkan Semua Data");
        System.out.println("8.) Cari");
        System.out.println("9.) Exit");
        System.out.println("==============================");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        DoubleLinkedList dll = new DoubleLinkedList();
        int pilih;
        try {
            do {
                menu();
                System.out.print("Masukkan Pilihan Anda : ");
                pilih = input.nextInt();
                switch (pilih) {
                    case 1:
                        System.out.print("kode : ");
                        int kode = input.nextInt();
                        System.out.print("Judul : ");
                        String judul = s.nextLine();
                        System.out.print("Distributor : ");
                        String distributor = s.nextLine();
                        System.out.print("Jumlah stok : ");
                        int stok = input.nextInt();
                        System.out.print("Jumlah rusak : ");
                        int rusak = input.nextInt();
                        dll.addFirst(kode, judul, distributor, stok, rusak);
                        break;
                    case 2:
                        System.out.print("Masukkan Indeks : ");
                        int dell = input.nextInt();
                        dll.remove(dell);
                        break;
                    case 3:
                        System.out.print("Masukkan index CD rusak : ");
                        int indeks = input.nextInt();
                        System.out.print("kode : ");
                        kode = input.nextInt();
                        System.out.print("Judul : ");
                        judul = s.nextLine();
                        System.out.print("Distributor : ");
                        distributor = s.nextLine();
                        System.out.print("Jumlah stok : ");
                        stok = input.nextInt();
                        System.out.print("Jumlah rusak : ");
                        rusak = input.nextInt();
                        dll.add(indeks, kode, judul, distributor, stok, rusak);
                        break;
                    case 4:
                        dll.print();
                        break;
                    case 5:
                        System.out.print(
                                "Masukkan data yang ingin dicari: ");
                        int search = input.nextInt();
                        dll.getValue(search);
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                }

            } while (pilih != 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
