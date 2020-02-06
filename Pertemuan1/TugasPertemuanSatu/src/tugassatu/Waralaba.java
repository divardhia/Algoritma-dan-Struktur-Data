/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugassatu;
import java.util.Scanner;
/**
 *
 * @author ASUS X441MA
 */
public class Waralaba {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Menu Paket Restoran Waralaba");
        System.out.println("1. Paket Chicken");
        System.out.println("2. Paket Oke");
        System.out.print("Pilih Salah Satu Paket : ");
        int paket=sc.nextInt();
        switch (paket){
            case 1:
                int harga1=12000, harga2=15000, harga3=20000;
                System.out.println("Menu Paket Chicken");
                System.out.println("1. Chicken A (Rp 12.000)");
                System.out.println("2. Chicken B (Rp 15.000)");
                System.out.println("3. Chicken C (Rp 20.000)");
                System.out.print("Pilih Menu yang ingin di beli : ");
                int menu1 = sc.nextInt();
                if (menu1==1){
                    System.out.print("Masukkan Jumlah Pembelian : ");
                    int jumlah=sc.nextInt();
                    int total = harga1*jumlah;
                    System.out.println("Paket Chicken");
                    System.out.println(jumlah +" Menu Chicken A");
                    System.out.println("Total = Rp " +total);
                }
                else if (menu1==2){
                    System.out.print("Masukkan Jumlah Pembelian : ");
                    int jumlah=sc.nextInt();
                    int total = harga2*jumlah;
                    System.out.println("Paket Chicken");
                    System.out.println(jumlah +" Menu Chicken B");
                    System.out.println("Total = Rp " +total);
                }
                else if (menu1==3){
                    System.out.print("Masukkan Jumlah Pembelian : ");
                    int jumlah=sc.nextInt();
                    int total = harga3*jumlah;
                    System.out.println("Paket Chicken");
                    System.out.println(jumlah +" Menu Chicken C");
                    System.out.println("Total = Rp " +total);
                }
                break;
            case 2:
                int harga4=10000, harga5=12000, harga6=15000;
                System.out.println("Menu Paket Chicken");
                System.out.println("1. Oke A (Rp 10.000)");
                System.out.println("2. Oke B (Rp 12.000)");
                System.out.println("3. Oke C (Rp 15.000)");
                System.out.print("Pilih Menu yang ingin di beli : ");
                int menu2 = sc.nextInt();
                if (menu2==1){
                    System.out.print("Masukkan Jumlah Pembelian : ");
                    int jumlah=sc.nextInt();
                    int total = harga4*jumlah;
                    System.out.println("Paket Oke");
                    System.out.println(jumlah +" Menu Oke A");
                    System.out.println("Total = Rp " +total);
                }
                else if (menu2==2){
                    System.out.print("Masukkan Jumlah Pembelian : ");
                    int jumlah=sc.nextInt();
                    int total = harga5*jumlah;
                    System.out.println("Paket Oke");
                    System.out.println(jumlah +" Menu Oke B");
                    System.out.println("Total = Rp " +total);
                }
                else if (menu2==3){
                    System.out.print("Masukkan Jumlah Pembelian : ");
                    int jumlah=sc.nextInt();
                    int total = harga6*jumlah;
                    System.out.println("Paket Oke");
                    System.out.println(jumlah +" Menu Oke C");
                    System.out.println("Total = Rp " +total);
                }
                }
        }
    }
