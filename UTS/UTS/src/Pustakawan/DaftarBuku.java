/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pustakawan;

/**
 *
 * @author HP 14-BW005AU
 */
public class DaftarBuku {
    Pustakawan listBuku[] = new Pustakawan[4];
    int idx;
    public int[] data;
    public int jumData = 4;
    
    void Searching(int[] Data, int jmlData) {
        this.jumData = jmlData;
        data = new int[jmlData];
        for (int i = 0; i < jumData; i++) {
            data[i] = Data[i];
        }
    }
    
    void tambah(Pustakawan b){
        if(idx<listBuku.length){
            listBuku[idx] = b;
            idx++;
        } else{
            System.out.println("Data sudah penuh");
        }
    }
    
    void tampil(){
        for(Pustakawan b : listBuku){
            b.tampil();
            System.out.println();
        }
    }
    
    void bubbleSort(){
        for(int i=0; i<listBuku.length-1; i++){
            for (int j=1; j<listBuku.length-i; j++){
                if(listBuku[j].tinggiBuku < listBuku[j-1].tinggiBuku){
                    Pustakawan tmp = listBuku[j];
                    listBuku[j] = listBuku[j-1];
                    listBuku[j-1] = tmp;
                }
            }
        }
    }
    
    void TampilData() {
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    int FindBinarySearch(int cari,int data[], int left, int right) {
        int mid;
        if (right >= left) {
            mid = (int) ((left + right) / 2);
            if (cari == data[mid]) {
                return (mid);
            } else if (data[mid] > cari) {
                return FindBinarySearch(cari, data, left, mid - 1);
            } else {
                return FindBinarySearch(cari,data, mid + 1, right);
            }
        }
        return -1;
    }
    
    void Tampilpoisisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
}
