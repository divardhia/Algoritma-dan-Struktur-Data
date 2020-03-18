/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS X441MA
 */
public class DaftarHargaTiket {
    Tiket listTiket[] = new Tiket [3];
    int index;
    
    void tambah (Tiket m){
        if(index<listTiket.length){
            listTiket[index] = m;
            index++;
        }else{
            System.out.println("Data sudah Penuh");
        }
    }
    
    void tampil(){
        for(Tiket m : listTiket){
            m.tampil();
            System.out.println("-----------------");
        }
    }
    
    void bubbleSort(){
        for(int i=0; i<listTiket.length-1; i++){
            for(int j=1; j<listTiket.length-i; j++){
                if(listTiket[j].harga < listTiket[j-1].harga){
                    Tiket tmp = listTiket[j];
                    listTiket[j] = listTiket[j-1];
                    listTiket[j-1] = tmp;
                }
            }
        }
    }
    
    void selectionSort(){
        for(int i=0; i<listTiket.length-1; i++){
            int indexMin=i;
            for(int j=i+1; j<listTiket.length; j++){
                if(listTiket[j].harga < listTiket[indexMin].harga){
                    indexMin = j;
                }
            }
            Tiket tmp = listTiket[indexMin];
            listTiket[indexMin] = listTiket[i];
            listTiket[i] = tmp;
        }
    }
}
