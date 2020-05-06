/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasTiga;

import java.util.Scanner;

/**
 *
 * @author diva ardhia
 */
public class DoubleLinkedListsMain {

    static Scanner input = new Scanner(System.in);
    static DoubleLinkedLists dll = new DoubleLinkedLists();

    public static void menu() {
        System.out.println("\nDOUBLE LINK LIST DENGAN MENU");
        System.out.println("==============================");
        System.out.println("Menu : ");
        System.out.println("1.) Tambah Mahasiswa");
        System.out.println("2.) Hapus Mahasiswa");
        System.out.println("3.) Cetak Data Mahasiswa");
        System.out.println("4.) Keluar");
        System.out.println("==============================");
    }

    public static int select() {
        System.out.print(">> ");
        int in = input.nextInt();
        System.out.println("	");
        return in;
    }

    public static void proses() throws Exception {
        menu();
        switch (select()) {
            case 1:
                System.out.print("\nBanyak Mahasiswa : ");
                int many = input.nextInt();
                for (int i = 0; i < many; i++) {
                    System.out.print("\nMasukkan Nama : ");
                    String crash = input.nextLine();
                    String name = input.nextLine();
                    System.out.print("Masukkan Nilai : ");
                    int n = input.nextInt();
                    dll.addFirst(n, name);
                }
                break;
            case 2:
                dll.clear();
                break;
            case 3:

                dll.sortDescending();
                dll.print();
                dll.sortAscending();
                dll.print();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                proses();
        }
        proses();

    }

    public static void main(String[] args) throws Exception {
        proses();
    }
}
